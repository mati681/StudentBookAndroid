package com.example.user.dzienniczekucznia;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Run {

    private static final String dbname = "postgres";
    public static final String USER = " admin";
    public static final String PASSWORD = "admin";

    public static void main(String[] args) {
       Controller controller = new Controller();
       controller.start();
       PostgreSQL postgreSQL = new PostgreSQL();
       postgreSQL.start();


        String sql;
        sql = "SELECT  first, last FROM Employees";
        System.out.println(sql);

        // tu dodać odwołanie do MainActivity
    }
}
