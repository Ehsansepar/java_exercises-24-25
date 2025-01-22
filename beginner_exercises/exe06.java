// Ecrire un script qui permet de tirer 200 nombres au hasard, compris entre 0 et 100 et qui
// n'affiche que les impairs. (1,6, 9, 5, 4)


package beginner_exercises;
import java.util.Random;

public class exe06 {
    public static void main(String[] args) {
        Random random = new Random();
        
        for (int i = 0;i < 200; i++){
            int nombre = random.nextInt(101); 
            if (nombre % 2 != 0) {
                System.out.printf("%d, ",nombre);
            }
        }
    }
}
