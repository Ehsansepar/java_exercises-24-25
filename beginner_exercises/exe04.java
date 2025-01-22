// Ecrire un script qui permet à l'utilisateur d'introduire 5 nombres, d'en faire la somme et de
// l'afficher. Utilisez une boucle !! ( 1, 6, 2, 8, 4)
// utilise un accumulateur

package beginner_exercises;
import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5;i++) {
            if (i == 1) {
                System.out.printf("Entrer votre %dere note : ");
            }
            else {
                System.out.printf("Entrer votre %deme notre : ");
            }
        }
    }
}
