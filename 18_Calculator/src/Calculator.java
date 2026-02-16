
public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("No result");
            return -1;
        } else {
            return (double)a / b;
        }
    }

    public static void main(String[] args) {

        int num1 = 17;
        int num2 = 3;

        System.out.println("Addition        -> " + num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println("Subtraction     -> " + num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println("Multiplication  -> " + num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println("Division        -> " + num1 + " / " + num2 + " = " + divide(num1, num2));

    }
}
