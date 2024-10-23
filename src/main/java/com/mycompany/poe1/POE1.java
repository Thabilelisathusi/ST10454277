package com.mycompany.poe1;
import java.util.Scanner;  // Import the Scanner class
import javax.swing.JDialog;
import javax.swing.JOptionPane;
public class POE1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  // Use one Scanner instance
        LOGIN login = new LOGIN();
        
        String name = "";
        String lastName = "";
   
        // Capture username
        System.out.print("Enter Username: ");
        String username = scanner.next();
        login.setUsername(username);

        // Capture password
        System.out.print("Enter Password: ");
        String password = scanner.next();
        login.setPassword(password);
        
       
        // Call the registerUser method and print the result
        String registrationMessage = login.registerUser(username, password);
        System.out.println(registrationMessage);
        
        // Display details if registration was successful
        if (registrationMessage.contains("successfully registered")) {
            login.displayDetails();
        }
        
        // User Login
        System.out.print("\nEnter Username to login: ");
        String loginUsername = scanner.next();
        System.out.print("Enter Password to login: ");
        String loginPassword = scanner.next();
        
        // Call the loginUser method
        boolean isLoginSuccessful = login.loginUser(loginUsername, loginPassword);
      if (isLoginSuccessful) {
            System.out.println("Welcome " + name + " " + lastName);  // Added a space between name and surname
        } else {
            System.out.println("Please try logging in again.");
        }
    }
  
        
        
    
    
    
}
