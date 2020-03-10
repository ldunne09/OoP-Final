package com.example.final_lab_oop.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.final_lab_oop.R;

public class ThemesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);

        //Change back arrow to X
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close);
    }
}
