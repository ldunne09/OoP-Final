package com.example.final_lab_oop.views;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_lab_oop.R;
import com.example.final_lab_oop.models.ShopAdapter;

public class ShopActivity extends AppCompatActivity {

    private RecyclerView recycleView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter shopAdapter;


    //Hard Coded Shop items
    private String[] nameColor = {"Red", "Blue", "Green"};
    private String[] cost = {"60", "60","60"};
    private int[] colors = {Color.RED, Color.BLUE,Color.GREEN};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        //Change back arrow to X
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close);

        recycleView = findViewById(R.id.recycleView);
        recycleView.setLayoutManager(layoutManager);

        shopAdapter = new ShopAdapter(this, nameColor, cost, colors);
        recycleView.setAdapter(shopAdapter);

        recycleView.setLayoutManager(new LinearLayoutManager(this));
    }


}
