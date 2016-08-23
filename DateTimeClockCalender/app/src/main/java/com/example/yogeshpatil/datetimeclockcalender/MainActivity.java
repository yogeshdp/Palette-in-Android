package com.example.yogeshpatil.datetimeclockcalender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextClock;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TextClock textClock;
    AnalogClock analogClock;
    DatePicker datePicker;
    TimePicker timePicker;
    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textClock = (TextClock) findViewById(R.id.textClock);
        analogClock = (AnalogClock) findViewById(R.id.analogClock);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
    }
}
