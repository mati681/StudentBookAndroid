package com.example.user.dzienniczekucznia;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class PostgreSQL {
    public void start() {

        try
        {
            PostgreSQL postgreSQLExample = new PostgreSQL();

            Connection conn = postgreSQLExample.getPostgreSQLConnection();

            /* You can use the connection object to do any insert, delete, query or update action to the mysql server.*/

            /* Do not forget to close the database connection after use, this can release the database connection.*/
            conn.close();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    /* This method return java.sql.Connection object. */
    public Connection getPostgreSQLConnection()
    {
        /* Declare and initialize a sql Connection variable. */
        Connection ret = null;

        try
        {

            /* Register jdbc driver class. */
            Class.forName("org.postgresql.Driver");

            /* Create connection url. */
            String mysqlConnUrl = "jdbc:postgresql://localhost:5432/postgres";

            /* user name. */
            String mysqlUserName = "admin";

            /* password. */
            String mysqlPassword = "admin";

            /* Get the Connection object. */
            ret = DriverManager.getConnection(mysqlConnUrl, mysqlUserName , mysqlPassword);

            /* Get related meta data for this mysql server to verify db connect successfully.. */
            DatabaseMetaData dbmd = ret.getMetaData();

            String dbName = dbmd.getDatabaseProductName();

            String dbVersion = dbmd.getDatabaseProductVersion();

            String dbUrl = dbmd.getURL();

            String userName = dbmd.getUserName();

            String driverName = dbmd.getDriverName();

            System.out.println("Database Name is " + dbName);

            System.out.println("Database Version is " + dbVersion);

            System.out.println("Database Connection Url is " + dbUrl);

            System.out.println("Database User Name is " + userName);

            System.out.println("Database Driver Name is " + driverName);

        }catch(Exception ex)
        {
            ex.printStackTrace();
        }finally
        {
            return ret;
        }
    }

}
