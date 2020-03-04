package com.example.final_lab_oop.controllers;

import com.example.final_lab_oop.models.*;

public class ReadWriteDelete implements java.io.Serializable {

    public static void write(User user) {
        user.setName();
        user.setPassword();
        user.setExp();
        user.setLvl();
    }

    public static void read() {

    }

    public static void delete() {

    }


}
//    private void buttonReadFile_onClick(View view) {
//        try {
//            StringBuilder result = new StringBuilder();
//            String line;
//
//            String folder = getApplication().getFilesDir().getAbsolutePath() + File.separator + editTextFolderName.getText().toString();
//            File subFolder = new File(folder);
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(folder, editTextFileName.getText().toString())));
//            while ((line = bufferedReader.readLine()) != null) {
//                result.append(line);
//            }
//            editTextContent.setText(result.toString());
//        } catch (Exception e) {
//            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
//        }
//    }
