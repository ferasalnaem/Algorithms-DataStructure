public class BinarySearchExample {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;  // Return the index if the target is found
            } else if (array[mid] < target) {
                left = mid + 1;  // Search the right half
            } else {
                right = mid - 1;  // Search the left half
            }
        }

        return -1;  // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] data = {3, 4, 5, 6, 7, 8, 9, 12, 16, 18, 42};
        int target = 16;

        int result = binarySearch(data, target);

        if (result != -1) {
            System.out.println("Binary Search: Element found at index " + result);
        } else {
            System.out.println("Binary Search: Element not found");
        }
    }
}

