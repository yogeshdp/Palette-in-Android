package com.example.yogeshpatil.togglebuttondemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tgbutton;
    private Activity activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;

        tgbutton = (ToggleButton) findViewById(R.id.toggleButton);
        tgbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (tgbutton.isChecked()) {

                    Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(getApplicationContext(), "UnChecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        /*
         *  //To set Toggle button checked/unchecked
          tgbutton.setChecked(true); */

        /*
         * To set text on toggle button whenever it is having
            a state either ON or OFF
         */
        //tgbutton.setTextOn(&quot;Hi&quot;);
        // tgbutton.setTextOff(&quot;Hello&quot;);

    }
}