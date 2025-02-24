package small_project;
import java.util.ArrayList;
import java.util.Scanner;

class library_v01 {

    public static void menu() {
        System.out.println("1. Afficher la liste des livres");
        System.out.println("2. Ajouter un livre");
        System.out.println("3. Supprimer un livre");
        System.out.println("4. Modifier un livre");
        System.out.println("5. Quitter");
        System.out.println();

        
    }

    public static void addBook(ArrayList<String> books) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le titre du livre : ");
        String title = scanner.nextLine();
        books.add(title);

        System.out.println("Entrez le nom de l'auteur : ");
        String author = scanner.nextLine();
        books.add(author);

        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> books = new ArrayList<String>();
        // books.add("The Catcher in the Rye");
        // books.add("To Kill a Mockingbird");
        // books.add("1984");

        int choice = 0;
        do {
            menu();
            System.out.print("-> : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(books);
                    break;
                case 2:
                    addBook(books);
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