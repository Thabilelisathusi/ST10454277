/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Task {

    private static final int MAX_TASKS = 100;
    private String[] taskNames = new String[MAX_TASKS];
    private String[] taskDescriptions= new String[MAX_TASKS];
    private String[] developerNames= new String[MAX_TASKS];
    private int[] taskDurations= new int[MAX_TASKS]; // Duration in hours
    private String[] taskStatuses= new String[MAX_TASKS];
    private int[] taskNumbers= new int[MAX_TASKS];
    private String[] taskIds= new String[MAX_TASKS];
    private int taskCount = 0; // Tracks the number of tasks

    // Getters
    public String getTaskName(int taskCount) {
        return taskNames[taskCount];
    }

    public String getTaskDescription(int taskCount) {
        return taskDescriptions[taskCount];
    }

    public String getDeveloperName(int taskCount) {
        return developerNames[taskCount];
    }

    public String getTaskStatus(int taskCount) {
        return taskStatuses[taskCount];

    }
    public int getTaskDurations(int taskCount) {
        return taskDurations[taskCount];

    }

     public int getTaskStatuses(int taskCount) {
        return taskDurations[taskCount];

    }
    public String getTaskId(int taskCount) {
        return taskIds[taskCount];
    }

    // Initialization Method
    public void initializeTask(int index, String taskName, String taskDescription, String developerName, int taskDuration, int taskNumber, String taskStatus) {
        this.taskNames[index] = taskName;
        this.taskDescriptions[index] = taskDescription;
        this.developerNames[index] = developerName;
        this.taskDurations[index] = taskDuration;
        this.taskStatuses[index] = taskStatus;
        this.taskIds[index] = createTaskID(taskNumber, taskName, developerName);
    }

    // Create a unique Task ID based on the task name, developer name, and task number
    public String createTaskID(int taskNumber, String taskName, String developerName) {
        String id = (taskName.length() >= 2 ? taskName.substring(0, 2).toUpperCase() : taskName.toUpperCase()) + ":"
                + taskNumber + ":"
                + (developerName.length() >= 3 ? developerName.substring(developerName.length() - 3).toUpperCase() : developerName.toUpperCase());
        return id;
    }

    // Print task details
    public String printTaskDetails(int taskCount) {
        return "Task Name: " + taskNames[taskCount]
                + "\nNumber: " + taskNumbers[taskCount]
                + "\nDescription: " + taskDescriptions[taskCount]
                + "\nDeveloper: " + developerNames[taskCount]
                + "\nDuration: " + taskDurations[taskCount] + " hours"
                + "\nStatus: " + taskStatuses[taskCount]
                + "\nTask ID: " + createTaskID(taskNumbers[taskCount], developerNames[taskCount], taskNames[taskCount]);

    }

    // Add a new task
    public void addTask() {
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks would you like to add?"));

        for (int i = 0; i < numTasks; i++) {
            String taskName = JOptionPane.showInputDialog("Enter Task Name:");

            String taskDescription;
            do {
                taskDescription = JOptionPane.showInputDialog("Enter Task Description (max 50 chars):");
                if (taskDescription.length() > 50) {
                    JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
                }
            } while (taskDescription.length() > 50);

            String developerName = JOptionPane.showInputDialog("Enter Developer Name:");
            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (hours):"));
            String taskStatus = JOptionPane.showInputDialog("Enter Task Status (To Do, Doing, Done):");

            initializeTask(taskCount, taskName, taskDescription, developerName, taskDuration, taskCount + 1, taskStatus);

            JOptionPane.showMessageDialog(null, "Task added successfully!");
            JOptionPane.showMessageDialog(null, printTaskDetails(taskCount));

            taskCount++; // Increment task count
        }
    }

    // Return the total duration of all tasks
    public int returnTotalHours() {
        int totalHours = 0;
        for (int i = 0; i < taskCount; i++) {
            totalHours += taskDurations[i];
        }
        return totalHours;
    }

    // Additional Methods for Part 3
    // Display tasks with status "Done"
    public void displayTasksWithStatusDone() {
        StringBuilder result = new StringBuilder("Tasks with status 'Done':\n");
        boolean found = false;

        for (int i = 0; i < taskCount; i++) {
            if ("Done".equalsIgnoreCase(taskStatuses[i])) {
                result.append("Developer: ").append(developerNames[i])
                        .append(", Task Name: ").append(taskNames[i])
                        .append(", Duration: ").append(taskDurations[i]).append(" hours\n");
                found = true;
            }
        }

        if (found) {
            JOptionPane.showMessageDialog(null, result.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks with status 'Done' found.");
        }
    }

    // Display the developer and task duration for the longest task
    public void displayLongestTask() {
        if (taskCount == 0) {
            JOptionPane.showMessageDialog(null, "No tasks available.");
            return;
        }

        int longestDurationIndex = 0;
        for (int i = 1; i < taskCount; i++) {
            if (taskDurations[i] > taskDurations[longestDurationIndex]) {
                longestDurationIndex = i;
            }
        }

        JOptionPane.showMessageDialog(null, "Longest Task:\nDeveloper: " + developerNames[longestDurationIndex]
                + "\nDuration: " + taskDurations[longestDurationIndex] + " hours");
    }

    // Search for a task by name
    public void searchTaskByName() {
        String searchName = JOptionPane.showInputDialog("Enter Task Name to Search:");
        boolean taskFound = false;

        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(searchName)) {
                JOptionPane.showMessageDialog(null, "Task Found:\nTask Name: " + taskNames[i]
                        + "\nDeveloper: " + developerNames[i]
                        + "\nStatus: " + taskStatuses[i]);
                taskFound = true;
                break;
            }
        }

        if (!taskFound) {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }

    // Search for all tasks assigned to a developer
    public void searchTasksByDeveloper() {
        String searchDeveloper = JOptionPane.showInputDialog("Enter Developer Name to Search:");
        boolean taskFound = false;

        StringBuilder result = new StringBuilder("Tasks assigned to " + searchDeveloper + ":\n");
        for (int i = 0; i < taskCount; i++) {
            if (developerNames[i].equalsIgnoreCase(searchDeveloper)) {
                result.append("Task Name: ").append(taskNames[i])
                        .append(", Status: ").append(taskStatuses[i]).append("\n");
                taskFound = true;
            }
        }

        if (taskFound) {
            JOptionPane.showMessageDialog(null, result.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks assigned to developer: " + searchDeveloper);
        }
    }

    // Display a full report of all tasks
    public void displayTaskReport() {
        if (taskCount == 0) {
            JOptionPane.showMessageDialog(null, "No tasks available.");
            return;
        }

        StringBuilder report = new StringBuilder("Task Report:\n");
        for (int i = 0; i < taskCount; i++) {
            report.append(printTaskDetails(i)).append("\n");
        }
        report.append("Total Task Duration: ").append(returnTotalHours()).append(" hours.");
        JOptionPane.showMessageDialog(null, report.toString());
    }
    
     // Method to delete a task by name
    public void deleteTask() {
        String taskNameToDelete = JOptionPane.showInputDialog("Enter Task Name to Delete:");
        boolean taskFound = false;

        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskNameToDelete)) {
                taskFound = true;

                // Shift tasks after the deleted task
                for (int j = i; j < taskCount - 1; j++) {
                    taskNames[j] = taskNames[j + 1];
                    taskDescriptions[j] = taskDescriptions[j + 1];
                    developerNames[j] = developerNames[j + 1];
                    taskDurations[j] = taskDurations[j + 1];
                    taskStatuses[j] = taskStatuses[j + 1];
                    taskIds[j] = taskIds[j + 1];
                }

                // Clear the last task slot
                taskNames[taskCount - 1] = null;
                taskDescriptions[taskCount - 1] = null;
                developerNames[taskCount - 1] = null;
                taskDurations[taskCount - 1] = 0;
                taskStatuses[taskCount - 1] = null;
                taskIds[taskCount - 1] = null;

                taskCount--; // Decrease the task count
                JOptionPane.showMessageDialog(null, "Task \"" + taskNameToDelete + "\" deleted successfully.");
                break;
            }
        }

        if (!taskFound) {
            JOptionPane.showMessageDialog(null, "No task found with the name: " + taskNameToDelete);
        }
    }

}
