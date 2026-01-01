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
public class insertmoredetails {
    
    public static void main(String[] args) {
        try {
            Conn c = new Conn();
            System.out.println("Database connected successfully!");

            // 🔹 15 sample teacher records
            String[][] teachers = {
                {"Divya", "Kumar", "1017006", "15-09-1993", "Bangalore", "8123456789", "divya@gmail.com", "88", "87", "678901234567", "MCA", "Computer Applications"},
                {"Vikram", "Shetty", "1017007", "05-05-1988", "Mangalore", "9345678901", "vikram@gmail.com", "91", "92", "789012345678", "M.Tech", "Civil"},
                {"Pooja", "Murthy", "1017008", "10-02-1994", "Tumkur", "9001122233", "pooja@gmail.com", "89", "90", "890123456789", "MBA", "Finance"},
                {"Sanjay", "Kiran", "1017009", "19-07-1989", "Mysore", "9112233445", "sanjay@gmail.com", "87", "85", "901234567890", "MSc", "Physics"},
                {"Deepa", "Raj", "1017010", "25-11-1991", "Chennai", "9223344556", "deepa@gmail.com", "90", "92", "912345678901", "MA", "English"},
                {"Anand", "Sharma", "1017011", "02-04-1987", "Hyderabad", "9334455667", "anand@gmail.com", "93", "94", "923456789012", "PhD", "Mathematics"},
                {"Neha", "Gowda", "1017012", "11-08-1992", "Bangalore", "9445566778", "neha@gmail.com", "86", "88", "934567890123", "MCom", "Commerce"},
                {"Ravi", "Patil", "1017013", "09-01-1988", "Belgaum", "9556677889", "ravi@gmail.com", "90", "91", "945678901234", "M.Tech", "Electronics"},
                {"Chandana", "Rao", "1017014", "13-03-1990", "Udupi", "9667788990", "chandana@gmail.com", "85", "86", "956789012345", "MCA", "Information Technology"},
                {"Suresh", "Naik", "1017015", "27-10-1989", "Davangere", "9778899001", "suresh@gmail.com", "88", "89", "967890123456", "MBA", "Marketing"},
                {"Priya", "Menon", "1017016", "07-05-1993", "Kerala", "9889900112", "priya@gmail.com", "90", "93", "978901234567", "MSc", "Biotechnology"},
                {"Arjun", "Reddy", "1017017", "16-12-1986", "Hyderabad", "9990011223", "arjun@gmail.com", "92", "94", "989012345678", "PhD", "Computer Science"},
                {"Lavanya", "Bhat", "1017018", "23-06-1992", "Mangalore", "9101122334", "lavanya@gmail.com", "89", "88", "990123456789", "MCA", "Software Engineering"},
                {"Manoj", "Desai", "1017019", "12-09-1988", "Hubli", "9212233445", "manoj@gmail.com", "87", "89", "901234567891", "MSc", "Mathematics"},
                {"Shreya", "Nair", "1017020", "05-01-1991", "Kochi", "9323344556", "shreya@gmail.com", "91", "92", "912345678902", "MBA", "HR Management"}
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

    

