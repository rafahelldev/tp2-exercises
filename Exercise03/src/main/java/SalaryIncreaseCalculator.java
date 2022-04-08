import java.util.Scanner;

public class SalaryIncreaseCalculator {
    public final Scanner scan = new Scanner(System.in);

    public float salaryUpdate(float salary, float increaseRate) {
        salary += salary * (increaseRate / 100);

        return salary;
    }

    private void printResult(float value) {
        System.out.println("New salary: R$ " + value);
    }

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
