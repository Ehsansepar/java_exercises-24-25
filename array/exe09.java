package array;
public class exe09 {
    public static void main(String[] args) {


        int[] facturegsm = {25, 55, 20, 63, 120, 45, 67, 81, 96, 26, 56, 36};
        String[] mois = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};

        int comptSup50 = 0;

        for (int i=0; i<facturegsm.length;i++) {
            if (facturegsm[i] > 50) {
                comptSup50++;
            }
        }
        System.out.printf("Noimbre de mois où les dépenses sont supérieures à 50 : %d", comptSup50);

        for (int j=0;j<facturegsm.length;j++) {
            if (facturegsm[j] > 50) {
                System.out.println(mois[j] + " | " + facturegsm[j]);
            }
        }

        // double somme = 0;

        // for (int facture : facturegsm) {
        //     somme += facture;
        // }
        System.out.printf("\nMoyenne mensuelle des dépenses : %.2f", exe04.trouverMoyenList(facturegsm));
    }
}
