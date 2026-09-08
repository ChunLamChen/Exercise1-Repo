/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class UniversityStudentProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter student number: ");
        String studentNumber = scanner.nextLine();

        System.out.print("Enter program: ");
        String program = scanner.nextLine();

        System.out.print("Enter year level: ");
        int yearLevel = scanner.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

      
        System.out.println("\n--- Student Profile ---");
        System.out.println("Name: " + fullName);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Program: " + program);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("GPA: " + gpa);

       

        scanner.close();
    }
}
