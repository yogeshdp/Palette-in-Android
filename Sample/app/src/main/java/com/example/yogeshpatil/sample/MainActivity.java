package com.example.yogeshpatil.sample;

import android.nfc.TagLostException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);

        Subclass obj = new Subclass();

        tv.setText(obj.display());
    }
}

class Subclass{

    String str = "This id subclass event";

    String display(){
        return str;
    }
}
