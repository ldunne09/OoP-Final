package com.example.final_lab_oop.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.final_lab_oop.R;
import com.example.final_lab_oop.controllers.AppController;
import com.example.final_lab_oop.controllers.ReadWriteDelete;
import com.example.final_lab_oop.models.Task;
import com.example.final_lab_oop.models.TaskAdapter;

public class AddNoteActivity extends AppCompatActivity {

    private AppController appController;

    //I added this in
    private TaskAdapter taskAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        //Change back arrow to X
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close);

        //Gets intent from MainActivity
        Intent intent = getIntent();

        //casted to an appcCntroller to an object
        appController = (AppController) intent.getSerializableExtra("AppController");
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
                Toast.makeText(this, "Saved Task", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item); //Fancy way of saying return false
        }
    }



    //Actually Saves Task
    public void saveTask() {


        EditText titleET = findViewById(R.id.titleET);
        EditText descriptionET = findViewById(R.id.descriptionET);
        RadioButton greenBtn = findViewById(R.id.greenButton);
        RadioButton redBtn = findViewById(R.id.redButton);
        RadioButton yellowBtn = findViewById(R.id.yellowButton);

        int coins = 0;
        if (greenBtn.isChecked()) {
            coins = 2;
        } else if (redBtn.isChecked()) {
            coins = 8;
        } else if (yellowBtn.isChecked()) {
            coins = 5;
        }

        String name = titleET.getText().toString();

        String description = descriptionET.getText().toString();

        Task task = new Task(name, description, coins);
        //Adds it to an array list

        appController.addTask(task);

        ReadWriteDelete.saveTask(appController.getTasks(), this);
        setResult(1);
        finish();

    }
}
