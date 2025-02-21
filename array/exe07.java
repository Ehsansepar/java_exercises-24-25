package array;

public class exe07 {
    
    public static int trouverGrandNombreIndexList(int[] nombres) {
        int max = 0, index = 0;
        
        for(int i = 0; i < nombres.length;i++) {
            if (max < nombres[i]) {
                max = nombres[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static void main(String[] args) {
        int[] nbrs = {25, 89, 65, 99, 13, 78, 12, 33, 68, 17};
        int index = 0;
        int max = 0;
        
        for (int i=0; i< nbrs.length;i++) {
            if (max < nbrs[i]) {
                max = nbrs[i];
            }
        }

        for (int nbr : nbrs) {
            System.out.printf("Nombre : %d | index : %d \n", nbr, index);
            index++;
        }
        System.out.println();
        System.out.printf("Le nombre le plus grand dans cette liste est: %d avec index de : %d", max, trouverGrandNombreIndexList(nbrs));
        System.out.println();

    }
}
