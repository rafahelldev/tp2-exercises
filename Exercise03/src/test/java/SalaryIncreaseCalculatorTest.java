import org.junit.Assert;
import org.junit.Test;

public class SalaryIncreaseCalculatorTest {
    @Test
    public void mustIncreaseSalaryCorrectly() {
        float salary = 1212.00f;
        float increaseRate = 15.29f;
        float expectedValue = 1397.315f;
        float returnedValue;
        SalaryIncreaseCalculator mainClass = new SalaryIncreaseCalculator();

        returnedValue = mainClass.salaryUpdate(salary, increaseRate);

        Assert.assertEquals(expectedValue, returnedValue, 0.01);
    }
}
