package StreamSK;

public class TRAKESH {
	 public static void main(String[] args) {
	        int[] numbers = {10, 5, 8, 20, 2};

	        int min = numbers[0];
	        int max = numbers[0];

	        for (int num : numbers) {
	            if (num < min) {
	                min = num;
	            }
	            if (num > max) {
	                max = num;
	            }
	        }

	        System.out.println("Minimum value: " + min);
	        System.out.println("Maximum value: " + max);
	    }
}
