import java.util.Scanner;

public class alternative03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input_String;
            System.out.print("Donner un nombre entier et pour quitter entrez ( q ) : ");
            input_String = scanner.nextLine();

            if (input_String.equals("q")) {
                System.out.println("Au revoir ! ");
                break;
            }

            int number = Integer.parseInt(input_String);

            if (number % 2 == 0 && number % 3 == 0) {
                System.out.printf("le nombre %d est multiple de 2 et 3 (%d = 2 x %d)");
            }
        }
        scanner.close();
    }
}


// nombre = int(input("Donner un nombre entier : "))
// if nombre % 2 == 0 and  nombre % 3 == 0 :
//     print(f"Le nombre {nombre} est multiple de 2 et 3 ({nombre} = 2 x {nombre//2} et {nombre} = 3 x {nombre//3})")

// elif nombre % 2 == 0 :
//     print(f"Le nombre {nombre} est multiple de 2 ({nombre} = 2 x {nombre//2}).")

// elif nombre % 3 == 0 :
//     print(f"Le nombre {nombre} est multiple de 3 ({nombre} = 2 x {nombre//3}).")

// else :
//     print(f"")
