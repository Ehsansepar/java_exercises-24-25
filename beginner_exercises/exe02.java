// Ecrire un script qui permet d'afficher les 10 premiers termes de n'importe quelle table de
// multiplication, utilisez i dans votre multiplication. (1, 2, 6, 3, 4)


package beginner_exercises;
import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int nbr_choisi;
        System.out.print("Entrer un nombre pour sa Table Multiplication : ");
        nbr_choisi = scanner.nextInt();

        int i = 1;
        while(i <= 10) {
            // String table = "%d X 3 = %d", i;
            System.out.printf("%1d X %d = %3d\n", i,nbr_choisi , (i*nbr_choisi));
            i++;
        }

        scanner.close();
    }
}
