package class_java_exercie.test;
// Define the Calculator class
public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract the second integer from the first
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide the first integer by the second
    public String divide(int a, int b) {
        if (b == 0) {
            return "Division by zero is not allowed.";
        }
        return String.valueOf(a / b);
    }

    // Bonus: Method to calculate the power of a number
    public int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

// Main class to test the Calculator class
// public class Calculatortest1 {
//     public static void main(String[] args) {
//         // Create an instance of the Calculator class
//         Calculator calculator = new Calculator();

//         // Test the add method
//         System.out.println("Addition: " + calculator.add(5, 3)); // Output: 8

//         // Test the subtract method
//         System.out.println("Subtraction: " + calculator.subtract(5, 3)); // Output: 2

//         // Test the multiply method
//         System.out.println("Multiplication: " + calculator.multiply(5, 3)); // Output: 15

//         // Test the divide method
//         System.out.println("Division: " + calculator.divide(6, 3)); // Output: 2
//         System.out.println("Division by zero: " + calculator.divide(6, 0)); // Output: Division by zero is not allowed.

//         // Test the power method
//         System.out.println("Power: " + calculator.power(2, 3)); // Output: 8
//     }
// }
