/**
 * Created by Kelly on 4/12/2016.
 */
public class SeriesCalc {

    /**
     * The seriesIter method uses iteration to find
     * the sum of the series, 1 + (1/2)^2 + (1/3)^2 +
     * (1/4)^2 + ... + (1/n)^2. 
     *
     * @param term
     * @return The sum of the series 
     */
    public static double seriesIter(int term) {

        double iterationSum = 1; // Start of the series

        // For loop iterates until it reaches the
        // the start of the series: 1.
        for (int i = term; i > 1; i--)

            iterationSum += Math.pow(1.0/i, 2.0);

        return iterationSum;
    }

    /**
     *  The seriesRec method uses recursion to find
     *  the sum of the series. 
     *  The seriesRec method calls the auxiliary method
     *  @param term
     *  @return The sum of the series at index 1
     */

    public static double seriesRec(int term) {

        return seriesRec(term, 1); // Call to the auxiliary method
    }

    /**
     * The auxiliary tail-recursive method computes the sum of
     * the series 
     * @param term
     * @param x
     * @return A series sum computation or 1 (base case)
     */

    public static double seriesRec(int term, int x) {

        if (term == 1)
            // Base case
            return x;
        else
            // Sum of series
            return seriesRec(term - x) + Math.pow(1.0/term, 2.0);
    }
}
