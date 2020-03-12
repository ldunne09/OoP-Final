package com.example.final_lab_oop.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.final_lab_oop.R;
import com.example.final_lab_oop.controllers.AppController;

import java.io.Serializable;
import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

    private Context context;

    private AppController appController;

    public TaskAdapter(Context context, AppController appController){
        this.context = context;
        this.appController = appController;
    }

    //This ia actually
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);
        return new ViewHolder(v);
    }

    //This populates the array with items that we want to use
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Task currentTask = appController.getTask(position);
        holder.titleTV.setText(currentTask.getName());
        holder.descriptionTV.setText(currentTask.getDescription());
        holder.bountyTV.setText(currentTask.getCoins() + "");
    }




    //This then determines how many rows will be shown on the screen
    @Override
    public int getItemCount() {
        return appController.getTasks().size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView titleTV;
        public TextView descriptionTV;
        public TextView bountyTV;


        public ViewHolder(View itemView) {
            super(itemView);
            titleTV = itemView.findViewById(R.id.titleTV);
            descriptionTV = itemView.findViewById(R.id.descriptionTV);
            bountyTV = itemView.findViewById(R.id.bountyTV);
        }
    }
}
