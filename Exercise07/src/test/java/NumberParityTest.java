import org.junit.Assert;
import org.junit.Test;

/**
 * The tests.
 */
public class NumberParityTest {
    /**
     * Must define parity correctly.
     */
    @Test
    public void mustDefineParityCorrectly() {
        int number = 5;
        boolean returnedValue;
        NumberParity numberParity = new NumberParity();

        returnedValue = numberParity.defineParity(number);

        Assert.assertFalse(returnedValue);
    }
}
