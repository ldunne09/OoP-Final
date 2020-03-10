package com.example.final_lab_oop.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.final_lab_oop.R;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        configureNextButton();
    }

    public void configureNextButton(){
        //sets "loadUserBtn" variable to the button
        Button loadUserBtn = (Button) findViewById(R.id.loadUserBtn);

        //setting this listener will make it go the a new activity
        loadUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuActivity.this, PasswordEntryActivity.class));
            }
        });

    }

    public void onClickNewUser(View view) {

    }

    public void onClickLoadUser(View view) {

    }
}
