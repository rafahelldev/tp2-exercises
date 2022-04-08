import org.junit.Assert;
import org.junit.Test;

/**
 * The tests.
 */
public class CirclePropertiesTest {
    /**
     * Confirm if the circle perimeter is calculated correctly.
     */
    @Test
    public void mustCalculatePerimeterCorrectly() {
        float radius = 5.0f;
        float expectedValue = 31.416f;
        float returnedValue;
        CircleProperties circle = new CircleProperties();

        returnedValue = circle.perimeter(radius);

        Assert.assertEquals(expectedValue, returnedValue, 0.01);
    }

    /**
     * Confirm if the circle area is calculated correctly.
     */
    @Test
    public void mustCalculateAreaCorrectly() {
        float radius = 11.0f;
        float expectedValue = 380.133f;
        float returnedValue;
        CircleProperties circle = new CircleProperties();

        returnedValue = circle.area(radius);

        Assert.assertEquals(expectedValue, returnedValue, 0.01);
    }
}
