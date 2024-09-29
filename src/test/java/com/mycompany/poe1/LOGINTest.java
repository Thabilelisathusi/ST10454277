/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LOGINTest {
    
    public LOGINTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   /* @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
/*
    /**
     * Test of checkusername method, of class LOGIN.
     */
    @org.junit.jupiter.api.Test
    public void testCheckusername() {
        System.out.println("checkusername");
        String username = "Tha_b";
        LOGIN instance = new LOGIN();
        boolean expResult = false;
        boolean result = instance.checkusername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckPasswordComplexity method, of class LOGIN.
     */
    @org.junit.jupiter.api.Test
    public void testcheckPasswordComplexity() {
        System.out.println("checkpasswordcomplexity");
        String password = "Close@3000";
        LOGIN instance = new LOGIN();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class LOGIN.
     */
    @org.junit.jupiter.api.Test
    public void testRegisterUser() {
        System.out.println("registeruser");
        String username = "";
        String password = "";
        String firstName = "";
        String lastName = "";
        LOGIN instance = new LOGIN();
        String expResult = "";
        String result = instance.registerUser(username, password, firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class LOGIN.
     */
    @org.junit.jupiter.api.Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        LOGIN instance = new LOGIN();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class LOGIN.
     */
    @org.junit.jupiter.api.Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean success = false;
        LOGIN instance = new LOGIN();
        String expResult = "";
        String result = instance.returnLoginStatus(success);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
