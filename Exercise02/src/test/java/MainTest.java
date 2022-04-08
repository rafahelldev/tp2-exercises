import org.junit.Assert;
import org.junit.Test;

/**
 * The type Main test.
 */
public class MainTest {
    /**
     * Test method that confirm if the sum of two float values is successful.
     */
    @Test
    public void mustSumFloatNumberCorrectly() {
        float firstFloat = 5.0f;
        float secondFloat = 2.0f;
        float expectedValue = 7.0f;
        float returnedValue;
        Main main = new Main();

        returnedValue = main.sumValues(firstFloat, secondFloat);

        Assert.assertEquals(expectedValue, returnedValue, 0.001);
    }

    /**
     * Test method that confirm if the subtraction of two float values is successful.
     */
    @Test
    public void mustSubtractFloatNumberCorrectly() {
        float firstFloat = 158.0f;
        float secondFloat = 165.0f;
        float expectedValue = -7.0f;
        float returnedValue;
        Main main = new Main();

        returnedValue = main.subtractValues(firstFloat, secondFloat);

        Assert.assertEquals(expectedValue, returnedValue, 0.001);
    }

    /**
     * Test method that confirm if the division of two float values is successful.
     */
    @Test
    public void mustDivideFloatNumberCorrectly() {
        float firstFloat = 11.0f;
        float secondFloat = 2.0f;
        float expectedValue = 5.5f;
        float returnedValue;
        Main main = new Main();

        returnedValue = main.divideValues(firstFloat, secondFloat);

        Assert.assertEquals(expectedValue, returnedValue, 0.001);
    }

    /**
     * Test method that confirm if the division of one float value by a null value throws an exception.
     */
    @Test
    public void mustNotDivideFloatNumberCorrectlyWhenSecondNumberIsZero() {
        float firstFloat = 5.0f;
        float secondFloat = 0f;
        float returnedValue;
        Main main = new Main();

        returnedValue = main.divideValues(firstFloat, secondFloat);

        Assert.assertEquals(Float.POSITIVE_INFINITY, returnedValue, 0.0);
    }

    /**
     * Test method that confirm if the division of two float values is successful.
     */
    @Test
    public void mustMultiplyFloatNumberCorrectly() {
        float firstFloat = 11.0f;
        float secondFloat = 11.0f;
        float expectedValue = 121.0f;
        float returnedValue;
        Main main = new Main();

        returnedValue = main.multiplyValues(firstFloat, secondFloat);

        Assert.assertEquals(expectedValue, returnedValue, 0.001);
    }
}
