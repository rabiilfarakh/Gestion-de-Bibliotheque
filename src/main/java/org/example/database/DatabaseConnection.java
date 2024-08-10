package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/SAS_java";
    private static final String USER = "root";
    private static final String PASSWORD = "167200216";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Charge le driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Driver MySQL non trouvé");
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
