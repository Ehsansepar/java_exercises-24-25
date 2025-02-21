package array;

public class exe03 {

    public static int TrouverLaMaximumListe(int[] nombres) {
        int max = 0;

        for(int nombre : nombres) {
            if (nombre > max) {
                max = nombre;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nbrs = {25, 89, 65, 99, 13, 78, 12, 33, 68, 17};
        int resultat;

        for (int nbr : nbrs) {
            System.out.printf("%d, ", nbr);
        }

        resultat = TrouverLaMaximumListe(nbrs);

        System.out.printf("\nLe nombre plus grand dans cette liste est ( %d )", resultat);
    }
}
