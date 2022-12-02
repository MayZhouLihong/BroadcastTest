package com.may.broadcasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    private NetworkChangeReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        IntentFilter intentFilter=new IntentFilter();
//        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
//        receiver = new NetworkChangeReceiver();
//        registerReceiver(receiver,intentFilter);
        Button btnSend = findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.may.broadcasttest.MY_BROADCAST");
                intent.setComponent(new ComponentName("com.may.broadcasttest","com.may.broadcasttest.MyBroadcastReceiver"));
                sendBroadcast(intent);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        unregisterReceiver(receiver);
    }


//    class NetworkChangeReceiver extends BroadcastReceiver {
//        @Override
//        public void onReceive(Context context, Intent intent) {
////        Toast.makeText(context,"网络已发生变化",Toast.LENGTH_LONG).show();
//            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
//            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
//            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
//                Toast.makeText(context,"网络可用",Toast.LENGTH_LONG).show();
//            }else{
//                Toast.makeText(context,"网络不可用",Toast.LENGTH_LONG).show();
//
//            }
//        }
//    }
}