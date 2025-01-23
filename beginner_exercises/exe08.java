// Ecrire un script qui permet de tirer 200 nombres au hasard, compris entre 0 et 100 et qui
// affiche ces nombres s'ils ne sont pas des multiples de 3. (1, 6, 9, 5, 4)

// import java.util.Scanner;

package beginner_exercises;
import java.util.Random;

public class exe08 {
    public static void main(String[] args) {
        Random random = new Random();


        for (int i = 1; i <= 200; i++) {
            int nombre = random.nextInt(100);
            if (nombre % 3 != 0) {
                System.out.printf("%d, ", nombre);   
            }
        }

    }
}
