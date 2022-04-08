import java.util.Scanner;

/**
 * The class Salary increase calculator.
 */
public class SalaryIncreaseCalculator {
    /**
     * The Scan.
     */
    public final Scanner scan = new Scanner(System.in);

    /**
     * Salary update float.
     *
     * @param salary       the initial salary value
     * @param increaseRate the increase rate
     * @return the salary updated
     */
    public float salaryUpdate(float salary, float increaseRate) {
        salary += salary * (increaseRate / 100);

        return salary;
    }

    /**
     *
     * @param value the final salary value is printed for user
     */
    private void printResult(float value) {
        System.out.println("New salary: R$ " + value);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SalaryIncreaseCalculator thisClass = new SalaryIncreaseCalculator();

        float salary;
        float increaseRate;
        float result;

        System.out.println("Insert the initial salary:");
        salary = thisClass.scan.nextFloat();
        System.out.println("Insert the increase rate:");
        increaseRate = thisClass.scan.nextFloat();

        result = thisClass.salaryUpdate(salary, increaseRate);

        thisClass.printResult(result);
    }
}
