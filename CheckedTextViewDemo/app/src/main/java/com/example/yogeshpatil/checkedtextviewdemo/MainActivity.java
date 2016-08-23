package com.example.yogeshpatil.checkedtextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    String value;
    String[] superStarNames = {"John Cena", "Randy Orton", "Triple H", "Roman Reign", "Sheamus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate a ListView
        ListView listView = (ListView) findViewById(R.id.listView);
        // set the adapter to fill the data in ListView
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), superStarNames);
        listView.setAdapter(customAdapter);
    }


}