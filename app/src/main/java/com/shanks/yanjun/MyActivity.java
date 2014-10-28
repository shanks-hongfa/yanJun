package com.shanks.yanjun;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import com.shanks.yanjun.zepto.Node;
import com.shanks.yanjun.zepto.Shanks;
import com.shanks.yanjun.zepto.YanJun;

import java.util.Map;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
//        Shanks shanks=new Shanks(this);
//        shanks.$(R.id.action_settings);
//        Node node=new Node(this,R.id.action_settings);
//        node.text("aa");
//        node.click(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //
//            }
//        });

       // node.click("onCreateOptionsMenu",Menu.class));
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);

            Shanks shanks=new Shanks(getActivity(),rootView);
            shanks.$(R.id.text).click(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            shanks.startActivity(MyActivity.class);
            return rootView;
        }
    }
}
