/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
   private String taskName;
   private int taskNumber;
   private String taskDescription;
   private int taskDuration;
   private String developerDetails;
   
   public Task (String taskDescription,String taskName, int taskNumber, int taskDuration, String developerDetails ){
       this.taskDescription = taskDescription;
       this.taskDuration = taskDuration;
       this.taskName = taskName;
       this.taskNumber = taskNumber;
       this.developerDetails = developerDetails;
   }
       public boolean checktaskDescription(String taskDescription) {
       return taskDescription.length()>= 50;
       
    
}
       public String createtaskId(){
           return taskName.substring(0, 2).toUpperCase()+ ":" + taskNumber + ":"+developerDetails.substring(developerDetails.length()-3).toUpperCase();
       }
          
    public String printTaskDetails(){
        return "Task Name" + taskName + "\n" + "Task Number" +  taskNumber + "\n" + "Task Description" + taskDescription + "\n"  + "Task Duration" + taskDuration + "\n" + "Developers Details" + developerDetails + "\n" +"Task ID" + createtaskId() + "\n"+ "Tsk Status";
    }
    public int returnTotalHours(){
        return taskDuration;
    }
}
