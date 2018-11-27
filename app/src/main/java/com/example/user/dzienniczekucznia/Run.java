package com.example.user.dzienniczekucznia;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class Run {
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
