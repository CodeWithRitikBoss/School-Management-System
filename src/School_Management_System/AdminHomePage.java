package School_Management_System;

// Import Statements.
import java.awt.Color;
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
import javax.swing.JOptionPane;
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
        font1= new Font("Arial", Font.BOLD, 20);
        font2= new Font("Arial", Font.BOLD, 16);
        this.setTitle("School Management System Admin Home Page");
        setLocation(0, 0);
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon img= new ImageIcon(ClassLoader.getSystemResource("Images/Image2.jpg"));
        Image i1=  img.getImage().getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
        ImageIcon img1= new ImageIcon(i1);
        jLabel1= new JLabel(img1);
         add(jLabel1);
        
        // Adding jLabel1 into the JFrame.
        // f.add(l1);
        
        // Createing Menu Bar.
        JMenuBar jMenuBar1= new JMenuBar();
        jMenuBar1.setBackground(new Color(0, 32, 96));
        
        // Creating Menus.
        JMenu jMenu1= new JMenu("Teacher Profile");
        jMenu1.setFont(font1);
        jMenu1.setForeground(Color.WHITE);
        JMenu jMenu2= new JMenu("Student Profile");
        jMenu2.setForeground(Color.WHITE);
        jMenu2.setFont(font1);
        JMenu jMenu3= new JMenu("Class Details");
        jMenu3.setForeground(Color.WHITE);
        jMenu3.setFont(font1);
        JMenu jMenu4= new JMenu("Subject Details");
        jMenu4.setForeground(Color.WHITE);
        jMenu4.setFont(font1);
        JMenu jMenu5= new JMenu("Marks Details");
        jMenu5.setForeground(Color.WHITE);
        jMenu5.setFont(font1);
        JMenu jMenu6= new JMenu("Fee Details");
        jMenu6.setForeground(Color.WHITE);
        jMenu6.setFont(font1);
        JMenu jMenu7= new JMenu("Result");
        jMenu7.setForeground(Color.WHITE);
        jMenu7.setFont(font1);
        JMenu jMenu8= new JMenu("Logout");
        jMenu8.setForeground(Color.YELLOW);
        jMenu8.setFont(font1);
        
        // Creating Menu Items.
        JMenuItem jMenuItem1= new JMenuItem("Add Teacher Details");
        jMenuItem1.setFont(font2);
        jMenuItem1.addActionListener(this);
        JMenuItem jMenuItem2= new JMenuItem("Update Teacher Details");
        jMenuItem2.setFont(font2);
        jMenuItem2.addActionListener(this);
        JMenuItem jMenuItem3= new JMenuItem("View Teacher Details");
        jMenuItem3.setFont(font2);
        jMenuItem3.addActionListener(this);
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem3);
        
        JMenuItem jMenuItem4= new JMenuItem("Add Student Details");
        jMenuItem4.setFont(font2);
        jMenuItem4.addActionListener(this);
        JMenuItem jMenuItem5= new JMenuItem("Update Student Details");
        jMenuItem5.setFont(font2);
        jMenuItem5.addActionListener(this);
        JMenuItem jMenuItem6= new JMenuItem("View Student Details");
        jMenuItem6.setFont(font2);
        jMenuItem6.addActionListener(this);
        jMenu2.add(jMenuItem4);
        jMenu2.add(jMenuItem5);
        jMenu2.add(jMenuItem6);
        
        JMenuItem jMenuItem7= new JMenuItem("Add New Class");
        jMenuItem7.setFont(font2);
        jMenuItem7.addActionListener(this);
        JMenuItem jMenuItem8= new JMenuItem("Update Class Details");
        jMenuItem8.setFont(font2);
        jMenuItem8.addActionListener(this);
        jMenu3.add(jMenuItem7);
        jMenu3.add(jMenuItem8);
        
        JMenuItem jMenuItem9= new JMenuItem("Add New Subject");
        jMenuItem9.setFont(font2);
        jMenuItem9.addActionListener(this);
        JMenuItem jMenuItem10= new JMenuItem("Update Subject Details");
        jMenuItem10.setFont(font2);
        jMenuItem10.addActionListener(this);
        jMenu4.add(jMenuItem9);
        jMenu4.add(jMenuItem10);
        
        JMenuItem jMenuItem11= new JMenuItem("Add Marks Subject");
        jMenuItem11.setFont(font2);
        jMenuItem11.addActionListener(this);
        jMenu5.add(jMenuItem11);
        
        JMenuItem jMenuItem12= new JMenuItem("Add Fee Structure");
        jMenuItem12.setFont(font2);
        jMenuItem12.addActionListener(this);
        JMenuItem jMenuItem13= new JMenuItem("Add Fee Details");
        jMenuItem13.setFont(font2);
        jMenuItem13.addActionListener(this);
        jMenu6.add(jMenuItem12);
        jMenu6.add(jMenuItem13);
        
        JMenuItem jMenuItem14= new JMenuItem("Show Result");
        jMenuItem14.setFont(font2);
        jMenuItem14.addActionListener(this);
        jMenu7.add(jMenuItem14);
        
        JMenuItem jMenuItem15= new JMenuItem("Exit");
        jMenuItem15.setFont(font2);
        jMenuItem15.addActionListener(this);
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
        String commandString= ae.getActionCommand();
        if(commandString.equals("Add Teacher Details")){
            System.out.println("Clicked : Add Teacher Details");
            //new AddTeacherDetails().setVisiable();
        }else if(commandString.equals("Update Teacher Details")){
            System.out.println("Clicked : Update Teacher Details");
            //
        }else if(commandString.equals("View Teacher Details")){
            System.out.println("Clicked : View Teacher Details");
            //
        }else if(commandString.equals("Add Student Details")){
            System.out.println("Clicked : Add Student Details");
            //
        }else if(commandString.equals("Update Student Details")){
            System.out.println("Clicked : Update Student Details");
            //
        }else if(commandString.equals("View Student Details")){
            System.out.println("Clicked : View Student Details");
            //
        }else if(commandString.equals("Add New Class")){
            System.out.println("Clicked : Add New Class");
            //
        }else if(commandString.equals("Update Class Details")){
            System.out.println("Clicked : Update Class Details");
            //
        }else if(commandString.equals("Add New Subject")){
            System.out.println("Clicked : Add New Subject");
            //
        }else if(commandString.equals("Update Subject Details")){
            System.out.println("Clicked : Update Subject Details");
            //
        }else if(commandString.equals("Add Marks Subject")){
            System.out.println("Clicked : Add Marks Subject");
            //
        }else if(commandString.equals("Add Fee Structure")){
            System.out.println("Clicked : Add Fee Structure");
            //
        }else if(commandString.equals("Add Fee Details")){
            System.out.println("Clicked : Add Fee Details");
            //
        }else if(commandString.equals("Show Result")){
            System.out.println("Clicked : Show Result");
            //
        }else if(commandString.equals("Exit")){
            //System.out.println("Clicked : Exit");
            int response = JOptionPane.showConfirmDialog(null, "Do you want to exit ?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION){
                System.exit(0);
            }else if(response == JOptionPane.NO_OPTION){
                // Action to be Execute after clicking No option.
            }
        }
    }
    
    // Main Function.
//    public static void main(String[] args) {
//        
//        // Object of the Main Class.
//        new AdminHomePage("admin").setVisible(true);
//    }
}