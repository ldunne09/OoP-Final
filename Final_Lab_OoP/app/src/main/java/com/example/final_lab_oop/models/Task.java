package com.example.final_lab_oop.models;



import java.lang.reflect.Array;

    public class Task {

        private String name;
        private String description;
        private int coins;

        public Task(String name, String description, int coins) {
            setName(name);
            setDescription(description);
            setCoins(coins);
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
    }
