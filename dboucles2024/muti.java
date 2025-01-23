// 1. Etablir un programme qui permet de tirer 25 nombres au hasard compris entre 1 et 100.
// D'afficher uniquement les multiples de 9 et de les comptabiliser (comptabiliser = combien il y
// en a) (mult9.py). (1, 6, 9, 5, 4, 7, 4) 


package dboucles2024;
import java.util.Random;

public class muti {
    public static void main(String[] args) {

    Random random = new Random();
    int compteur = 0;
    for(int i=1;i<=25;i++) {
        int nombre = random.nextInt(0, 101);
        if (nombre % 9 == 0) {
            // System.out.printf("%d, ", nombre);
            compteur++;
        }
        System.out.printf("%d, ", nombre);
    }
    System.out.printf("\nIl y a %d fois nombre que ca multiple de 9 ", compteur);
    
    }
}
