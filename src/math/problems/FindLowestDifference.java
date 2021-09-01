package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
// Java program to find Maximum difference
// between two elements such that larger
// element appears after the smaller number
        class MaximumDiffrence {
            /* The function assumes that there are at least two
               elements in array.
               The function returns a negative value if the array is
               sorted in decreasing order.
               Returns 0 if elements are equal */
            int maxDiff(int[] arr, int arr_size) {
                int max_diff = arr[1] - arr[0];
                int i, j;
                for (i = 0; i < arr_size; i++) {
                    for (j = i + 1; j < arr_size; j++) {
                        if (arr[j] - arr[i] > max_diff)
                            max_diff = arr[j] - arr[i];
                    }
                }
                return max_diff;
            }

        }

    }
}
