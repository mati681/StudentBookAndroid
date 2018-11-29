package com.example.user.dzienniczekucznia;

import com.example.user.dzienniczekucznia.api.Controller;
import com.example.user.dzienniczekucznia.data.PostgreSQL;
import com.example.user.dzienniczekucznia.service.GoogleAuth;


public class Run {
    public static void main(String[] args) {
       Controller controller = new Controller();
       controller.start();
       PostgreSQL postgreSQL = new PostgreSQL();
       postgreSQL.start();
       //GoogleAuth googleAuth = new GoogleAuth();


        String sql;
        sql = "SELECT  first, last FROM Employees";
        System.out.println(sql);

        // tu dodać odwołanie do MainActivity
    }
}
