// . Ecrivez un programme qui permet de transformer une température en degrés celcius en degrés
// farenheit. Tf = (Tc * 9 ) +32 (celcius.py) (1, 2, 3, 4)

package dboucles2024;
import java.util.Scanner;

public class celcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduisez la temperature (celcius) : ");
        double tc = scanner.nextDouble();

        double tf = (tc * 9/5 ) + 32;

        System.out.printf("La temperature en farenheit est de %.1f", tf);
        scanner.close();
    }
}
