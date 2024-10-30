package com.mycompany.poe1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class LOGIN {

    private String username;
    private String password;
    private String name;
    private String lastName;
     
    // Static Set for special characters to avoid recreating it
    private static final Set<Character> specialCharacters = new HashSet<>(
        Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+')
    );

    // Constructor
    public LOGIN() {
    }

    // Getter and Setter for Username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getname() {
        return name;
    }
    
    public void setname(String name) {
        this.name = name;
    }
    
    public String getlastName() {
        return lastName;
    }
    
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    
    
     Scanner scanner = new Scanner(System.in);
    
    
    
    // Check if username contains an underscore and has at least 5 characters
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Method to check password complexity
    public boolean checkPasswordComplexity(String password) {
        int n = password.length();
        boolean hasLower = false, hasUpper = false, hasDigit = false, specialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if (specialCharacters.contains(ch)) specialChar = true;
        }
        return hasLower && hasUpper && hasDigit && specialChar && n >= 8;
    }

    // Method to register user with validations
    public String registerUser(String username, String password) {
        boolean isUsernameValid = checkUsername(username);
        boolean isPasswordValid = checkPasswordComplexity(password);
         // Capture first name
        System.out.print("Enter NAME: ");
        name = scanner.next();

        // Capture last name
        System.out.print("Enter SURNAME: ");
        lastName = scanner.next();
        

        if (!isUsernameValid && !isPasswordValid) {
            return "Username is incorrectly formatted, and password does not meet the complexity requirements.";
        } else if (!isUsernameValid) {
            return "Username is incorrectly formatted. It should contain an underscore and be at least 5 characters long.";
        } else if (!isPasswordValid) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";
        } else {
            setUsername(username);
            setPassword(password);
            return "User successfully registered.";
        }
    }

    // Method to log in user by checking entered credentials
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        // Added null checks for safety
        if (this.username == null || this.password == null) {
            System.out.println("No registered user found.");
            return false;
        }
        
        if (this.username.equals(enteredUsername) && this.password.equals(enteredPassword)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Login failed. Incorrect username or password.");
            return false;
        }
    }

    // New method to return login status
    public String returnLoginStatus(String enteredUsername, String enteredPassword) {
        if (loginUser(enteredUsername, enteredPassword)) {
            return "Login successful!";
        } else {
            return "Login failed. Incorrect username or password.";
        }
    }

    // Method to display user details
    public void displayDetails() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        
//    }
    }
}
