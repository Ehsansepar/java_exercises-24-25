package array;

public class exe12 {
    public static void main(String[] args) {
        int[] nbrs={25, 89, 65, 99, 13, 78, 12, 33, 68, 17};
        //        0   1   2   3   4   5    6   7   8   9

        int count = 0;
        System.out.print("Dans cette liste les nombres pairs sont: ");
        for (int i = 0; i < nbrs.length; i++) {
            if (nbrs[i] % 2 == 0) {
            System.out.print(nbrs[i] + " (index " + i + ") ");
            count++;
            }
        }
        System.out.println("\nIl y a " + count + " nombres pairs dans la liste.");
    }
}
