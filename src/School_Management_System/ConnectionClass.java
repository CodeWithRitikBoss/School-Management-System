// Package Name : School_Management_System.
package School_Management_System;

// Import Statements
import java.sql.*;

// Main Class.
public class ConnectionClass {
    
    Connection connection;
    Statement statement;
    
    // Constructor.
    ConnectionClass(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/School_Management_System","root","RitikCoder@mysql");
            statement = connection.createStatement();
            // System.out.println("Connection Established Sussessfully.");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception while connecting DB : "+ e);
        }
        // System.out.println("Constructor is here.");
    }
    
    // Main Function.
    public static void main(String[] args){
        ConnectionClass connectionClass = new ConnectionClass();
        // System.out.println("This is my School Management Software.");
    }
}
