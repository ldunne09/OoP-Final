package com.example.final_lab_oop.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_lab_oop.R;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private Context context;

    public TestAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }







    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView colorTV;
        public Button purchaseBtn;
        public ImageView colorImage;

        public ViewHolder(View itemView) {
             super(itemView);

             colorTV = itemView.findViewById(R.id.colorTV);
             purchaseBtn = itemView.findViewById(R.id.purchaseButton);
             colorImage = itemView.findViewById(R.id.colorImage);
        }
    }
}
