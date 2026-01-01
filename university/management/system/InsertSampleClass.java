/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import java.sql.*;

/**
 *
 * @author Kavyashree
 */
public class InsertSampleClass {
    
    public static void main(String[] args) {
        try {
            Conn c = new Conn();
            System.out.println("Database connected successfully!");

            String[][] teachers = {
                {"Kavya", "Ramesh", "1017001", "12-02-1990", "Tumkur", "9876543210", "kavya@gmail.com", "85", "90", "123456789012", "MCA", "Computer Science"},
                {"Arun", "Suresh", "1017002", "25-04-1987", "Bangalore", "9998887776", "arun@gmail.com", "80", "88", "234567890123", "MBA", "Management"},
                {"Megha", "Prakash", "1017003", "10-06-1991", "Mysore", "8877665544", "megha@gmail.com", "92", "93", "345678901234", "MSc", "Electronics"},
                {"Rahul", "Rajesh", "1017004", "18-03-1992", "Hyderabad", "7788996655", "rahul@gmail.com", "84", "89", "456789012345", "B.Tech", "Mechanical"},
                {"Sneha", "Nagaraj", "1017005", "30-12-1989", "Chennai", "9090909090", "sneha@gmail.com", "90", "91", "567890123456", "MCom", "Commerce"}
                
            
            
            
            
            
            
            
            };

            int count = 0;

            for (String[] t : teachers) {
                String query = "INSERT INTO teacher VALUES('" +
                        t[0] + "', '" + t[1] + "', '" + t[2] + "', '" + t[3] + "', '" +
                        t[4] + "', '" + t[5] + "', '" + t[6] + "', '" + t[7] + "', '" +
                        t[8] + "', '" + t[9] + "', '" + t[10] + "', '" + t[11] + "')";
                c.s.executeUpdate(query);
                count++;
            }

            System.out.println(count + " teacher records inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


