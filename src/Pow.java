// Ido Levy 318949294

/**
 * The Pow class contains two methods to calculate the power of an integer.
 */
public class Pow {
    /**
     * Calculates the power of a number using recursion.
     *
     * @param n An integer representing the base
     * @param x An integer representing the exponent
     * @return n to the power of x
     */
    public static long powRecursive(long n, long x) {
        if (x == 0) {
            return 1;
        }
        return n * powRecursive(n, x - 1);
    }

    /**
     * Calculates the power of a number using iteration.
     *
     * @param n An integer representing the base
     * @param x An integer representing the exponent
     * @return n to the power of x
     */
    public static long powIter(long n, long x) {
        long res = 1;
        while (x >= 1) {
            res *= n;
            --x;
        }
        return res;
    }

    /**
     * The main method.
     *
     * @param args Two integers representing the base and exponent
     */
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        long x = Long.parseLong(args[1]);
        System.out.println("recursive: " + powRecursive(n, x));
        System.out.print("iterative: " + powIter(n, x));
    }
}
