package DBDriver;

import java.sql.*;

public class dbIntegration {
    public static void main(String[] args) {
        Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("mysql.up.ist.psu.edu","ist412_001_team02", "hfK2eJy720N6");

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("CREATE TABLE user_logins (" +
                "user_id INT PRIMARY KEY AUTO_INCREMENT," +
                "username VARCHAR(50) NOT NULL," +
                "password VARCHAR(50) NOT NULL," +
                "permissions VARCHAR(50) NOT NULL" +
            ");");
            resultSet = statement.executeQuery("SHOW TABLES;");
            while (resultSet.next()) {
                // String login = resultSet.getString("LoginID");
                // String pwd = resultSet.getString("Password");
                // System.out.println("LoginID: " + login);
                // System.out.println("Password: " + pwd);
                System.out.println(resultSet.getString("table_name"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}