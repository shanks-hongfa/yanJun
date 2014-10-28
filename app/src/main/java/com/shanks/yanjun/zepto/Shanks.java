package com.shanks.yanjun.zepto;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shanks.yanjun.R;

/**
 * Created by shanksYao on 10/27/14.
 */
public class Shanks {


    public Shanks(Activity activity) {
        this.activity = activity;

    }
    public Shanks(Activity activity,View view) {
        this.activity = activity;
        this.root=view;
    }
    public Shanks(Activity activity,int id,ViewGroup container,LayoutInflater inflater) {
        this.activity = activity;
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);
        this.root=rootView;
    }

    public Shanks(View view) {
        this.root = view;
    }

    private Activity activity;
    private View root;

    public Node $(int id) {
        if (root != null)
            return new Node(root.findViewById(id));
        else if (activity != null)
            return new Node(activity.findViewById(id));
        else
            throw new RuntimeException("activity or root must be set!");

    }
    public Node id(int id){
        return $(id);
    }
    public void startActivity(Class clazz){
        if(activity!=null){
            Intent intent=new Intent();
            intent.setClass(activity,clazz);
            activity.startActivity(intent);
        }else
            throw new RuntimeException("activity  must be set!");
    }




}
