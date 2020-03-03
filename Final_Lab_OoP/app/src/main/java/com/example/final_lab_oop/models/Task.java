package com.example.final_lab_oop.models;



import java.lang.reflect.Array;

    public class Task {

        private static final int BASE_EXP;

        private int level;
        private int multiplier;
        private String name;
        private String description;
        private Array taskHolder;
        private Prioroty priority;


        public Task(int level, int multiplier, String name, String description,) {
            setLevel(level);
            setMultiplier(multiplier);
            setName(name);
            setDescription(description);

        }

        public int expGained(int exp, int level) {
        }




        public static int getExp() {
            return exp;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
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

        public Priority getPriority() {
            return priority;
        }

        public void setPriority(Priority priority) {
            this.priority = priority;
        }
}
