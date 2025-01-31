import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantite;
        double total;

        System.out.print("What item would you like to buy ? : ");
        item = scanner.nextLine();

        System.out.print("what is the price ? :");
        price = scanner.nextDouble();
        
        System.out.print("How many would you like ? : ");
        quantite = scanner.nextInt();

        total = (price * quantite);

        System.out.println("You have bought " + quantite + item + "/s");
        System.out.println("Your total is " + total);


        scanner.close();
    }
}
weekend.