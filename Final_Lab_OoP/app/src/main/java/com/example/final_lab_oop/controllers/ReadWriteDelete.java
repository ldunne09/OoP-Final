package com.example.final_lab_oop.controllers;

import com.example.final_lab_oop.models.*;

import java.io.*;
import java.util.*;

public class ReadWriteDelete implements java.io.Serializable {

    //Not Using
    public static User[] addUser(User[] users, User user)
    {
        List<User> userList = new ArrayList<User>(Arrays.asList(users));
        userList.add(user);
        users = userList.toArray(users);

        // return the array
        return users;
    }

    //Not Using
    public static void newUser(User[] users, User user, String name, String password) {
        addUser(users, user);
        user.setName(name);
        user.setPassword(password);
        user.setExp(0);

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

    public static void write(User user, String name, String password, int exp) {
        user.setName(name);
        user.setPassword(password);
        user.setExp(exp);
    }

    public static void read(User user) {
        String name = user.getName();
        String password = user.getPassword();
        int exp = user.getExp();

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
            emptyFile(user);
            deleteFile(user);

        } catch(FileNotFoundException fnfe) {
            System.out.println("No find file");
        } catch(IOException ioe) {
            System.out.println("IO thing borken.");
        }
    }

    private static void emptyFile(User user) throws IOException {
        OutputStream os = null;
        try {
            os = new FileOutputStream(user.getName() + ".usr");
        } finally {
            if (os != null) {
                os.close();
            }
        }
    }

    private static void deleteFile(User user) {
        File file = new File(user.getName() + ".usr");
        if (file.delete()) {
            System.out.println(user.getName() + " deleted sucessfully...");
        } else {
            System.out.println(user.getName() + " deletion failed!");
        }
    }
}
