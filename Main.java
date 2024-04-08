import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String pass = "fake_password";
        System.out.println(pass);
        System.out.println("Hashed pass: " + pass.hashCode());
    }
}
