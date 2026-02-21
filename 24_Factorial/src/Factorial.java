public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long factorial = 1;

        for(int i = n; i > 0; i--) {
            factorial *= i;
        }

        System.out.printf("Factorial: %d", factorial);
    }
}