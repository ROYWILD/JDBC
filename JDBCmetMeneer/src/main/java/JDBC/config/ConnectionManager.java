package JDBC.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection != null) {
            return connection;
        }

        String url = "jdbc:mysql://localhost/test"; //
        String username = "root";
        String password = "000d";
        try {
            connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
