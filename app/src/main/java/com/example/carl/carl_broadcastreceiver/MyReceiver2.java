package com.example.carl.carl_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
/***
 * 动态注册的receiver
 * */
public class MyReceiver2 extends BroadcastReceiver {
    private String TAG = "CARL";
    public MyReceiver2() {
        Log.i(TAG,"MyReceiver2()");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action =intent.getStringExtra("action");
        Log.i(TAG,"MyReceiver2 onReceive:"+action);
    }
}
