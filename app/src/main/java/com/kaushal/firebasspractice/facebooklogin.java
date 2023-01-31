package com.kaushal.firebasspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class facebooklogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebooklogin);
       getSupportActionBar().hide();
    }
}