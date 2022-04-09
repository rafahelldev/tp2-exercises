import java.util.Scanner;

/**
 * Energy consumption calculator.
 */
public class EnergyConsumption {
    private static final Scanner scan = new Scanner(System.in);

    /**
     * Calculate bill cost.
     *
     * @param totalKilowatt the total kilowatt
     * @param kilowattPrice the kilowatt price
     * @return the bill cost value
     */
    public float calculateBill(int totalKilowatt, float kilowattPrice) {
        float cost = totalKilowatt * kilowattPrice;

        if (totalKilowatt < 150)
            cost *= 0.9;

        return cost;
    }

    /**
     * Print result.
     *
     * @param value the value
     */
    public void printResult(float value) {
        System.out.printf("%nBill: R$ %.2f", value);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int totalKilowatt;
        float kilowattPrice;
        float finalValue;
        EnergyConsumption calculator = new EnergyConsumption();

        System.out.println("Insert the total kilowatts consumed:");
        totalKilowatt = scan.nextInt();
        System.out.println("Insert the kilowatt price:");
        kilowattPrice = scan.nextFloat();

        finalValue = calculator.calculateBill(totalKilowatt, kilowattPrice);

        calculator.printResult(finalValue);
    }
}
