package university.management.system;

import java.sql.*;

public class Conn {
    public Connection c;
    public Statement s;

    public Conn() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/universitymanagementsystem",
                "kavyashree",
                "kavya@1234"
            );

            // Create Statement object
            s = c.createStatement();

            System.out.println("Database connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Database connection failed!");
        }
    }

    // Test main method
    public static void main(String[] args) {
        new Conn();
    }
}
