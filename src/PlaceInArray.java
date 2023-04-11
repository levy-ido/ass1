// Ido Levy 318949294

/**
 * The PlaceInArray class contains methods to print the index range of a given integer in a sorted array.
 */
public class PlaceInArray {
    /**
     * Prints n's index range in array (if n isn't in array then it's index range is [-1, -1]).
     * @param n An integer to be searched in the array
     * @param array A sorted array of integers
     */
    public static void placeInArray(int n, int[] array) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.print(n + " start in " + first + " and end in " + last);
    }

    /**
     * Creates a sorted array of integers from the given string array.
     * @param args A sorted array of integers followed by an integer to be searched in the array
     * @return The sorted array of integers
     */
    public static int[] createArray(String[] args) {
        int[] array = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; ++i) {
            array[i] = Integer.parseInt(args[i]);
        }
        return array;
    }

    /**
     * The main method of the class.
     * @param args A sorted array of integers followed by an integer to be searched in the array
     */
    public static void main(String[] args) {
        int[] array = createArray(args);
        int n = Integer.parseInt(args[args.length - 1]);
        placeInArray(n, array);
    }
}
