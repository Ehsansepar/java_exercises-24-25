package small_project;

import java.util.Scanner;

public class weight_converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight; 
        double newWeight;
        int choice;

        System.out.println("Weight Converter");
        System.out.println("1. Convert from KG to Pounds");
        System.out.println("2. Convert from Pounds to KG");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the weight in Pounds: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The weight in KG is: %.2f", newWeight);

        } else if (choice == 2) {
            System.out.print("Enter the weight in KG: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The weight in KG is: %.2f", newWeight);
        
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();


    }
}
