package com.example.broadcastreceiver_jaafar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BootReceiver receiver = new BootReceiver();
        IntentFilter filter = new IntentFilter(Intent.ACTION_BOOT_COMPLETED);
        //IntentFilter filter = new IntentFilter(Intent.ACTION_BOOT_COMPLETED);
        registerReceiver(receiver, filter);

    }
}