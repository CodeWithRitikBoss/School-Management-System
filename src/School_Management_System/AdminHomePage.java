package School_Management_System;

// Import Statements.
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

// Main Class.
public class AdminHomePage extends JFrame implements ActionListener{
    
    public String accountTypeString;
    JLabel jLabel1;
    JPanel jPanel1;
    Font font1, font2, font3;
    
    // Main Constructor.
    // Default Constructor.
    public AdminHomePage(){
        
    }

    // Parameterized Constructor.
    AdminHomePage(String accountTypeString) {
        accountTypeString = this.accountTypeString;
        this.setTitle("School Management System Admin Home Page");
        setLocation(0, 0);
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon img= new ImageIcon(ClassLoader.getSystemResource("Images/Image3.jpg"));
        Image i1=  img.getImage().getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
        ImageIcon img1= new ImageIcon(i1);
        jLabel1= new JLabel(img1);
        // add(jLabel1);
        
        // Adding jLabel1 into the JFrame.
        // f.add(l1);
        
        // Createing Menu Bar.
        JMenuBar jMenuBar1= new JMenuBar();
        
        // Creating Menus.
        JMenu jMenu1= new JMenu("Teacher Profile");
        JMenu jMenu2= new JMenu("Student Profile");
        JMenu jMenu3= new JMenu("Class Details");
        JMenu jMenu4= new JMenu("Subject Details");
        JMenu jMenu5= new JMenu("Marks Details");
        JMenu jMenu6= new JMenu("Fee Details");
        JMenu jMenu7= new JMenu("Result");
        JMenu jMenu8= new JMenu("Logout");
        
        // Creating Menu Items.
        JMenuItem jMenuItem1= new JMenuItem("Add Teacher Details");
        JMenuItem jMenuItem2= new JMenuItem("Update Teacher Details");
        JMenuItem jMenuItem3= new JMenuItem("View Teacher Details");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem3);
        
        JMenuItem jMenuItem4= new JMenuItem("Add Student Details");
        JMenuItem jMenuItem5= new JMenuItem("Update Student Details");
        JMenuItem jMenuItem6= new JMenuItem("View Student Details");
        jMenu2.add(jMenuItem4);
        jMenu2.add(jMenuItem5);
        jMenu2.add(jMenuItem6);
        
        JMenuItem jMenuItem7= new JMenuItem("Add New Class");
        JMenuItem jMenuItem8= new JMenuItem("Update Class Details");
        jMenu3.add(jMenuItem7);
        jMenu3.add(jMenuItem8);
        
        JMenuItem jMenuItem9= new JMenuItem("Add New Subject");
        JMenuItem jMenuItem10= new JMenuItem("Update Subject Details");
        jMenu4.add(jMenuItem9);
        jMenu4.add(jMenuItem10);
        
        JMenuItem jMenuItem11= new JMenuItem("Add Marks Subject");
        jMenu5.add(jMenuItem11);
        
        JMenuItem jMenuItem12= new JMenuItem("Add Fee Structure");
        JMenuItem jMenuItem13= new JMenuItem("Add Fee Details");
        jMenu6.add(jMenuItem12);
        jMenu6.add(jMenuItem13);
        
        JMenuItem jMenuItem14= new JMenuItem("Show Result");
        jMenu7.add(jMenuItem14);
        
        JMenuItem jMenuItem15= new JMenuItem("Exit");
        jMenu8.add(jMenuItem15);
        
        // Adding JMenu into JMenuBar.
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);
        jMenuBar1.add(jMenu4);
        jMenuBar1.add(jMenu5);
        jMenuBar1.add(jMenu6);
        jMenuBar1.add(jMenu7);
        jMenuBar1.add(jMenu8);
        
        setJMenuBar(jMenuBar1);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    // Main Function.
    public static void main(String[] args) {
        
        // Object of the Main Class.
        new AdminHomePage("admin").setVisible(true);
    }
}
