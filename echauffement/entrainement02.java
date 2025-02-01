package echauffement;
import java.util.Scanner;

public class entrainement02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Combien de lignes ? ");
        int ligne = scanner.nextInt();
        
        int nbEtoile = 1;
        int nbEspace = ligne - 1;
        
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < nbEspace; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < nbEtoile; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            
            nbEspace--;
            nbEtoile += 2;
        }
        
        scanner.close();
    }
}
