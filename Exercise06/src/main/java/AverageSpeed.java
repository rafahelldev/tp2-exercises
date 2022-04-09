import java.util.Scanner;

/**
 * The Average speed.
 */
public class AverageSpeed {
    private static final Scanner scan = new Scanner(System.in);

    /**
     * Calculate average speed float.
     *
     * @param totalMeters  the total meters travelled
     * @param totalMinutes the total minutes spent
     * @return the result
     */
    public float calculateAverageSpeed(int totalMeters, int totalMinutes) {
        return ((float) totalMeters / totalMinutes) * 3.6f;
    }

    /**
     * Print result - the average speed.
     *
     * @param value the value
     */
    public void printResult(float value) {
        System.out.printf("%nAverage speed: %.2f", value);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int totalMinutes;
        int totalMeters;
        float averageSpeedValue;
        AverageSpeed averageSpeed = new AverageSpeed();

        System.out.println("Enter the total meters travelled:");
        totalMeters = scan.nextInt();
        System.out.println("Enter the total minutes spent:");
        totalMinutes = scan.nextInt();

        averageSpeedValue = averageSpeed.calculateAverageSpeed(totalMeters, totalMinutes);

        averageSpeed.printResult(averageSpeedValue);
    }
}
