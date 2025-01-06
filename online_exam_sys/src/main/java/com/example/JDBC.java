package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/exam_management";
            String user = "root";
            String password = "ss";
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
