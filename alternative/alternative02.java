import java.util.Scanner;

public class alternative02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input_str;
            System.out.print("Donner un nombre et pour quitter entrez ( q ) : ");
            input_str = scanner.nextLine();

            if (input_str.equals("q")) {
                System.out.println("Au revoir ! ");
                break;
            }

            int nombre = Integer.parseInt(input_str);
            if (nombre % 2 == 0) {
                System.out.printf("\nLe nombre %d est pair\n", nombre);
            }
            else {
                System.out.printf("\nle nombre %d est impaire\n", nombre);
            }
        }
        scanner.close();
    }
}