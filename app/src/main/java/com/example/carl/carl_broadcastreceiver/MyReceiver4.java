package com.example.carl.carl_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/***
 * 静态注册的receiver
 * */
public class MyReceiver4 extends BroadcastReceiver {
    private String TAG = "CARL";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG,"MyReceiver4 onReceive");
        //中断广播
        abortBroadcast();
    }
}
