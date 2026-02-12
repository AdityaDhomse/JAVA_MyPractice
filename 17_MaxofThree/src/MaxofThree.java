public class MaxofThree {

    public static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 0;
        int num3 = 1;

        int maximum = maxOfThree(num1, num2, num3);

        System.out.println("Maximum Number: " + maximum);
    }
}
