// 3. Ecrivez un programme qui permet d'obtenir la figure suivante :
// print("@"*3) donne @@@
// @@
// @@@@
// @@@@@@
// @@@@@@@@
// @@@@@@@@@@
// (arobas.py) (1, 6, 4)


package dboucles2024;
import java.util.Scanner;

public class arobas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre pour faire la schema : ");
        int nombre = scanner.nextInt();
        
        for (int i = 1; i <= nombre; i++) {
            // Build a string with 2*i '@' characters
            String line = "";
            for (int j = 0; j < 2 * i; j++) {
                line += "@";
            }
            System.out.println(line);
        }
        scanner.close();
    }
}