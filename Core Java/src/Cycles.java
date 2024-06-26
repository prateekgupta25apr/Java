package src;

/**
 * The basic logic of cycles is that a cycle comprises elements that can be swapped among
 * themselves to place each in its correct position. For example, if element a should go
 * to the position of b, b to c, c to d, and d back to a, then a -> b -> c -> d -> a forms
 * a cycle. The total number of swaps required is the sum of swaps for each cycle, where a
 * cycle of length n requires n - 1 swaps. Instead of actually swapping the elements in the
 * array, a boolean array is used to track visited elements, marking them as true once they
 * are considered, ensuring elements already in the correct position or previously visited
 * are skipped. This approach efficiently calculates the minimum number of swaps needed to
 * sort the array.
 */
public class Cycles {
    public static int minimumSwaps(int[] arr) {
        int swaps = 0;
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] || arr[i] == i + 1) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = arr[j] - 1; // Move to the next index in the cycle
                cycleSize++;
            }

            if (cycleSize > 0) {
                System.out.println(cycleSize-1);
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {
                2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50,
                21, 46, 23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36,
                30, 37, 35, 20, 17, 45, 43, 25, 19};
        System.out.println("Minimum swaps needed: " + minimumSwaps(arr)); // Output: ?
    }
}
