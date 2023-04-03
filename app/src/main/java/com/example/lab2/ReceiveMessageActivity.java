package com.example.lab2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ReceiveMessageActivity", "onCreate()");
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}