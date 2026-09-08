/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class RestaurantMenuItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Food Item: ");
        String foodItem = scanner.nextLine();
        
        System.out.print("Enter Category: ");
        String category = scanner.nextLine();
        
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter serving size: ");
        int servingSize = scanner.nextInt();
        
        System.out.println("Item: " + foodItem +" ;Category: " + category + "; Price: PHP" + price +"; Serving Size: " + servingSize);
        
        scanner.close();
    }
}
