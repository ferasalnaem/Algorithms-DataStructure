public class LinearSearchExample {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Return the index if the target is found
            }
        }
        return -1;  // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] data = {8, 6, 12, 5, 9, 7, 4, 3, 16, 18, 42};
        int target = 16;

        int result = linearSearch(data, target);

        if (result != -1) {
            System.out.println("Linear Search: Element found at index " + result);
        } else {
            System.out.println("Linear Search: Element not found");
        }
    }
}



