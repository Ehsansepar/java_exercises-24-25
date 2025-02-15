package class_java_exercie;
import class_java_exercie.test.Calculator;

public class calculetest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resutat = calculator.add(5, 0);

        System.out.println(resutat);
    }
}
