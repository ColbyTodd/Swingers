package com.uottawa.colbytodd.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnLoginButton(View view) {
        //Application Context and Activity
        Intent intent = new Intent(getApplicationContext(), DataDisplay.class);
        startActivity(intent);
    }
}