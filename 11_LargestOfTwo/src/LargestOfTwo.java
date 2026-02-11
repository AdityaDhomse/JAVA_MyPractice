
public class LargestOfTwo {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.printf("a is larger than b --> %d > %d", a, b);
        } else if (a < b) {
            System.out.printf("b is larger than a --> %d > %d", b, a);
        } else {
            System.out.printf("Both a and b are equal --> %d = %d", a, b);
        }

    }

}
