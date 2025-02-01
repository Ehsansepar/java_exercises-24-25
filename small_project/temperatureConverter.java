package small_project;
import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        //  temperatureConverter using ternary operator
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        int choice;

        System.out.println("Temperature Converter");
        System.out.println("1. Convert from Celsius to Fahrenheit");
        System.out.println("2. Convert from Fahrenheit to Celsius");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        newTemp = choice == 1 ? (temp * 9/5) + 32 : (temp - 32) * 5/9;

        System.out.printf("The temperature is: %.2f", newTemp);

        scanner.close();
    }
}
