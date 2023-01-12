package org.example;

import org.example.employee.EmployeeDetails;
import org.example.ready.ReadyForFlight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     boolean isRunning = true;
     while (isRunning){
         Scanner scanner = new Scanner(System.in);
         int option = scanner.nextInt();


         EmployeeDetails employeeDetails = new EmployeeDetails(String birthDate, String name);
         switch (option){
             case1:
             ArrayList<EmployeeDetails> details = ReadyForFlight.getEmployeeDetails();
             for (EmployeeDetails show: details){
                 System.out.println(show);
             }
             default -> throw new IllegalStateException("Unexpected value: " + option);
         }






        }


        System.out.println("Hello world!");
    }
}