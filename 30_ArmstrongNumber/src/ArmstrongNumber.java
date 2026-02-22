
import java.util.Scanner;


public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            sum += lastDigit * lastDigit * lastDigit;
            number = number / 10;
        }

        System.out.printf("Number: %d\nSum: %d\n\n", original, sum);

        if(original == sum) {
            System.out.println("A Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }
    }
}
