package com.example.final_lab_oop.models;

import androidx.appcompat.app.AppCompatActivity;

public class User extends AppCompatActivity {

    private String name;
    private String password;
    private int exp;
    private int lvl;

    public User(String name, String password, int exp, int lvl) {
        this.name = name;
        this.password = password;
        this.exp = exp;
        this.lvl = lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
