public class LinearSearchFirstNegative {
    public static void main(String[] args) {
        int[] arr = {1, 3, -2, 5, -7, 4};
        int index = findFirstNegative(arr);
        System.out.println("First negative number is at index: " + index);
    }

    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // Return the index of the first negative number
            }
        }
        return -1; // No negative number found
    }
}