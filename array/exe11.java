package array;

public class exe11 {
    public static void main(String[] args) {
        String[] fruits = {"pomme", "poire", "ananas", "kiwi", "banane", "mangue", "peche", "prune"};

        int compteur = 0;

        for (int i=0; i<fruits.length;i++) {
            System.out.printf("Fruit : %-10s | Lettre : %d%n", fruits[i], fruits[i].length());
            if (fruits[i].length() > 5) {
                compteur++;
            }
        }
        System.out.printf("Il y a %d fruits qui ont plus de 5 lettres", compteur);
    }
}
