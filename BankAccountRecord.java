/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class BankAccountRecord {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    
     System.out.print("Enter Account Holder: ");
        String Holder = scanner.nextLine();
        
        System.out.print("Enter Account Number: ");
        String number = scanner.nextLine();
        
        System.out.print("Enter Account Type: ");
        String type = scanner.nextLine();
        
        System.out.print("Enter Account Balance: ");
        double  balance = scanner.nextDouble();       
        
        System.out.println("");
        
        System.out.println("Account Holder: " + Holder);
        System.out.println("Account Number: " + number);
        System.out.println("Account type: " + type);
         System.out.println("Account Balance: " + balance);
       
        
        scanner.close();

    }
    
}
