package array;

public class exe08 {
    public static void main(String[] args) {
        int[] vecteur = {27, 62};
        int temp = vecteur[0];
        vecteur[0] = vecteur[1];
        vecteur[1] = temp;

        for (int i : vecteur) {
            System.out.print(i + " ");
        }
    }
}
