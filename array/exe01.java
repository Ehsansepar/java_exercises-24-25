package array;

public class exe01 {

    static int superieur30(int[] nbr) {
        int count = 0;
        for (int num : nbr) {
            if (num > 30) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] b = {15, 89, 5, 99, 23, 78, 12, 33, 68, 16};        

        for (int i = 0; i < b.length; i++) {
            System.out.println("Element at index " + i + ": " + b[i]);
        }

        int countAbove30 = superieur30(b);
        System.out.println("Count of numbers greater than 30: " + countAbove30);
    }
}
