import org.junit.Assert;
import org.junit.Test;

/**
 * The tests.
 */
public class AverageSpeedTest {
    /**
     * Must calculate average speed correctly.
     */
    @Test
    public void mustCalculateAverageSpeedCorrectly() {
        int totalMeters = 571;
        int totalMinutes = 197;
        float expectedValue = 10.43f;
        float returnedValue;
        AverageSpeed averageSpeed = new AverageSpeed();

        returnedValue = averageSpeed.calculateAverageSpeed(totalMeters, totalMinutes);

        Assert.assertEquals(expectedValue, returnedValue, 0.01);
    }
}
