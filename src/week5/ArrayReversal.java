package week5;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class ArrayReversal {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(originalArray);

        reverseArray(originalArray);

        System.out.println("\nReversed Array:");
        printArray(originalArray);
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end positions
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move start and end pointers towards each other
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

