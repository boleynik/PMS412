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
            connect = DriverManager.getConnection("CHANGE",
                    "CHANGE", "CHANGE");

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from SCHEMA.TABLE");
            while (resultSet.next()) {
                String login = resultSet.getString("LoginID");
                String pwd = resultSet.getString("Password");
                System.out.println("LoginID: " + login);
                System.out.println("Password: " + pwd);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}