package org.example.databaseUtil;

import org.example.dbConnection.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    public void createTable(){
        try {
        Connection connection = DBConnection.getConnection();
            String sql = "create table if not exists Userjon (" +
                    "id serial primary key," +
                    "name varchar(100)," +
                    "surname varchar(100)," +
                    "phone varchar(13) unique," +
                    "card varchar(16) unique," +
                    "password varchar(12) unique," +
                    "created_date date," +
                    "status varchar(15)," +
                    "role varchar(15)" +
                    ")";
        Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
