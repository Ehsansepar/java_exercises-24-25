package beginner_exercises;
import java.util.Scanner;

// . Ecrire un script qui permet de calculer le volume d'une sphère 4/3 pi R³
// pi vaut 3.141592

public class exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double PI = 3.141592;
        double r;

        System.out.print("Entrez le rayon de la sphère : ");
        r = scanner.nextDouble();

        double formul = (4/3 * PI * Math.pow(r, 3));
        System.out.println(formul);

        scanner.close();

    }
}
