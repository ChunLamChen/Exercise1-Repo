/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clchen
 */
import java.util.Scanner;
public class UniversityStudentProfile {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter Student Name: ");
        String StudentName = scanner.next();
        
         System.out.print("Enter Student Number: ");
        String StudentNumber = scanner.nextLine();
        
        System.out.print("Enter Student Program: ");
        String StudentProgram = scanner.nextLine();

        // Taking input of different data types
        System.out.print("Enter Student Year Level: ");
        int StudentYear = scanner.nextInt();

        System.out.print("Enter Student GPA: ");
        double StudentGPA = scanner.nextDouble();

       

       

        // Displaying the input values
        System.out.println("You entered:");
        System.out.println("Student Name : " + StudentName);
        System.out.println("Student Number: " + StudentNumber );
        System.out.println("Student Program : " + StudentProgram );
        System.out.println("Student Year: " + StudentYear );
        System.out.println("Student GPA: " + StudentGPA );

        // Closing the scanner
        scanner.close();
      
    }    
}