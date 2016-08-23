package com.example.yogeshpatil.imeidemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TelephonyManager tel;
    TextView imei;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tel = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        imei = (TextView) findViewById(R.id.textView2);
        imei.setText(tel.getDeviceId().toString());
    }
}