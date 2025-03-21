public class BinarySearchRotationPoint {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3, 4};
        int rotationPoint = findRotationPoint(arr);
        System.out.println("Rotation point is at index: " + rotationPoint);
    }

    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1; // Rotation point is in the right half
            } else {
                right = mid; // Rotation point is in the left half
            }
        }
        return left; // Rotation point index
    }
}