public class isEvenOdd {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        int number = 15;
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
