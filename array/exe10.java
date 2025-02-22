package array;

import java.util.Random;
import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] lst50 = new int[200];
        
        for (int i = 0; i<200; i++) {
            lst50[i] = (random.nextInt(0, 101) > 50) ? random.nextInt(0, 101) : 0;
        
        }
        for (int nbr : lst50) {
            System.out.println(nbr + " ");

        }
        
        scanner.close();
    }
}
