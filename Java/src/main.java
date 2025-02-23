import array.exe13;
public class main {
    public static void main(String[] args) {
        exe13 trouver = new exe13(); // testing connection with class
        int[] nombre = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int max = exe13.MaxInsideList(nombre);
        int min = exe13.MinInsideList(nombre);

        System.out.println(max);
        System.out.println(min);

    }
}

// testing the classes 

