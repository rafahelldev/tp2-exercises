import org.junit.Assert;
import org.junit.Test;

/**
 * The type Energy consumption test.
 */
public class EnergyConsumptionTest {
    /**
     * Must calculate cost correctly when kilowatt consumption is smaller.
     */
    @Test
    public void mustCalculateCostCorrectlyWhenKilowattConsumptionIsSmaller() {
        int totalKilowatt = 117;
        float kilowattPrice = 1.2975f;
        float expectedCost = 136.63f;
        float returnedValue;
        EnergyConsumption calculator = new EnergyConsumption();

        returnedValue = calculator.calculateBill(totalKilowatt, kilowattPrice);

        Assert.assertEquals(expectedCost, returnedValue, 0.01);
    }

    /**
     * Must calculate cost correctly when kilowatt consumption is bigger.
     */
    @Test
    public void mustCalculateCostCorrectlyWhenKilowattConsumptionIsBigger() {
        int totalKilowatt = 175;
        float kilowattPrice = 1.6485f;
        float expectedCost = 288.49f;
        float returnedValue;
        EnergyConsumption calculator = new EnergyConsumption();

        returnedValue = calculator.calculateBill(totalKilowatt, kilowattPrice);

        Assert.assertEquals(expectedCost, returnedValue, 0.01);
    }
}
