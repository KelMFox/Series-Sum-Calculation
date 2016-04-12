import java.util.Scanner;

/**
 * Created by Kelly on 4/12/2016.
 */
public class SeriesDriver {

    public static void main(String[] args) {

        // Create custom exception handler
        class TooLargeSmall extends Exception {
                public TooLargeSmall() {
            }
        }
        // Specify when to close the program
        boolean getIndex = false;

        // Get input from the user
        Scanner input = new Scanner(System.in);

        // Hold the user's input
        String userIn;
        int index;

        // Describe the program's function
        System.out.println("This calculator will solve the following " +
                "series, where i is the index: \nS(i) = 1 + 1/2\u00b2 + 1/3\u00b2"
                + " 1/4\u00b2 + 1/5\u00b2 + ... + 1/i\u00b2");

        do {
            try {
                // Get the index from the user
                System.out.print("\nPlease pick an index between " +
                        "1 and 70: ");

                userIn = input.nextLine();

                index = Integer.parseInt(userIn);

                // Throw exception if the user enters a number over 70
                // or less than 1
                if (index > 70 || index < 1)
                    throw new TooLargeSmall();

                // Display the result of the computation using the
                // iterative method
                System.out.println("\nIterative Method Calculation:\n" +
                        "The sum of the " + "series at index " + index +
                        " is " + SeriesCalc.seriesIter(index));

                // Display the result of the computation using the
                // recursive method
                System.out.println("\nRecursive Method Calculation:\nThe "
                        + "sum of the series at index " + index + " is "
                        + SeriesCalc.seriesRec(index));

                getIndex = true;
            }
            catch (NumberFormatException | StackOverflowError | TooLargeSmall ex)
            {
                System.err.println("\nThe index entered is not valid.\n");
            }
        } while (!getIndex);
    }
}
