/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.poe1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {
    
    public TaskTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTaskName method, of class Task.
     */
    @Test
    public void testGetTaskName() {
        System.out.println("getTaskName");
        int taskCount = 0;
        Task instance = new Task();
        String expResult = "";
        String result = instance.getTaskName(taskCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDescription method, of class Task.
     */
    @Test
    public void testGetTaskDescription() {
        System.out.println("getTaskDescription");
        int taskCount = 0;
        Task instance = new Task();
        String expResult = "";
        String result = instance.getTaskDescription(taskCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeveloperName method, of class Task.
     */
    @Test
    public void testGetDeveloperName() {
        System.out.println("getDeveloperName");
        int taskCount = 0;
        Task instance = new Task();
        String expResult = "";
        String result = instance.getDeveloperName(taskCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskStatus method, of class Task.
     */
    @Test
    public void testGetTaskStatus() {
        System.out.println("getTaskStatus");
        int taskCount = 0;
        Task instance = new Task();
        String expResult = "";
        String result = instance.getTaskStatus(taskCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDurations method, of class Task.
     */
    @Test
    public void testGetTaskDurations() {
        System.out.println("getTaskDurations");
        int taskCount = 0;
        Task instance = new Task();
        int expResult = 0;
        int result = instance.getTaskDurations(taskCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskStatuses method, of class Task.
     */
    @Test
    public void testGetTaskStatuses() {
        System.out.println("getTaskStatuses");
        int taskCount = 0;
        Task instance = new Task();
        int expResult = 0;
        int result = instance.getTaskStatuses(taskCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskId method, of class Task.
     */
    @Test
    public void testGetTaskId() {
        System.out.println("getTaskId");
        int taskCount = 0;
        Task instance = new Task();
        String expResult = "";
        String result = instance.getTaskId(taskCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeTask method, of class Task.
     */
    @Test
    public void testInitializeTask() {
        System.out.println("initializeTask");
        int index = 0;
        String taskName = "";
        String taskDescription = "";
        String developerName = "";
        int taskDuration = 0;
        int taskNumber = 0;
        String taskStatus = "";
        Task instance = new Task();
        instance.initializeTask(index, taskName, taskDescription, developerName, taskDuration, taskNumber, taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        int taskNumber = 0;
        String taskName = "";
        String developerName = "";
        Task instance = new Task();
        String expResult = "";
        String result = instance.createTaskID(taskNumber, taskName, developerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        int taskCount = 0;
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails(taskCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTask method, of class Task.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        Task instance = new Task();
        instance.addTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTasksWithStatusDone method, of class Task.
     */
    @Test
    public void testDisplayTasksWithStatusDone() {
        System.out.println("displayTasksWithStatusDone");
        Task instance = new Task();
        instance.displayTasksWithStatusDone();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestTask method, of class Task.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        Task instance = new Task();
        instance.displayLongestTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class Task.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        Task instance = new Task();
        instance.searchTaskByName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class Task.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        Task instance = new Task();
        instance.searchTasksByDeveloper();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTaskReport method, of class Task.
     */
    @Test
    public void testDisplayTaskReport() {
        System.out.println("displayTaskReport");
        Task instance = new Task();
        instance.displayTaskReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTask method, of class Task.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        Task instance = new Task();
        instance.deleteTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
