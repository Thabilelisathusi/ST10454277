package com.mycompany.poe1;

import javax.swing.*;
import java.util.Scanner;

;

public class POE1 {

    private Task taskManager = new Task();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LOGIN login = new LOGIN();

        // User Registration
        System.out.print("Enter Username: ");
        String username = scanner.next();

        System.out.print("Enter Password: ");
        String password = scanner.next();

        System.out.print("Enter First Name: ");
        String firstName = scanner.next();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();

        String registrationMessage = login.registerUser(username, password);
        System.out.println(registrationMessage);

        if (registrationMessage.contains("successfully registered")) {
            login.displayDetails();

            // User Login
            System.out.print("\nEnter Username to login: ");
            String loginUsername = scanner.next();
            System.out.print("Enter Password to login: ");
            String loginPassword = scanner.next();

            boolean isLoginSuccessful = login.loginUser(loginUsername, loginPassword);

            // Console output for login result
            if (isLoginSuccessful) {
                System.out.println("Welcome to EasyKanban, " + firstName + " " + lastName + "!");
                POE1 poe = new POE1();
                poe.displayMenu();  // Show menu after successful login
            } else {
                System.out.println("Login failed. Please try again.");
            }
        } else {
            System.out.println("Registration failed. Exiting the program.");
        }

        scanner.close();
    }

    private void displayMenu() {
        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        while (true) {

            while (true) {
                String options = """             
                1. Add Task
                2. Show report
                3. Display Tasks with status 'Done'
                4. Display Task with longest duration
                5. Search Task by Task Name
                6. Search Task by Developer
                7. Delete Task By Task Name
                8. Exit
                    """;

                int choices = Integer.parseInt(JOptionPane.showInputDialog(null, options, "Select one option:", JOptionPane.PLAIN_MESSAGE));

                switch (choices) {
                    case 1 ->
                        taskManager.addTask();
                    case 2 ->
                        taskManager.displayTaskReport();
                    case 3 ->
                        taskManager.displayTasksWithStatusDone();
                    case 4 ->
                        taskManager.displayLongestTask();
                    case 5 ->
                        taskManager.searchTaskByName();
                    case 6 ->
                        taskManager.searchTasksByDeveloper();
                    case 7 ->
                        taskManager.deleteTask();
                    case 8 ->
                        taskManager.deleteTask();
                    default ->
                        JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                }

            }
        }
    }
}
