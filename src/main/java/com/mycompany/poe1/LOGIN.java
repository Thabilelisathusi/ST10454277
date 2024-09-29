/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;

/**
 *
 * @author RC_Student_lab
 */
public class LOGIN {
    private String username; //store username
    private String password; //store password
    private String firstName; //store firstname
    private String lastName;  //Store lastname

    
    public boolean checkusername(String username) {
        return username.contains("_") && username.length()<=5;
         
    }
    
    public boolean checkpasswordcomplexity(String password){
        if (password.length() < 8) return false;
       
        boolean hasuppercase = false;
        boolean hasdigit = false;       
        boolean hasspecialchar = false;
        
        //The password lenght will be in loop and the character will be at index i
        for(int i = 0; 1< password.length();i ++) {
            char ch = password.charAt(i); 
            if (Character.isUpperCase(ch)){
                hasuppercase = true;
               
                
            }else if (Character.isDigit(ch)){
                hasdigit = true;
                
            }else if ("!@#$%^&*()-_+={}':;\"[]|/?<>/.,".indexOf(ch)>= 0){
                hasspecialchar = true;
            }
            
        }
        return hasuppercase && hasspecialchar;
       
    }
    
    public String registeruser(String username, String password, String firstName,String lastName){
        if (!checkusername(username)){
            return "Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in lenght";
            
        }
        if (!checkpasswordcomplexity(password)){
           return "Password is not correctly formatted,please ensure that the password contains at least 8 characters, a capital letter , a number and special character.";
        }
        //user information
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    
    return "User successfully registered";
    
    public boolean loginUser(String username, String password) {
    return this.username ! = null && this.username.equals(username)&& this.password.equals(password);
      
    
    }
    
    public String returnLoginStatus(boolean success){
        if (success) {
            return "Welcome "+ firstName + "," + lastName + "It is great to see you again";
        }else{
            return "Username or password incorrect, please try again";
        }
            
        }
    }
    
    
    
    
}
