import java.util.Scanner;

/**
 * The time calculator.
 */
public class TimeCalculate {
    private static final Scanner scan = new Scanner(System.in);

    private void printResults(String message) {
        System.out.println("\n" + message);
    }

    /**
     * Define time in string format.
     *
     * @param totalSeconds the total seconds
     * @return the time (string)
     */
    public String defineTime(int totalSeconds) {
        int hours;
        int minutes;
        int seconds;

        hours = totalSeconds / 3600;
        minutes = totalSeconds % 3600 / 60;
        seconds = totalSeconds - (hours * 3600 + minutes * 60);

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int totalSeconds;
        String result;
        TimeCalculate time = new TimeCalculate();

        System.out.println("Insert the number of seconds:");
        totalSeconds = scan.nextInt();

        result = time.defineTime(totalSeconds);
        time.printResults(result);
    }
}
