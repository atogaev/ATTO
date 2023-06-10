package org.example.dbConnection;

import java.sql.*;

public class DBConnection {

    public static Connection getConnection() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/oop4", "postgres",
                    "root");
            Statement preparedStatement =  connection.createStatement();
        } catch (SQLException e) {
            System.out.println("23");
            e.printStackTrace();
        }
        return connection;
    }
}
