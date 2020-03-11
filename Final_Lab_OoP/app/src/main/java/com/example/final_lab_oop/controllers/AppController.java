package com.example.final_lab_oop.controllers;

import android.content.Context;

import com.example.final_lab_oop.models.Task;

import java.io.Serializable;
import java.util.ArrayList;

public class AppController implements Serializable{

    private ArrayList<Task> tasks;
    private int coins;

    public AppController(Context context)
    {
        tasks = ReadWriteDelete.readTask(context);
        if(tasks == null)
            tasks = new ArrayList<>();
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void clearTasks(Context context)
    {
        tasks.clear();
        ReadWriteDelete.saveTask(tasks, context);
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }



}
