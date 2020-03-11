package com.example.final_lab_oop.views;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_lab_oop.R;

public class ShopActivity extends AppCompatActivity {

    private RecyclerView recycleView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter testAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        //Change back arrow to X
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close);

        recycleView = findViewById(R.id.recycleView);
        recycleView.setLayoutManager(layoutManager);

        testAdapter = new TestAdapter(this);
        recycleView.setAdapter(testAdapter);

        recycleView.setLayoutManager(new LinearLayoutManager(this));
    }


}
