package com.example.user.dzienniczekucznia;


import com.example.user.dzienniczekucznia.activity.OgloszeniaActivity;
import com.example.user.dzienniczekucznia.data.PostgreSQL;
import com.example.user.dzienniczekucznia.remote.RetrofitClient;


public class Run {

    public static void main(String[] args) {


        //Controller controller = new Controller();
      //  controller.start();
        RetrofitClient retrofitClient = new RetrofitClient();
        System.out.println(retrofitClient);
       PostgreSQL postgreSQL = new PostgreSQL();
       postgreSQL.start();
       //GoogleAuth googleAuth = new GoogleAuth();

        String sql;
        sql = "SELECT  first, last FROM Employees";
        System.out.println(sql);

        // tu dodać odwołanie do MainActivity



    }
}
