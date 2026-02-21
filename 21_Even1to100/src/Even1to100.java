public class Even1to100 {
    public static void main(String[] args) {
        // int i = 1;
        // while(i <= 100) {
        //     if(i % 2 == 0) {
        //         System.out.print(i + " ");
        //     }
        //     i++;
        // }

        for(int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}