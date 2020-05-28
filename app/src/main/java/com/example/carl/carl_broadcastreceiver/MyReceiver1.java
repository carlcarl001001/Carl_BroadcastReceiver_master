package com.example.carl.carl_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/***
 * 静态注册的receiver
 * */
public class MyReceiver1 extends BroadcastReceiver {
    private String TAG = "CARL";

    public MyReceiver1() {
        Log.i(TAG,"MyReceiver1()");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action =intent.getStringExtra("action");
        Log.i(TAG,"MyReceiver1 onReceive:"+action);
    }
}
