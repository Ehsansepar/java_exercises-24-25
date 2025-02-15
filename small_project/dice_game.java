package small_project;

import java.util.Random;
import java.util.Scanner;

public class dice_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nbrDice; 
        int total = 0;


        System.out.print("Enter the # of the dice to roll : ");
        nbrDice = scanner.nextInt();

        if (nbrDice > 0) {
            for (int i=0; i < nbrDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled " + roll);
                total += roll;
            }
            System.out.println("total = " + total);
        }
        else {
            System.out.println("# of dice must be greater then 0");
        }

        scanner.close();
    }

    public static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |   *   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | *     |
                |       |
                |     * |
                 -------
                """;

        String dice3 = """
                 -------
                | *     |
                |   *   |
                |     * |
                 -------
                """;

        String dice4 = """
                 -------
                | *   * |
                |       |
                | *   * |
                 -------
                """;

        String dice5 = """
                 -------
                | *   * |
                |   *   |
                | *   * |
                 -------
                """;

        String dice6 = """
                 -------
                | *   * |
                | *   * |
                | *   * |
                 -------
                """;
        

                switch (roll) {
                    case 1:
                        System.out.print(dice1);
                        break;
                    case 2 :
                        System.out.print(dice2);
                        break;
                    case 3 :
                        System.out.print(dice3);
                        break;
                    case 4 :
                        System.out.print(dice4);
                        break;
                    case 5 :
                        System.out.print(dice5);
                    case 6 :
                        System.out.print(dice6);
                        break;
                    default:
                        System.out.println("Enter a valid number : ");
                        break;
                }

            }

}
