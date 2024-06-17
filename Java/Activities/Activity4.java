
public class Activity4 {
	public static void main(String[] args) {
        // Initialize an array with numbers in random order
        int[] numbers = {64,1,1,1,1,1,1,-2,-2,-2, 25, 12, 22, 11,909999998};

        // Display the array before sorting
        System.out.println("Array before sorting:");
        printArray(numbers);

        // Perform insertion sort
        insertionSort(numbers);

        // Display the array after sorting
        System.out.println("Array after sorting:");
        printArray(numbers);
    }

    // Method to perform insertion sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
