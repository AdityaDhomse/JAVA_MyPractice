
import java.util.Scanner;


public class MultiplicationTable {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d X %d = %d\n", number, i, number * i);
            i++;
        }
    }
}
