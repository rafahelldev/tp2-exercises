import java.util.Scanner;

/**
 * The class Main.
 */
public class Main {
    /**
     * Sum two integer values and return the result.
     *
     * @param firstInteger  the first integer
     * @param secondInteger the second integer
     * @return the int
     */
    public int sumValues(int firstInteger, int secondInteger) {
        return firstInteger + secondInteger;
    }

    /**
     * Subtract two integer values and return the result.
     *
     * @param firstInteger  the first integer
     * @param secondInteger the second integer
     * @return the int
     */
    public int subtractValues(int firstInteger, int secondInteger) {
        return firstInteger - secondInteger;
    }

    /**
     * Divide two integer values and return the result.
     *
     * @param firstInteger  the first integer
     * @param secondInteger the second integer
     * @return the int
     */
    public int divideValues(int firstInteger, int secondInteger) {
        return firstInteger / secondInteger;
    }

    /**
     * Multiply two integer values and return the result.
     *
     * @param firstInteger  the first integer
     * @param secondInteger the second integer
     * @return the int
     */
    public int multiplyValues(int firstInteger, int secondInteger) {
        return firstInteger * secondInteger;
    }

    /**
     * Print the results of sum, subtraction, division and multiplication of two integer values.
     *
     * @param firstInteger  the first integer
     * @param secondInteger the second integer
     * @param sumValue      the sum value
     * @param subtractValue the subtract value
     * @param divideValue   the divide value
     * @param multiplyValue the multiply value
     */
    public void printResults(int firstInteger, int secondInteger, int sumValue, int subtractValue, int divideValue, int multiplyValue) {
        System.out.println(firstInteger + " + " + secondInteger + " = " + sumValue);
        System.out.println(firstInteger + " - " + secondInteger + " = " + subtractValue);
        System.out.println(firstInteger + " / " + secondInteger + " = " + divideValue);
        System.out.println(firstInteger + " * " + secondInteger + " = " + multiplyValue);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int firstInteger;
        int secondInteger;
        int sum;
        int subtract;
        int divide;
        int multiply;

        Scanner scan = new Scanner(System.in);
        Main main = new Main();

        System.out.println("Typo the 1st integer number: ");
        firstInteger = scan.nextInt();
        System.out.println("Typo the 2nd integer number: ");
        secondInteger = scan.nextInt();

        sum = main.sumValues(firstInteger, secondInteger);
        subtract = main.subtractValues(firstInteger, secondInteger);
        divide = main.divideValues(firstInteger, secondInteger);
        multiply = main.multiplyValues(firstInteger, secondInteger);

        main.printResults(firstInteger, secondInteger, sum, subtract, divide, multiply);
    }
}
