package com.shanks.yanjun.zepto;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/**
 * Created by shanksYao on 10/27/14.
 */
public class YanJun extends Activity{

    private View view;
    private YanJun yanJun;
    private Activity activity;
    private YanJun(Activity activity,int id){
        view=activity.findViewById(id);
        this.activity=activity;
    }

    public  View $(int id){
        return findViewById(id);
    }
    public void click(View.OnClickListener listener){

    }

    public void startActivity(Class clazz){
        if(activity!=null){
            Intent intent=new Intent();
            intent.setClass(activity,clazz);
            activity.startActivity(intent);
        }
    }

}
