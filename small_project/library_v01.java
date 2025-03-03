package small_project;
import java.util.ArrayList;
import java.util.Scanner;

class library_v01 {
    public static ArrayList<Integer> id = new ArrayList<Integer>();
    public static ArrayList<String> titres = new ArrayList<String>();
    public static ArrayList<String> authors = new ArrayList<String>();
    public static ArrayList<String> genres = new ArrayList<String>();
    public static ArrayList<Boolean> status = new ArrayList<Boolean>();
    public static ArrayList<Integer> emprunts = new ArrayList<Integer>();

// *********************************************************************************
    public static String afficherBooks(ArrayList<Integer> id, ArrayList<String> titres, ArrayList<String> authors, ArrayList<String> genres, ArrayList<Boolean> status) {
        if (id.isEmpty() || titres.isEmpty() || authors.isEmpty() || genres.isEmpty() || status.isEmpty()) {
            return "No books available.";
        }
        if (id.size() != titres.size() || id.size() != authors.size() || id.size() != genres.size() || id.size() != status.size() || titres.size() != authors.size() || titres.size() != genres.size() || titres.size() != status.size()) {
            return "Error: Lists are not of the same size.";
        }
        String result = "";
        for (int i = 0; i < titres.size(); i++) {
            result +=   "ID: " + id.get(i) +
                        " | Titre: " + titres.get(i) +
                        " | Auteur: " + authors.get(i) +
                        " | Genre: " + genres.get(i) +
                        " | Emprunts: " + emprunts.get(i) +
                        " | Statut: " + status.get(i) + "\n";
        }
        return result;
    }
// *********************************************************************************
    public static void addBook(Scanner scanner) {
        System.out.print("Entrez le titre du livre : ");
        String title = scanner.nextLine();
        titres.add(title); 

        System.out.print("Entrez le nom de l'auteur : ");
        String author = scanner.nextLine();
        authors.add(author);

        System.out.print("Entrez le genre du livre (Fiction, Science-fiction, Non-fiction) : ");
        String genre = scanner.nextLine().toLowerCase();
        genres.add(genre);

        id.add(titres.size());
        status.add(true);
        emprunts.add(0);
        System.out.println("Livre ajouté.\n");
    }
// *********************************************************************************
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
        genres.remove((ids-1));
        status.remove((ids-1));
        emprunts.remove((ids-1));
        System.out.println("Livre supprimé.\n");
    }
// *******************************************************************************
    public static void updateBook(Scanner scanner) {
        System.out.print("Entrez l'ID du livre a modifier : ");
        int ids = scanner.nextInt();
        scanner.nextLine(); // Consume newline after nextInt()
        
        if (ids <= 0 || ids > titres.size()) {
            System.out.println("Livre non trouvé.");
            return;
        }

        String choix;
        do {
            System.out.println("1. Modifier le titre");
            System.out.println("2. Modifier le nom de l'auteur");
            System.out.println("3. Modifier le statut");
            System.out.println("4. Modifier le genre (Fiction, Science-fiction, Non-fiction)");
            System.out.print("-> : ");
            choix = scanner.nextLine().trim();
            
            if (!choix.equals("1") && !choix.equals("2") && !choix.equals("3") && !choix.equals("4")) {
                System.out.println("Choix invalide. Veuillez choisir 1, 2, 3 ou 4.\n");
            }
        } while (!choix.equals("1") && !choix.equals("2") && !choix.equals("3") && !choix.equals("4"));

        if (choix.equals("1")) {
            System.out.print("Entrez le nouveau titre : ");
            String title = scanner.nextLine();
            titres.set(ids-1, title);
        } else if (choix.equals("2")) {
            System.out.print("Entrez le nouveau nom de l'auteur : ");
            String author = scanner.nextLine();
            authors.set(ids-1, author);
        } else if (choix.equals("3")) {
            System.out.print("Entrez le nouveau statut (true/false) : ");
            String statusInput = scanner.nextLine().toLowerCase();
            boolean newStatus = statusInput.equals("true");
            status.set(ids-1, newStatus);
        } else {
            System.out.print("Entrez le nouveau genre (Fiction, Science-fiction, Non-fiction) : ");
            String genre = scanner.nextLine();
            genres.set(ids-1, genre);
        }
        System.out.println("Livre modifié.\n");
    }
// *******************************************************************************
    public static void statusBook(Scanner scanner) {
        System.out.print("Entrez l'ID du livre : ");
        int ids = scanner.nextInt();
        scanner.nextLine(); // Consume newline after nextInt()
        
        if (ids <= 0 || ids > titres.size()) {
            System.out.println("Livre non trouvé.");
            return;
        }
        System.out.println("Le statut du livre est : " + status.get(ids-1));
        status.set(ids-1, !status.get(ids-1));
        System.out.println("Le statut du livre est maintenant : " + status.get(ids-1) + "\n");
    }
// *********************************************************************************
    public static void searchBook(Scanner scanner) {
        System.out.print("Entrez le genre du livre (Fiction, Science-fiction, Non-fiction) : ");
        String genre = scanner.nextLine().toLowerCase();
        for (int i = 0; i < titres.size(); i++) {
            if (genres.get(i).equals(genre)) {
                System.out.println("Livre trouvé : " + titres.get(i) + " | Auteur : " + authors.get(i));
            }
        }
    }
// *********************************************************************************
    public static void menu() {
        System.out.println("1. Afficher la liste des livres");
        System.out.println("2. Ajouter un livre");
        System.out.println("3. Supprimer un livre");
        System.out.println("4. Modifier un livre");
        System.out.println("5. Rechercher un livre");
        System.out.println("6. Afficher les livres empruntés");
        System.out.println("7. Quitter");
        System.out.println();
    }
// *********************************************************************************
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
                    System.out.println(afficherBooks(id, titres, authors, genres, status));
                    break;
                case 2:
                    addBook(scanner);
                    break;
                case 3:
                    System.out.println(afficherBooks(id, titres, authors, genres, status));
                    deleteBook(scanner);
                    break;
                case 4:
                    System.out.println(afficherBooks(id, titres, authors, genres, status));
                    updateBook(scanner);
                    break;
                case 5:
                    System.out.println(afficherBooks(id, titres, authors, genres, status));
                    searchBook(scanner);
                    break;
                case 6:
                    // displayBorrowedBooks();
                    // System.out.println(afficherBooks(id, titres, authors));
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Number");
            }
        } while (choice != 7);

        scanner.close();
    }
}