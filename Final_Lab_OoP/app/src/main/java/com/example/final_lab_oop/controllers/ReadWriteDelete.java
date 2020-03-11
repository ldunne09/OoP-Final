package com.example.final_lab_oop.controllers;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.final_lab_oop.models.*;

import java.io.*;
import java.util.*;

public class ReadWriteDelete implements java.io.Serializable {

    public static void saveTask(ArrayList<Task> tasks, Context context) {
        try {
            FileOutputStream fileStream = new FileOutputStream(new File(context.getFilesDir(), "tasks.txt"));
            ObjectOutputStream outputStream = new ObjectOutputStream(fileStream);

            outputStream.writeObject(tasks);
            outputStream.close();
            fileStream.close();
        } catch (IOException ioe) {

            System.out.println("Error!");
        }
    }

    public static ArrayList<Task> readTask(Context context) {
        try {
            FileInputStream fileStream = new FileInputStream(new File(context.getFilesDir(), "tasks.txt"));
            ObjectInputStream inputStream = new ObjectInputStream(fileStream);

            return (ArrayList<Task>) (inputStream.readObject());
        } catch (IOException ioe) {
            return null;
        } catch (ClassNotFoundException cnfe) {
            return null;
        }
    }

    public static void saveCoins(int coins) {
        try {
            FileWriter writer = new FileWriter("test/coins.txt");
            writer.write(coins);
            writer.close();
        } catch (IOException ioe) {
            System.out.println("File couldn't be saved.");
        }
    }

    public static int readCoins() {
        try {
            FileReader reader = new FileReader("coins.txt");
            BufferedReader boof = new BufferedReader(reader);
            int coins = Integer.parseInt(boof.readLine());
            reader.close();
            return coins;
        } catch (IOException ioe) {
            return -1;
        }
    }
}
