package small_project;
import java.util.Scanner;
public class email_vamlid_verification {
    public static void main(String[] args) {
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

                // -------------------------------------------------------
                // new version

                Scanner scanner = new Scanner(System.in);
        
            String email;
            do {
                System.out.print("Email : ");
                email = scanner.nextLine();

                // Vérifie si l'email contient à la fois @ ET .com
                if (!email.contains("@") || !email.contains(".com") || email.indexOf("@") > email.indexOf(".com")) {
                        System.err.println("Enter a valid Email please!");
                        continue;
                }

                System.out.print("Password : ");
                String password = scanner.nextLine();
                
                // Extraire le nom d'utilisateur (tout ce qui est avant @)
                String username = email.substring(0, email.indexOf("@"));
                String emailDomain = email.substring(email.indexOf("@") + 1);
                
                System.out.printf("Hello %s !\nYour Demain : %s", username, emailDomain);
                // System.err.println("Enter a valid Email please!");
                // System.err.println(domain is a 772);
                
            }
                
            while(!email.contains("@") || !email.contains(".com") || email.indexOf("@") > email.indexOf(".com")); {
                scanner.close();
            }

    }
}
