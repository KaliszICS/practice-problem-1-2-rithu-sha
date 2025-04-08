public class PracticeProblem {
    // Function 1: Checks if the index is valid in the array
    public static boolean validIndex(int[] array, int index) {
        try {
            int value = array[index]; // Try to access the index
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

	   // Function 2: Divides two integers with exception handling
	   public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 0; // Handle division by zero
        }
    }

	// Function 3: Safely converts a string to an integer
    public static int safeConvertStringToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 0; // Handle invalid string format
        }
    }

	// Main method for testing
	public static void main(String args[]) {
		int[] array = {10, 20, 30};

        System.out.println("Valid index 1: " + validIndex(array, 1)); // true
        System.out.println("Valid index 5: " + validIndex(array, 5)); // false

        System.out.println("Divide 10 by 2: " + divide(10, 2)); // 5
        System.out.println("Divide 10 by 0: " + divide(10, 0)); // 0

        System.out.println("Convert '123': " + safeConvertStringToInt("123")); // 123
        System.out.println("Convert 'abc': " + safeConvertStringToInt("abc")); // 0

	}
}
