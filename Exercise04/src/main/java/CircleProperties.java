import java.util.Scanner;

/**
 * The main class.
 */
public class CircleProperties {
    private static final Scanner scan = new Scanner(System.in);

    /**
     * Calculate the perimeter value of a circle.
     *
     * @param radius the circle radius value
     * @return the result
     */
    public float perimeter(float radius) {
        return (2.0f * (float) Math.PI * radius);
    }

    /**
     * Calculate the area value of a circle.
     *
     * @param radius the circle radius value
     * @return the result
     */
    public float area(float radius) {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    /**
     * Print the results - perimeter and area.
     *
     * @param perimeter the perimeter
     * @param area      the area
     */
    public void printResult(float perimeter, float area) {
        System.out.printf("Perimeter: %.2f", perimeter);
        System.out.printf("%nPerimeter: %.2f", area);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        CircleProperties circle = new CircleProperties();

        float radius;
        float perimeterValue;
        float areaValue;

        System.out.println("Typo the circle radius:");
        radius = scan.nextFloat();

        perimeterValue = circle.perimeter(radius);
        areaValue = circle.area(radius);

        circle.printResult(perimeterValue, areaValue);
    }
}
