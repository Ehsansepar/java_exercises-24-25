// Ecrire un script qui permet d'afficher 55 nombres tirés au hasard et compris entre 0 et 100
// (1, 6, 9, 4)


package beginner_exercises;
import java.util.Random;

public class exe03 {
    public static void main(String[] args) {
        for (int i = 0;i<=55;i++) {
            Random random = new Random();
            System.out.printf("%d, ",random.nextInt(0, 100));
            }
    }
}
