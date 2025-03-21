import java.util.Arrays;

public class ChallengeProblem {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int missingPositive = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missingPositive);

        Arrays.sort(arr); // Sort the array for binary search
        int target = 4;
        int targetIndex = binarySearch(arr, target);
        System.out.println("Target index: " + targetIndex);
    }

    // Linear Search: Find the first missing positive integer
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                // Swap to place the number in its correct position
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1; // First missing positive
            }
        }
        return n + 1; // All positive integers are present
    }

    // Binary Search: Find the index of a target number
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }
        return -1; // Target not found
    }
}