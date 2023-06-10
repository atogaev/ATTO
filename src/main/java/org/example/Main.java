package org.example;

import org.example.controller.Controller;
import org.example.controllerServis.RegistrationServis;
import org.example.databaseUtil.DataBase;
import org.example.dbConnection.DBConnection;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        dataBase.createTable();
        Controller controller = new Controller();
        controller.Menu();


//        try {
//
//            Connection connection = DBConnection.getConnection();
//            String sql = "select id,name from student";
//            PreparedStatement pr = connection.prepareStatement(sql);
//           ResultSet rs = pr.executeQuery();
//           rs.next();
//
//            System.out.println(rs.getInt("Id")+ " - " + rs.getString("name"));
////            System.out.println(("name"));
//            connection.close();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
////        String phone = "998900022002";
////
////        String sql = "select phone from Userjon where phone = '" + phone + "'";
////
////        System.out.println(sql);
////
////        RegistrationServis registrationServis = new RegistrationServis();
////        registrationServis.checkPhone(phone);
    }
}