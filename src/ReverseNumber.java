// Ido Levy 318949294

/**
 * This class provides methods to reverse a given integer number
 * and returns it in the reversed form.
 * The number should be in the range [-2^31, 2^31 - 1].
 */
public class ReverseNumber {
    /**
     * Reverses the digits of a given positive integer.
     *
     * @param n A positive integer to be reversed
     * @return The reversed integer
     */
    public static long reverseNumAux(long n) {
        long nRev = 0;
        while (n > 0) {
            nRev *= 10;
            nRev += n % 10;
            n /= 10;
        }
        return nRev;
    }

    /**
     * Reverses the digits of a given integer if it is in the range [-2^31, 2^31 - 1].
     *
     * @param n An integer to be reversed
     * @return The reversed integer if it's in the range [-2^31, 2^31 - 1], otherwise 0
     */
    public static int reverseNum(int n) {
        long nRev;
        if (n < 0) {
            nRev = -reverseNumAux(-n);
        } else {
            nRev = reverseNumAux(n);
        }
        if (nRev < Integer.MIN_VALUE || nRev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) nRev;
    }

    /**
     * Main method that reads an integer from the command line argument,
     * reverses its digits and prints it to the console.
     *
     * @param args An integer in the range [-2^31, 2^31 - 1]
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.print("reverse number: " + reverseNum(n));
    }
}
