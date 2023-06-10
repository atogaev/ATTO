package org.example.controllerServis;

import org.example.componentConteyner.ComponentConteyner;
import org.example.dbConnection.DBConnection;
import org.example.dto.Profile;

import java.sql.*;

public class RegistrationServis {
//    Controller controller = new Controller();

//    public void addCard(){
//
//    }

    public void addUser() {
        System.out.println("Enter name");
        String name = ComponentConteyner.stscanner.next();
        System.out.println("Enter surname");
        String surname = ComponentConteyner.stscanner.next();
        System.out.println("Enter phone");
        String phone = ComponentConteyner.stscanner.next();
        System.out.println("Enter password");
        String password = ComponentConteyner.stscanner.next();

        Profile profile = new Profile();
        profile.setName(name);
        profile.setSurname(surname);
        profile.setPhone(phone);
        profile.setPasswd(password);

        checkPhone(profile.getPhone());
        insertRegistration(profile);
    }


    public void insertRegistration(Profile profile) {
        try {
        Connection connection = null;
            connection = DBConnection.getConnection();
            String sql = "insert into Userjon(name,surname,phone,password) values(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, profile.getName());
            preparedStatement.setString(2, profile.getSurname());
            preparedStatement.setString(3, profile.getPhone());
            preparedStatement.setString(4, profile.getPasswd());
            preparedStatement.setDate(5, Date.valueOf(profile.getCreated_date()));
            preparedStatement.setString(6, profile.getStatus());
            preparedStatement.setString(7, profile.getRole());
            preparedStatement.executeUpdate(sql);
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

//    public void userLogin(String phone ,String password){
//        Connection connection = null;
//        try {
//        String sql = "select phone,password from Userjon where phone = ? and  password = ?";
//            PreparedStatement pr = connection.prepareStatement(sql);
////            pr.setString(1,phone);
////            pr.setString(2,password);
//            pr.executeQuery();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public void checkPhone(String phone) {

        try {
            Connection connection = DBConnection.getConnection();
            String sql = "select phone from Userjon where phone = '" + phone + "'";
            PreparedStatement pr = connection.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            rs.next();
            String ph = rs.getString("phone");
            if( ph != null) {
                System.out.println("This phone is already exist");
                connection.close();
                return;
            }
            connection.close();

        if (!(phone.startsWith("998")) && (phone.length() != 12)) {
            System.err.println("This phone is not valid");
        } else {
            System.out.println("Successful");
        }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public Boolean logIn(String phone, String passwd) {

        try {
            Connection connection = DBConnection.getConnection();
            String sql = "select phone,password from Userjon where phone = '" + phone + "' and password = '" + passwd + "'";
            PreparedStatement pr = connection.prepareStatement(sql);
            ResultSet rs = pr.executeQuery(sql);
            rs.next();
            if (rs.getString("phone") != null && rs.getString("Password") != null) {
                //
           return true;
            } else {
                System.err.println("Something is Wrong");
            }
            connection.close();
            return false ;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
