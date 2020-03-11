package com.example.final_lab_oop.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.final_lab_oop.R;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder> {

    private Context context;

    private String[] nameColor;
    private String[] cost;
    private int[] colors;


    public ShopAdapter(Context context, String[] nameColor, String[] cost, int[] colors){
        this.context = context;
        this.nameColor = nameColor;
        this.cost = cost;
        this.colors = colors;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_item, parent, false);
        return new ViewHolder(v);
    }

    //This populates the array with items that we want to use
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.colorTV.setText(nameColor[position]);
        holder.purchaseBtn.setText(cost[position]);
        holder.colorImage.setBackgroundColor(colors[position]);
    }

    //This then determines how many rows will be shown on the screen
    @Override
    public int getItemCount() {
        return 3;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView colorTV;
        public Button purchaseBtn;
        public ImageView colorImage;

        public ViewHolder(View itemView) {
            super(itemView);
            colorTV = itemView.findViewById(R.id.titleTV);
            purchaseBtn = itemView.findViewById(R.id.purchaseButton);
            colorImage = itemView.findViewById(R.id.colorImage);
        }
    }
}
