package com.example.final_lab_oop.controllers;

import com.example.final_lab_oop.models.Task;

public class AppController {

    public void saveTask(Task task)
    {
        ReadWriteDelete.write();
    }

}
