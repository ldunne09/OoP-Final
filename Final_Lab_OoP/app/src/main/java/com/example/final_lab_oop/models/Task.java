package com.example.final_lab_oop.models;



import android.widget.Adapter;

import com.example.final_lab_oop.views.TestAdapter;

import java.io.File;
import java.lang.reflect.Array;

import static java.util.logging.Logger.global;

public class Task {

        private String name;
        private String description;
        private int coins;

        public Task(String name, String description, int coins) {
            setName(name);
            setDescription(description);
<<<<<<< HEAD
            setCoins(coins);
=======

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
>>>>>>> 079a50f9c987b7dd5382a9437b352e46d98de335
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

        public int getCoins() {
            return coins;
        }

        public void setCoins(int coins) {
            this.coins = coins;
        }
<<<<<<< HEAD
    }
=======

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
>>>>>>> 079a50f9c987b7dd5382a9437b352e46d98de335
