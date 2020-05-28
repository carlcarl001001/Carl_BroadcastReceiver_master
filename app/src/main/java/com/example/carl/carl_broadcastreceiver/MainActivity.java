package com.example.carl.carl_broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyReceiver2 receiver2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnRegistBR(View view) {
        if (receiver2==null) {
            receiver2 = new MyReceiver2();

            IntentFilter filter = new IntentFilter("com.example.carl.carl_broadcastreceiver.MyReceiver1.action");

            registerReceiver(receiver2, filter);
            Toast.makeText(this, "注册完成", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "已经注册过了", Toast.LENGTH_LONG).show();
        }
    }

    public void OnUnregistBR(View view) {
        if(receiver2!=null){
            unregisterReceiver(receiver2);
            receiver2 = null;
            Toast.makeText(this, "解注册成功", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "还没有注册过", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (receiver2!=null) {
            unregisterReceiver(receiver2);
            receiver2 = null;
        }
    }
}
