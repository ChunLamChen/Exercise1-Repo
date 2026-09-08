/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class MobilePhoneRecord {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter Smartphone Brand: ");
        String Brand = scanner.nextLine();
        
        System.out.print("Enter Smartphone Model: ");
        String Model = scanner.nextLine();
        
        System.out.print("Enter Ram in GB: ");
        int ramGB = scanner.nextInt();
        
        System.out.print("Enter Storage in GB: ");
        int storageGB = scanner.nextInt();
        
        System.out.print("Enter Price: ");
        double Price = scanner.nextDouble();
        
        System.out.println("");
        
        System.out.println("Brand: " + Brand);
        System.out.println("Model: " + Model);
        System.out.println("Ram: " + ramGB);
         System.out.println("Storage: " + storageGB);
        System.out.println("Price: " + Price);
        
        scanner.close();

    }
    
}

