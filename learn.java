import java.util.Scanner;

public class learn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        
        while (name.contains(" ")) {
            System.out.println("Please enter your name without any spaces");
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello, " + name + "!");
        
        scanner.close();

        // learnning



        // System.out.println(lastIndex);
        // System.out.println(name.length());
        // char lettre = name.charAt(0);
        // int index = name.indexOf("a");
        // int lastIndex = name.lastIndexOf("a");
        // String upper = name.toUpperCase();
        // String lower = name.toLowerCase();

        // String nameWithSpace = "  Ehsan  "; 
        // String removeSpace = nameWithSpace.trim();
        // String replaceString = name.replace(nameWithSpace, removeSpace);


    }
}
