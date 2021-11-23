package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mycolors.ApplyColors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApplyColors.simpleToast(this,"sai srinivas");
    }
}