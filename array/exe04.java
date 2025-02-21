package array;

public class exe04 {

    public static double trouverMoyenList(int[] nombres) {
        int somme = 0;
        for (int i = 0; i < nombres.length; i++) {
            somme += nombres[i];
        }
        return (double) somme / nombres.length;
    }

    public static void main(String[] args) {
        int[] nombres = {15, 89, 5, 99, 23, 78, 12, 33, 68, 16};
        int[] nombreGrand30 = new int[100];
        int compteur = 0;

        System.out.print("Liste : ");
        for (int nombre : nombres) {
            if (nombre > 30) {
                nombreGrand30[compteur++] = nombre;
            }
            System.out.printf("%d ", nombre);
        }
        System.out.println();

        double trouverMoyen = trouverMoyenList(nombres);
        System.out.printf("La moyenne est: %.2f.\n", trouverMoyen);

        System.out.printf("Le nombre de valeur plus grand que 30 est : %d\n", compteur);
        System.out.print("Les Nombres plus grand de 30 sont : ");
        for (int i = 0; i < compteur; i++) {
            System.out.printf("%d ", nombreGrand30[i]);
        }
        System.out.println();
    }
}
