package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Welcome home, sir.");
    }

    public void identificationCheck(View view) {
        Intent goToBatcave = new Intent(this, SecondActivity.class);
        startActivity(goToBatcave);
    }
}
