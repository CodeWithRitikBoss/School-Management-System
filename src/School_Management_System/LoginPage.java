package School_Management_System;

// Import Statements.
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

// Main Class.
public class LoginPage extends JFrame implements ActionListener {
    
    JFrame f;
    JLabel l1, l2, l3, l4, l5, l6, wlecomeLavelJLabel, wwwLink;
    Choice ch1;
    JTextField t1;
    JPasswordField p1;
    JButton b1, b2;
    
    // Constructor.
    LoginPage() {
        f = new JFrame("Login School Account");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        
        l1= new JLabel();
        l1.setBounds(0,0,950,550);
        l1.setLayout(null);
        
        ImageIcon img= new ImageIcon(ClassLoader.getSystemResource("Images/Image2.png"));
        Image i1=  img.getImage().getScaledInstance(950, 550, Image.SCALE_SMOOTH);
        ImageIcon img1= new ImageIcon(i1);
        l1.setIcon(img1);
        
        l2= new JLabel("Login School Account");
        l2.setForeground(new Color(0, 32, 96));
        l2.setBounds(310,50,500,50);
        l2.setFont(new Font("Arial", Font.BOLD, 30));
        
        // Adding Elements on the Image Lavel.
        f.add(l1);
        l1.add(l2);
        
        wlecomeLavelJLabel= new JLabel("Welcome");
        wlecomeLavelJLabel.setBounds(420,160,150,30);
        wlecomeLavelJLabel.setFont(new Font("Arial", Font.BOLD, 25));
        wlecomeLavelJLabel.setForeground(Color.BLACK);
        
        // Adding wlecomeLavelJLabel  on the image lavel.
        l1.add(wlecomeLavelJLabel);
        
        l3= new JLabel("Account Type    :");
        l3.setBounds(280,220,180,30);
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.DARK_GRAY);
        
        // Adding l3 on the image lavel.
        l1.add(l3);
        
        ch1= new Choice();
        ch1.add("Admin");
        ch1.add("Teacher");
        ch1.add("Student");
        ch1.setBounds(480, 220, 180, 30);
        ch1.setFont(new Font("Arial", Font.BOLD, 20));
        
        // Adding ch1 on the image lavel.
        l1.add(ch1);
        
        l4= new JLabel("User name    :");
        l4.setBounds(280,260,180,30);
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.DARK_GRAY);
        
        // Adding l4 on the image lavel.
        l1.add(l4);
        
        t1 = new JTextField();
        t1.setBounds(480,260,180,30);
        t1.setFont(new Font("Arial", Font.BOLD, 20));
        
         // Adding j1 on the image lavel.
        l1.add(t1);
        
        l5= new JLabel("Password    :");
        l5.setBounds(280,300,180,30);
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setForeground(Color.DARK_GRAY);
        
        // Adding l4 on the image lavel.
        l1.add(l5);
        
        p1 = new JPasswordField();
        p1.setBounds(480,300,180,30);
        p1.setFont(new Font("Arial", Font.BOLD, 20));
        
         // Adding j2 on the image lavel.
        l1.add(p1);
        
        l6= new JLabel();
        l6.setBounds(300,380,50,50);
        l6.setLayout(null);
        
        ImageIcon imgLogo= new ImageIcon(ClassLoader.getSystemResource("Images/Image4.png"));
        Image imgLogo1=  imgLogo.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon imgLogo2= new ImageIcon(imgLogo1);
        l6.setIcon(imgLogo2);
        
        // Adding l6 on the image lavel.
        l1.add(l6);
        
        b1 = new JButton("LOGIN");
        b1.setBounds(450,380,100,40);
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        // Adding b1 on the image lavel.
        l1.add(b1);
        
        b2 = new JButton("EXIT");
        b2.setBounds(560,380, 100,40);
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        b2.setBackground(new Color(191, 247, 161));
        b2.setForeground(Color.BLACK);
        
        // Adding b2 on the image lavel.
        l1.add(b2);
        
        wwwLink= new JLabel("www.codingwill.com");
        wwwLink.setBounds(400,450,180,30);
        wwwLink.setFont(new Font("Arial", Font.BOLD, 16));
        wwwLink.setForeground(Color.BLUE);
        
        // Adding wwwLink on the image lavel.
        l1.add(wwwLink);
        
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(950, 550);
        f.setLocation(300, 100);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try {
                ConnectionClass objConnectionClass = new ConnectionClass();
                String userNameString = t1.getText();
                String passwordString = p1.getText();
                String accountTypeString = ch1.getSelectedItem();
                String quaryString = "SELECT * FROM LOGIN WHERE USERNAME='"+userNameString+"' AND PASSWORD='"+passwordString+"'";
                ResultSet resultSet = objConnectionClass.statement.executeQuery(quaryString);
                if(resultSet.next()){
//                    new AdminHomePage().setVisible(true);
                    System.out.println("Login Successfully");
                }else{
                    JOptionPane.showMessageDialog(null, "You have entered Invalid..! userName and Password.");
                }
                
            } catch (Exception e) {
                System.out.println("Exception is : "+ e);
            }
            
        }else if(ae.getSource() == b2){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    
    // Main Function.
    public static void main(String[] args) {
        
        // Object of a Main Class.
        new LoginPage();
    }
}
