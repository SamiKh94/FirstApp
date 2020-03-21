package com.gdg.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

public class RandomNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);

        int value = getIntent().getIntExtra("EXTRA_VALUE", -1);
        Log.d("PassedValue", value + "");
        Random random = new Random();
        int randomNumber = random.nextInt(value);
        ((TextView) findViewById(R.id.random_number)).setText(String.format("%s", randomNumber));
    }
}
