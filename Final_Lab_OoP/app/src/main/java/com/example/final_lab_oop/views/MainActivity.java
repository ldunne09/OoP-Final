package com.example.final_lab_oop.views;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.Toast;

import com.example.final_lab_oop.R;
import com.example.final_lab_oop.controllers.AppController;
import com.example.final_lab_oop.controllers.ReadWriteDelete;
import com.example.final_lab_oop.models.Task;
import com.example.final_lab_oop.models.TaskAdapter;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    //Toast.makeText(this, "All notes deleted", Toast.LENGTH_SHORT).show();

    private AppController appController;
    private RecyclerView recyclerView;
    private TaskAdapter taskAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appController = new AppController(this);

        recyclerView = findViewById(R.id.noteRecycleView);

        taskAdapter = new TaskAdapter(this, appController);

        recyclerView.setAdapter(taskAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {

        taskAdapter.notifyDataSetChanged();
    }


    public void goToAddNote(View v)
    {
        Intent intent = new Intent(this, AddNoteActivity.class);
        intent.putExtra("AppController", appController);
        startActivity(intent);
    }

    public void goToThemes()
    {
        Intent intent = new Intent(this, ThemesActivity.class);
        startActivity(intent);
    }

    public void goToShop()
    {
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }

    public void clearList(){
        appController.clearTasks(this);
        taskAdapter.notifyDataSetChanged();
    }

    public void refreshList(){

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mainmenu_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.clear_list:
                clearList();
                Toast.makeText(this, "Task Deleted", Toast.LENGTH_SHORT).show();
                return true;
            //Go To Themes Page
            case R.id.my_themes:
                goToThemes();
                return true;
            //Go To Shop
            case R.id.view_shop:
                goToShop();
                return true;
            case R.id.refresh :
                refreshList();
                return true;
            default:
                return super.onOptionsItemSelected(item); //Fancy way of saying return false
        }
    }
}


