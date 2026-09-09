/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class MovieInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    
     System.out.print("Enter Movie Title: ");
        String MovieTitle = scanner.nextLine();
        
        System.out.print("Enter Director: ");
        String Director = scanner.nextLine();
        
        System.out.print("Enter Release Year: ");
        int year = scanner.nextInt();
        
        System.out.print("Enter Runtime in Minutes: ");
        int RunTime = scanner.nextInt();
        
        System.out.print("Enter Rating: ");
        double Rating = scanner.nextDouble();
        
        System.out.println("");
        
        System.out.println("Title: " + MovieTitle);
        System.out.println("Director: " + Director);
        System.out.println("Year: " + year);
         System.out.println("Run Time: " + RunTime);
        System.out.println("Rating: " + Rating);
        
        scanner.close();

    }
    
}
