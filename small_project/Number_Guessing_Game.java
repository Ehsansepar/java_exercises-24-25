package small_project;
import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nbr_original = random.nextInt(0, 101);

        System.out.print("Entrez un nombre pour deviner (entre 0 et 100) : ");
        int nbr_devine = scanner.nextInt();

        while (nbr_devine != nbr_original) {

            if (nbr_devine > nbr_original) {
                System.out.println("Le nombre est plus grand que le nombre à deviner");
            }
            else {
                System.out.println("Le nombre est plus petit que le nombre à deviner");
            }
            
            System.out.print("Entrez un nouveau nombre : ");
            nbr_devine = scanner.nextInt();

        }

        System.out.println("Bravo ! Vous avez trouvé le nombre !");
        scanner.close();
    }    
}