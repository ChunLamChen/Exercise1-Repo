/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class HostGuestInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter Guest Name: ");
        String guestName = scanner.nextLine();
        
        System.out.print("Enter Room Number: ");
        int roomNumber = scanner.nextInt();
        
        System.out.print("Enter Number of Nights: ");
        int Numnights = scanner.nextInt();
        
        System.out.print("Enter Room Rate: ");
        double roomRate = scanner.nextDouble();
        
        System.out.println("");
        
        System.out.println("Guest: " + guestName);
        System.out.println("Room: " + roomNumber);
        System.out.println("Nights: " + Numnights);
        System.out.println("Room Rate PHP: " + roomRate);
        
        scanner.close();

    }
    
}
