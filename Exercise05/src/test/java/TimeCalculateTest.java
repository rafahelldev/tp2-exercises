import org.junit.Assert;
import org.junit.Test;

/**
 * The tests.
 */
public class TimeCalculateTest {
    /**
     * Must define time correctly.
     */
    @Test
    public void mustDefineTimeCorrectly() {
        int totalSeconds = 952685;
        String expected = "264:38:05";
        String returned;
        TimeCalculate time = new TimeCalculate();

        returned = time.defineTime(totalSeconds);

        Assert.assertEquals(expected, returned);
    }
}
