/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class VehicleInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Car Brand: ");
        String carBrand = scanner.nextLine();
        
        System.out.print("Enter Car Model: ");
        String carModel = scanner.nextLine();
        
        System.out.print("Enter Plate Number: ");
        String plateNumber = scanner.nextLine();
        
        System.out.print("Enter Manufacturing Year: ");
        int manufacturingYear = scanner.nextInt();
        
        System.out.print("Enter Engine Displacement: ");
        Double engineDisplacement = scanner.nextDouble();
        
        System.out.println("");
        
        System.out.println("Car Brand:"+ carBrand);
        System.out.println("Car Model:" + carModel);
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Manufacturing Year: " + manufacturingYear );
        System.out.println("Engine Displacemnt: " + engineDisplacement);
        
        scanner.close();
    }
}

