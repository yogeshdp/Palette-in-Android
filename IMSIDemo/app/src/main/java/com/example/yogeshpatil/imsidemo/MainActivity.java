package com.example.yogeshpatil.imsidemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    TelephonyManager tel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView2);
        tel = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        text.setText(tel.getSubscriberId().toString());
    }
}
