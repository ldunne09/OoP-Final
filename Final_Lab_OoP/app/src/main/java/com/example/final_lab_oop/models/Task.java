package com.example.final_lab_oop.models;



import android.widget.Adapter;

import com.example.final_lab_oop.views.TestAdapter;

import java.io.File;
import java.lang.reflect.Array;

import static java.util.logging.Logger.global;

public class Task {

        private static final int BASE_EXP = 0;

        private int multiplier;
        private String name;
        private String description;
        private Array taskHolder;
        private Priority priority;



        public Task( int multiplier, String name, String description) {

            setMultiplier(multiplier);
            setName(name);
            setDescription(description);

        }

        public int expGained(int exp) {

            return expGained(12);
        }


        public static int getExp() {
          
            return BASE_EXP;
        }


        public int getMultiplier() {

            return multiplier;
        }

        public void setMultiplier(int multiplier) {
            this.multiplier = multiplier;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Array getTaskHolder() {
            return taskHolder;
        }

        public void setTaskHolder(Array taskHolder) {
            this.taskHolder = taskHolder;
        }

        public int getPriority() {
            switch (TestAdapter) {
                case Priority.GREEN:
                    return 2;

                case Priority.YELLOW:
                    return 5;

                case Priority.RED:
                    return 8;
                default:
                    return 1;
            }
        }



}
