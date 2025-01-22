package beginner_exercises;
import java.util.Scanner;

public class exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somme = 0;
        
        while(true) {
            System.out.print("Entrez un nombre : "); // Correction de la conjugaison
            int nombre = scanner.nextInt();
            
            if(nombre < 0) {
                break; // Sortie 
            }
            
            somme += nombre;
        }
        
        System.out.println("La somme est : " + somme);
        scanner.close();
    }
}