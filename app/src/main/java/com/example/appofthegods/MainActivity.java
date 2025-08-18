package com.example.appofthegods;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.view.Gravity;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Simple UI for now: just a centered "Hello App Of The Gods"
        TextView textView = new TextView(this);
        textView.setText("Hello, App Of The Gods!");
        textView.setTextSize(24);
        textView.setTextColor(Color.WHITE);
        textView.setGravity(Gravity.CENTER);

        setContentView(textView);
    }
  }
