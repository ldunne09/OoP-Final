package com.example.final_lab_oop.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.final_lab_oop.R;

public class MainActivity extends AppCompatActivity {
    //Toast.makeText(this, "All notes deleted", Toast.LENGTH_SHORT).show();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToAddNote(View v)
    {
        Intent intent = new Intent(this, AddNoteActivity.class);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mainmenu_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.my_themes:
                //Go To Themes Page
                goToThemes();
                return true;
            case R.id.view_shop:
                //Go To Shop
                goToShop();
                return true;
            default:
                return super.onOptionsItemSelected(item); //Fancy way of saying return false
        }
    }
}


