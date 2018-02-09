package com.bitcamp.app.scheduler;

import android.icu.text.SimpleDateFormat;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    String date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView today = findViewById(R.id.today);
        final CalendarView calendar = findViewById(R.id.calendar);
        final TimePicker clock = findViewById(R.id.clock);
        final TextView year = findViewById(R.id.year);
        final TextView month = findViewById(R.id.month);
        final TextView day = findViewById(R.id.day);
        final TextView hour = findViewById(R.id.hour);
        final TextView min = findViewById(R.id.min);
        clock.setVisibility(View.INVISIBLE);
        SimpleDateFormat tmp = new SimpleDateFormat("yyyy-MM-dd hh시mm분");
        today.setText(tmp.format(new Date()));
        findViewById(R.id.dateBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setVisibility(View.VISIBLE);
                clock.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.timeBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setVisibility(View.INVISIBLE);
                clock.setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.reservationBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] arr = date.split("-");
                year.setText(arr[0]);
                month.setText(arr[1]);
                day.setText(arr[2]);
                hour.setText(String.valueOf(clock.getHour()));
                min.setText(String.valueOf(clock.getMinute()));
            }
        });
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int day) {
                date = year + "-" + (month+1) + "-" + day;
            }
        });

    }
}
