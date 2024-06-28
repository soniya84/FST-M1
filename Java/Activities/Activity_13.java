import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Activity_13 {
	

	//public class RandomScannerActivity {
	    public static void main(String[] args) {
	        // Create the necessary objects
	        Scanner scan = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<>();
	        Random indexGen = new Random();

	        // Prompt user for input
	        System.out.println("Enter integers (non-integer to stop):");

	        // Loop to accept only integer values
	        while (scan.hasNextInt()) {
	            list.add(scan.nextInt());
	        }

	        // Convert the ArrayList to an array
	        Integer nums[] = list.toArray(new Integer[0]);

	        // Generate a random index value within the bounds of the array
	        int randomIndex = indexGen.nextInt(nums.length);

	        // Print the generated index and the value at that index
	        System.out.println("Generated index: " + randomIndex);
	        System.out.println("Value at generated index: " + nums[randomIndex]);

	        // Close the scanner
	        scan.close();
	    }
//	}

}
