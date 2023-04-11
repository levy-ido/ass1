// Ido Levy 318949294

/**
 * This class provides a method for finding a subsequence of length 3 from an array of integers,
 * such that the sum of the elements in the subsequence is equal to 0.
 * It also includes utility methods for sorting arrays and printing the subsequence.
 */
public class TripletOfZero {
    /**
     * Converts an array of strings into an array of integers.
     *
     * @param numbers A string array representing an array of integers.
     * @return An integer array representation of the input.
     */
    public static int[] stringsToArray(String[] numbers) {
        int[] arr = new int[numbers.length - 1];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Integer.parseInt(numbers[i + 1]);
        }
        return arr;
    }

    /**
     * Returns a subsequence of length 3 from the given array,
     * such that the sum of the elements in the subsequence is equal to 0, if it exists.
     *
     * @param numbers An array of integers.
     * @return An array of length 3 containing the elements that sum to 0, or null if no such subsequence exists.
     */
    public static int[] tripletOfZero(int[] numbers) {
        for (int i = 0; i < numbers.length - 2; ++i) {
            for (int j = i + 1; j < numbers.length - 1; ++j) {
                for (int k = j + 1; k < numbers.length; ++k) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        return new int[]{numbers[i], numbers[j], numbers[k]};
                    }
                }
            }
        }
        return null;
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr An array of integers.
     * @param i   An index in the array.
     * @param j   An index in the array.
     */
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * Sorts an array of integers using bubble sort.
     *
     * @param arr An array of integers.
     */
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * Prints a triplet of integers in ascending order.
     *
     * @param numbers An array of length 3 containing integers.
     */
    public static void ascTripletPrint(int[] numbers) {
        System.out.print("[" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + "]");
    }

    /**
     * Prints a triplet of integers in descending order.
     *
     * @param numbers An array of length 3 containing integers.
     */
    public static void descTripletPrint(int[] numbers) {
        System.out.print("[" + numbers[2] + ", " + numbers[1] + ", " + numbers[0] + "]");
    }

    /**
     * Returns true if the input string array starts with "asc", false otherwise.
     *
     * @param order A string array describing how the triplet should be sorted
     * @return true if the string starts with "asc", false otherwise
     */
    public static boolean isAsc(String[] order) {
        return order[0].equals("asc");
    }

    /**
     * Main method that receives an array of integers and a string
     * describing how the triplet should be sorted (in ascending or descending order).
     * It calls the tripletOfZero method to find a triplet of integers in the array
     * that add up to zero, and then sorts the triplet using bubbleSort. The sorted triplet
     * is printed to the console either in ascending or descending order, based on the input
     * string. If no triplet is found, the message "the triplet is: -1" is printed.
     *
     * @param args A string array containing the integers and the string describing how the triplet should be sorted
     */
    public static void main(String[] args) {
        int[] numbers = stringsToArray(args);
        int[] triplet = tripletOfZero(numbers);
        if (triplet == null) {
            System.out.print("the triplet is: -1");
        } else {
            bubbleSort(triplet);
            if (isAsc(args)) {
                ascTripletPrint(triplet);
            } else {
                descTripletPrint(triplet);
            }
        }
    }
}
