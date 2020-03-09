package com.example.final_lab_oop.controllers;

import android.widget.EditText;

import com.example.final_lab_oop.models.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class ReadWriteDelete implements java.io.Serializable {

    public static User[] addUser(User[] users, User user)
    {
        List<User> userList = new ArrayList<User>(Arrays.asList(users));
        userList.add(user);
        users = userList.toArray(users);

        // return the array
        return users;
    }

    public static void newUser(User[] users, User user, String name, String password) {
        addUser(users, user);
        user.setName(name);
        user.setPassword(password);
        user.setExp(0);
        user.setLvl(0);

        String filename = user.getName() + ".usr";

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(user);

            out.close();
            file.close();
        } catch(IOException ioe)  {
            System.out.println("IO thing borken.");
        }
    }

    public static void write(User user, int exp, int lvl) {
        user.setExp(exp);
        user.setLvl(lvl);
    }

    public static void read(User user) {
        String name = user.getName();
        String password = user.getPassword();
        int exp = user.getExp();
        int lvl = user.getLvl();

        User userToPrint = null;

        try {
            FileInputStream file = new FileInputStream(user.getName() + ".usr");
            ObjectInputStream in = new ObjectInputStream(file);

            userToPrint = (User) in.readObject();

            in.close();
            file.close();

            System.out.println("name" + userToPrint.getName());
            System.out.println("password" + userToPrint.getPassword());
            System.out.println("level" + userToPrint.getLvl());
            System.out.println("experience" + userToPrint.getExp());
        } catch(IOException ioe) {
            System.out.println("IO thing borken.");
        } catch(ClassNotFoundException cnfe) {
            System.out.println("Class thing borken.");
        }
    }

    public static void delete(User user) {
        try {
            FileInputStream file = new FileInputStream(user.getName() + ".txt");
            ObjectInputStream in = new ObjectInputStream(file);
            
        } catch(FileNotFoundException fnfe) {
            System.out.println("No find file");
        } catch(IOException ioe) {
            System.out.println("IO thing borken.");
        }
    }
}
