package se.lexicon.config.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConnection {
    static String url = "jdbc:mysql://localhost:3306/todoit";
    static String userName = "root";
    static String password = "1234";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }
}
