package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);

        // Image on the right side
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);

        // Heading
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);

        // Developer / Team Name
        JLabel name = new JLabel("Developed By: Swing Team");
        name.setBounds(70, 220, 550, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);

        // SRN
        JLabel srn = new JLabel("SRN: R24DE071");
        srn.setBounds(70, 280, 550, 40);
        srn.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(srn);

        // Contact Info
        JLabel contact = new JLabel("Contact: swingteam@example.com"); // replace with your email if needed
        contact.setBounds(70, 340, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new About();
    }
}
