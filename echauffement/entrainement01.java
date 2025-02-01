package echauffement;
import java.util.Scanner;

public class entrainement01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Suite de Fibonacci, combien de termes voulez-vous afficher : ");
        int nbTerme = scanner.nextInt();

        int nb1 = 0;
        int nb2 = 1;

        // Afficher les deux premiers nombres
        System.out.print(nb1 + " " + nb2 + " ");

        // Boucle pour générer les nombres suivants
        for (int i = 2; i < nbTerme; i++) {
            int nombre = nb1 + nb2;
            System.out.print(nombre + " ");
            
            nb1 = nb2;
            nb2 = nombre;
        }
        
        scanner.close();
    }
}
