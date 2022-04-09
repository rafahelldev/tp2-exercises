import java.util.Scanner;

/**
 * Define number parity.
 */
public class NumberParity {
    private static final Scanner scan = new Scanner(System.in);

    /**
     * Define parity boolean of a number.
     *
     * @param number the integer number
     * @return the result
     */
    public boolean defineParity(int number) {
        return number % 2 == 0;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int number;
        boolean isEven;
        NumberParity numberParity = new NumberParity();

        System.out.println("Insert the number:");
        number = scan.nextInt();

        isEven = numberParity.defineParity(number);

        if (isEven)
            System.out.println("\nNumber is even.");
        else
            System.out.println("\nNumber is odd.");
    }
}
