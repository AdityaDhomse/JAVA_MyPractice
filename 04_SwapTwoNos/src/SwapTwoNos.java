
public class SwapTwoNos {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        int temp;

        System.out.println("------Before Swap------");
        System.out.println("a: " + a + "\nb: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("------After Swap------");
        System.out.println("a: " + a + "\nb: " + b);

    }
}
