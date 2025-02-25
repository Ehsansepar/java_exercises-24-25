package small_project;
import java.util.ArrayList;
import java.util.Scanner;

class library_v01 {
    public static ArrayList<Integer> id = new ArrayList<Integer>();
    public static ArrayList<String> titres = new ArrayList<String>();
    public static ArrayList<String> authors = new ArrayList<String>();

    public static String afficherBooks(ArrayList<Integer> id, ArrayList<String> titres, ArrayList<String> authors) {
        if (id.isEmpty() || titres.isEmpty() || authors.isEmpty()) {
            return "No books available.";
        }
        if (id.size() != titres.size() || id.size() != authors.size()) {
            return "Error: Lists are not of the same size.";
        }
        String result = "";
        for (int i = 0; i < titres.size(); i++) {
            result +=   "ID: " + id.get(i) +
                        " | Titre: " + titres.get(i) +
                        " | Auteur: " + authors.get(i) + "\n";
        }
        return result;
    }

    public static void addBook(Scanner scanner) {
        System.out.print("Entrez le titre du livre : ");
        String title = scanner.nextLine();
        titres.add(title); 

        System.out.print("Entrez le nom de l'auteur : ");
        String author = scanner.nextLine();
        authors.add(author);
        id.add(titres.size());
    }

    public static void deleteBook(Scanner scanner) {
        System.out.print("Entrez l'ID du livre a supprimer : ");
        int ids = scanner.nextInt();
        // scanner.nextLine(); 
        if (ids <= 0 || ids > titres.size()) {
            System.out.println("Livre non trouvé.");
            return;
        }
        titres.remove((ids-1));
        authors.remove((ids-1));
        id.remove((ids-1));
    }

    public static void menu() {
        System.out.println("1. Afficher la liste des livres");
        System.out.println("2. Ajouter un livre");
        System.out.println("3. Supprimer un livre");
        System.out.println("4. Modifier un livre");
        System.out.println("5. Quitter");
        System.out.println();
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
                    System.out.println(afficherBooks(id, titres, authors));
                    break;
                case 2:
                    addBook(scanner);
                    break;
                case 3:
                    deleteBook(scanner);
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