public class TimeConversion {
    public static void main(String[] args) {

        int totalSeconds = 8456;

        int hour = totalSeconds / 3600;
        int remainingSeconds  = totalSeconds % 3600;

        int minutes = remainingSeconds  / 60;
        int seconds = remainingSeconds  % 60;

        System.out.println(hour + " hour\n"
            + minutes + " minute\n"
            + seconds + " seconds"
        );

    }
}
