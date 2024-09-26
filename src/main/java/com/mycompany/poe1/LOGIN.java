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
        
       
    }
}
