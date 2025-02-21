package array;

public class exe06 {
        public static int[] longueurElementStringList(String[] stringListe) {
            int[] newlst = new int[stringListe.length];
        
            for(int i = 0; i < stringListe.length; i++) {
                newlst[i] = stringListe[i].length(); // Stocke la longueur de chaque chaîne
                
                // Affiche chaque chaîne et sa longueur de manière plus lisible
                // System.out.printf("Chaîne : '%s' | Longueur : %d%n", stringListe[i], newlst[i]);
            }
    
            return newlst; 
	}

    public static void main(String[] args) {
        String[] capitales = {"Bruxelles","Paris","Londres","Berlin","Luxembourg","Madrid","Rome"};

        int[] longueurs = longueurElementStringList(capitales);
        for (int i = 0; i < capitales.length; i++) {
            System.out.printf("Chaîne : '%s' | Longueur : %d%n", capitales[i], longueurs[i]);
            System.out.printf("%s %d%n", capitales[i], longueurs[i]);

        }
    }
}
