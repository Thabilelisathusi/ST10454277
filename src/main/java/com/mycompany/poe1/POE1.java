/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe1;
import java.util.Scanner;  // Import the Scanner class
/**
 *
 * @author RC_Student_lab
 */
public class POE1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        LOGIN loginSystem = new LOGIN();
        
        //Registration of varibles
        
        System.out.println("Registration");
       
        System.out.println("Enter Username:");
        String username = sc.next();
        
        System.out.println("Password:");
        String password = sc.next();
        
        System.out.println("First Name:");
        String firstName = sc.next();
        
        System.out.println("Last Name:");
        String lastName = sc.next();
        
        
        //Registration of a user
        String registrationmessage = loginSystem.registerUser(username,password,firstName,lastName);
        System.out.println(registrationmessage);
        
        //Login of the user
        
        System.out.println("Login");
        
        System.out.println("Enter Username:");
        String loginusername = sc.nextLine();
        
        System.out.println("Enter password:");
        String loginpassword = sc.nextLine();
        
            
        boolean loginSuccess = loginSystem.loginUser(loginusername, loginpassword);
        
        //Login status
        
        System.out.println(loginSystem.returnLoginStatus(loginSuccess));
        
        
        
        
        
        
        
        
        
        
        
    }
}
