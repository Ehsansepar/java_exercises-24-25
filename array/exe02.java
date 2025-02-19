package array;
import java.util.Random;

public class exe02 {
    
    public static void main(String[] args) {
        Random random = new Random();
        int[] nbrs = new int[25];
        
        for(int i=0; i < nbrs.length; i++) {
            nbrs[i] = random.nextInt(0, 100);
        }

        for (int j = 0; j < nbrs.length; j++) {

        }

        for (int nbr : nbrs) {
            System.out.printf("%d, ", nbr);
        }
    }
}
