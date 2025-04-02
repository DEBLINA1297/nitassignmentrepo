package StreamAPI1;

import java.util.Arrays;
import java.util.List;

public class Task7 {
public static void main(String[] args) {
//	Count how many numbers in a list are greater than 5.
	List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 10, 2);

    long count = numbers.stream().filter(number -> number > 5).count();

    System.out.println("Count of numbers greater than 5: " + count); 

}
}
