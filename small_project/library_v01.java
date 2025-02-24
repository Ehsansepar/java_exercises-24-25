package small_project;
import java.util.ArrayList;
import java.util.Scanner;

class library_v01 {
    public static ArrayList<String> books = new ArrayList<String>();

    public static String afficherBooks(ArrayList<String> books) {
        for (int i=0; i<books.size();i++) {
            System.out.println(i + ". " + books.get(i));
        }
        return books.toString();
    }

    public static void menu() {
        System.out.println("1. Afficher la liste des livres");
        System.out.println("2. Ajouter un livre");
        System.out.println("3. Supprimer un livre");
        System.out.println("4. Modifier un livre");
        System.out.println("5. Quitter");
        System.out.println();
    }

    public static void addBook(Scanner scanner) {
        System.out.print("Entrez le titre du livre : ");
        String title = scanner.nextLine();
        books.add(title);

        System.out.print("Entrez le nom de l'auteur : ");
        String author = scanner.nextLine();
        books.add(author);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            menu();
            System.out.print("-> : ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println(afficherBooks(books));
                    break;
                case 2:
                    addBook(scanner);
                    break;
                case 3:
                    // deleteBook(books);
                    break;
                case 4:
                    // updateBook(books);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Number");
            }
        } while (choice != 5);

        scanner.close();
    }
}