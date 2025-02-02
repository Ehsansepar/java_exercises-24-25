import java.util.Scanner;

public class learn {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String name = "";
        
        // System.out.print("Enter your name: ");
        // name = scanner.nextLine();
        
        // while (name.contains(" ")) {
        //     System.out.println("Please enter your name without any spaces");
        //     System.out.print("Enter your name: ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Hello, " + name + "!");
        
        // scanner.close();

        // learnning



        // System.out.println(lastIndex);
        // System.out.println(name.length());
        // char lettre = name.charAt(0);
        // int index = name.indexOf("a");
        // int lastIndex = name.lastIndexOf("a");
        // String upper = name.toUpperCase();
        // String lower = name.toLowerCase();

        // String nameWithSpace = "  Ehsan  "; 
        // String removeSpace = nameWithSpace.trim();
        // String replaceString = name.replace(nameWithSpace, removeSpace);

//  ---------------------------------------------------------------------------------------
                // Creation Account Test 
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Email : ");
        // String email = scanner.nextLine();
        
        // // Vérifie si l'email contient à la fois @ ET .com
        // while(!email.contains("@") || !email.contains(".com") || email.indexOf("@") > email.indexOf(".com")) {
        //     System.out.println("Enter a valid Email please!");  
        //     System.out.print("Email : ");
        //     email = scanner.nextLine();      
        // }

        // System.out.print("Password : ");
        // String password = scanner.nextLine();

        // // Extraire le nom d'utilisateur (tout ce qui est avant @)
        // String username = email.substring(0, email.indexOf("@"));
        // String emailDomain = email.substring(email.indexOf("@") + 1);
        
        // System.out.printf("Hello %s !\nYour Demain : %s", username, emailDomain);

        // scanner.close();

// -------------------------------------------------------------------------------------------------------------------
        // Another Exercice will come ...


        // ternaryOperator();
        // temperatureConverter using ternary operator
        // Scanner scanner = new Scanner(System.in);
        // double temp;
        // double newTemp;
        // int choice;

        // System.out.println("Temperature Converter");
        // System.out.println("1. Convert from Celsius to Fahrenheit");
        // System.out.println("2. Convert from Fahrenheit to Celsius");

        // System.out.print("Enter your choice: ");
        // choice = scanner.nextInt();

        // System.out.print("Enter the temperature: ");
        // temp = scanner.nextDouble();

        // newTemp = choice == 1 ? (temp * 9/5) + 32 : (temp - 32) * 5/9;

        // System.out.printf("The temperature is: %.2f", newTemp);

        // scanner.close();


// ---------------------------------------------------------------------------------

        // switch (args) {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }

        String name = "Monday";
        switch (name) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        switch(name) {
            case "Moday" -> System.out.println("Today is Monday");
            case "Tuesday" -> System.out.println("Today is Tuesday");
            case "Wednesday" -> System.out.println("Today is Wednesday");
            case "Thursday" -> System.out.println("Today is Thursday");
            case "Friday" -> System.out.println("Today is Friday");
            case "Saturday" -> System.out.println("Today is Saturday");
            case "Sunday" -> System.out.println("Today is Sunday");
            default -> System.out.println("Invalid day");

        }

        
    }
}
// connected successfully to the github repository