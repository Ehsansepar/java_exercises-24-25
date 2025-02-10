package small_project;

import java.util.Scanner;

public class bank_system {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int choice;
        double balance = 0;
        boolean isRunning = true;

        while (isRunning) {

            System.out.println("-------------------------------------");
            System.out.println("BANKING SYSTEM");
            System.out.println("-------------------------------------\n");

            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("\n-------------------------------------\n\n");

            System.out.print("Enter your choice (1-4) : ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case (1):
                    showBalance(balance);
                break;
                // case 1 -> System.out.println("Show balance ");
                // default -> System.out.println("hi");
            }
        }
    }

    static void showBalance(double balance) {
        System.out.printf("%.2f\n",balance);
        // return 0;
    }
    
}
