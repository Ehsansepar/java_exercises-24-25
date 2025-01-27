
import java.util.Scanner;

public class alternative01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int number;
        
        
        while (true) {
            String demande;
    
            System.out.print("Donner un nombre compris entre 0 et 19 et quitter entre ( q ) :");
            // number = scanner.nextInt();
            demande = scanner.nextLine();
            
            if (demande.equals("q")) {
                System.out.println("Vous avez quitté \n Au revoir");
                break;
            }
            
            
            try {
                int nombre = Integer.parseInt(demande);
                if (nombre >= 0 && nombre <= 19) {
                    System.out.println("OK. Merci !");
                } else {
                    System.out.println("ERREUR : Le nombre devait être compris entre 0 et 19 inclus !");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERREUR : Entrez un nombre valide ou 'q' pour quitter !");
            }
        
        }
        scanner.close();
}
}
