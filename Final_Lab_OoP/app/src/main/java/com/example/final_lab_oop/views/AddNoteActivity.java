package com.example.final_lab_oop.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.final_lab_oop.R;

public class AddNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        //Change back arrow to X
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close);
    }

    //Creates save item on the top right
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.saveitem_bar, menu);
        return true;
    }

    //Checks which item was clicked
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.save_note:
                //Save all Configuration Settings
                saveTask();
                return true;
            default:
                return super.onOptionsItemSelected(item); //Fancy way of saying return false
        }
    }

    //Actually Saves Task
    public void saveTask()
    {
        //Connect to backend

        finish();
    }
}
