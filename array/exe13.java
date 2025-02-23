package array;

public class exe13 {

    public static int MaxInsideList(int[] liste) {
        int max = 0;
        int min = 0;
        for(int i = 0; i<liste.length;i++) {
            if (max < liste[i]) {
                max = liste[i];
            } else {
                min = liste[i];
            }
        }
        return max;
    }

    public static int MinInsideList(int[] liste) {
        int max = 0;
        int min = 0;
        for(int i = 0; i<liste.length;i++) {
            if (max < liste[i]) {
                max = liste[i];
            } else {
                min = liste[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nb = {25,89,65,99,13,78,12,33,68,17};

        int max = 0;
        int min = 0;

        for(int i = 0; i<nb.length;i++) {
            if (max < nb[i]) {
                max = nb[i];
            } else {
                min = nb[i];
            }
        }
        System.out.printf("Max : %d | Min : %d", max, min);
    }
}
