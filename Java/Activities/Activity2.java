
public class Activity2 {
	public static void main(String[] args) {
        // Initialize an array with 6 numbers
        int[] numbers = {10, 77, 10, 54, -11, 10};

        // Call the method to check if the sum of all 10's is exactly 30
        boolean result = checkSumOfTens(numbers);

        // Print the result
        System.out.println("The sum of all 10's in the array is exactly 30: " + result);
    }

    public static boolean checkSumOfTens(int[] array) {
        int sum = 0;
        
        // Loop through the array to find and sum all the 10's
        for (int num : array) {
            if (num == 10) {
                sum += num;
            }
        }

        // Check if the sum is exactly 30
        return sum == 30;
    }
}
