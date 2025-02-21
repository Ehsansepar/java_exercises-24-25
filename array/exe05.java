package array;

public class exe05 {
    public static void main(String[] args) {
        String[] ventes = { "Bruxelles", "12897", "Charleroi", "11782", "Namur", "17651", "Liège", "17670" };
        int totalVentes = 0;
        int nombreVilles = 0;

        for (int i = 1; i < ventes.length; i += 2) {
            totalVentes += Integer.parseInt(ventes[i]);
            nombreVilles++;
        }

        double moyenneVentes = (double) totalVentes / nombreVilles;
        System.out.println("La moyenne des ventes est: " + moyenneVentes);
    }
}
