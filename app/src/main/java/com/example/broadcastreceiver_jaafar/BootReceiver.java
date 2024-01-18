package com.example.broadcastreceiver_jaafar;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class BootReceiver extends BroadcastReceiver {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Boot Completed", Toast.LENGTH_LONG).show();
    }
}