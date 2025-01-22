// Ecrire un script qui permet à l'utilisateur d'introduire un nombre et qui lui indique s'il est pair
// ou impair. Pas besoin de boucle
// % (modulo) représente le reste de la division (entier)
// ex 7%2 donne comme résultat 1 et 6%2 donne comme résultat 0
// (1, 2, 5, 4)

package beginner_exercises;
import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer un nombre : ");
        int nombre = scanner.nextInt();

        if (nombre % 2 == 0) {
            System.out.printf("Le numéro %d est pair", nombre);
        }
        else {
            System.out.printf("Le numéro %d est impair", nombre);
        }
        scanner.close();
            
    }
}
