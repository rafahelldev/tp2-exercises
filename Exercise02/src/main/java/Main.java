import java.util.Scanner;

/**
 * The class Main.
 */
public class Main {
    /**
     * Sum two float values and return the result.
     *
     * @param firstFloat  the first float
     * @param secondFloat the second float
     * @return the float
     */
    public float sumValues(float firstFloat, float secondFloat) {
        return firstFloat + secondFloat;
    }

    /**
     * Subtract two float values and return the result.
     *
     * @param firstFloat  the first float
     * @param secondFloat the second float
     * @return the float
     */
    public float subtractValues(float firstFloat, float secondFloat) {
        return firstFloat - secondFloat;
    }

    /**
     * Divide two float values and return the result.
     *
     * @param firstFloat  the first float
     * @param secondFloat the second float
     * @return the float
     */
    public float divideValues(float firstFloat, float secondFloat) {
        float result = Float.POSITIVE_INFINITY;

        try {
            result = firstFloat / secondFloat;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * Multiply two float values and return the result.
     *
     * @param firstFloat  the first float
     * @param secondFloat the second float
     * @return the float
     */
    public float multiplyValues(float firstFloat, float secondFloat) {
        return firstFloat * secondFloat;
    }

    /**
     * Print the results of sum, subtraction, division and multiplication of two float values.
     *
     * @param firstFloat  the first float
     * @param secondFloat the second float
     * @param sumValue      the sum value
     * @param subtractValue the subtract value
     * @param divideValue   the divide value
     * @param multiplyValue the multiply value
     */
    public void printResults(float firstFloat, float secondFloat, float sumValue, float subtractValue, float divideValue, float multiplyValue) {
        System.out.println(firstFloat + " + " + secondFloat + " = " + sumValue);
        System.out.println(firstFloat + " - " + secondFloat + " = " + subtractValue);
        System.out.println(firstFloat + " / " + secondFloat + " = " + divideValue);
        System.out.println(firstFloat + " * " + secondFloat + " = " + multiplyValue);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        float firstFloat;
        float secondFloat;
        float sum;
        float subtract;
        float divide;
        float multiply;

        Scanner scan = new Scanner(System.in);
        Main main = new Main();

        System.out.println("Typo the 1st integer number: ");
        firstFloat = scan.nextFloat();
        System.out.println("Typo the 2nd integer number: ");
        secondFloat = scan.nextFloat();

        sum = main.sumValues(firstFloat, secondFloat);
        subtract = main.subtractValues(firstFloat, secondFloat);
        divide = main.divideValues(firstFloat, secondFloat);
        multiply = main.multiplyValues(firstFloat, secondFloat);

        main.printResults(firstFloat, secondFloat, sum, subtract, divide, multiply);
    }
}
