package com.example.user.dzienniczekucznia;

import android.util.Log;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Run {

    private static final String dbname = "postgres";
    public static final String USER = " admin";
    public static final String PASSWORD = "admin";

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();

        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String url = "jdbc:postgresql:localhost:5432/postgres";
        Connection conn;
        try {
            conn = DriverManager.getConnection(url, USER, PASSWORD);

            conn =  DriverManager.getConnection(url);
            System.out.println("Connected");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            Log.e("Tag", "Description", e);
        }
    }
}
