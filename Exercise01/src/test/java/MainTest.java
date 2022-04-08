import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

/**
 * The type Main test.
 */
public class MainTest {
    /**
     * Test method that confirm if the sum of two integer values is successful.
     */
    @Test
    public void mustSumIntegerNumberCorrectly() {
        int firstInteger = 5;
        int secondInteger = 2;
        int expectedValue = 7;
        int returnedValue;
        Main main = new Main();

        returnedValue = main.sumValues(firstInteger, secondInteger);

        Assert.assertEquals(expectedValue, returnedValue);
    }

    /**
     * Test method that confirm if the subtraction of two integer values is successful.
     */
    @Test
    public void mustSubtractIntegerNumberCorrectly() {
        int firstInteger = 158;
        int secondInteger = 165;
        int expectedValue = -7;
        int returnedValue;
        Main main = new Main();

        returnedValue = main.subtractValues(firstInteger, secondInteger);

        Assert.assertEquals(expectedValue, returnedValue);
    }

    /**
     * Test method that confirm if the division of two integer values is successful.
     */
    @Test
    public void mustDivideIntegerNumberCorrectly() {
        int firstInteger = 11;
        int secondInteger = 2;
        int expectedValue = 5;
        int returnedValue;
        Main main = new Main();

        returnedValue = main.divideValues(firstInteger, secondInteger);

        Assert.assertEquals(expectedValue, returnedValue);
    }

    /**
     * Test method that confirm if the division of one integer value by a null value throws an exception.
     */
    @Test
    public void mustNotDivideIntegerNumberCorrectlyWhenSecondNumberIsNull() {
        int firstInteger = 5;
        int secondInteger = 0;
        final int[] returnedValue = new int[1];
        Main main = new Main();

        Exception exception = assertThrows(RuntimeException.class, () ->
                returnedValue[0] = main.divideValues(firstInteger, secondInteger)
        );

        returnedValue[0] = main.sumValues(firstInteger, secondInteger);

        Assert.assertNotNull(exception.getMessage());
    }

    /**
     * Test method that confirm if the division of two integer values is successful.
     */
    @Test
    public void mustMultiplyIntegerNumberCorrectly() {
        int firstInteger = 11;
        int secondInteger = 11;
        int expectedValue = 121;
        int returnedValue;
        Main main = new Main();

        returnedValue = main.multiplyValues(firstInteger, secondInteger);

        Assert.assertEquals(expectedValue, returnedValue);
    }
}
