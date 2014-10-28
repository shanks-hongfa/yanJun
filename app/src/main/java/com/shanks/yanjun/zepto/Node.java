package com.shanks.yanjun.zepto;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by shanksYao on 10/27/14.
 */
public class Node {
    private View view;

    public Node(View view) {
        this.view = view;
    }
    public Node(Activity activity,int id){
        this.view=activity.findViewById(id);
    }
    public Node(View root,int id){
        this.view=root.findViewById(id);
    }
    public void click(View.OnClickListener listener){
        this.view.setOnClickListener(listener);
    }

    public void click(Method listener){
        try {
            listener.invoke(view,listener);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void text(CharSequence text){
        if(view instanceof TextView){
            ((TextView)(view)).setText(text);
        }else{
            throw new RuntimeException("view is not textView!");
        }
    }
    public CharSequence text(){
        if(view instanceof TextView){
           return ((TextView)(view)).getText();
        }else{
           throw new RuntimeException("view is not textView!");
        }
    }

}
