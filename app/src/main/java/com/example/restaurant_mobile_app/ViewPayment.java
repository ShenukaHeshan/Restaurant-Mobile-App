package com.example.restaurant_mobile_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ViewPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_payment);
        setTitle("View Payment Details");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}