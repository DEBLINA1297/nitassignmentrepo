package StreamAPI1;

import java.util.Arrays;
import java.util.List;

public class Task5 {
public static void main(String[] args) {
//	Find the Maximum and Minimum Value
	List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 10, 2);
    int min = numbers.stream().min(Integer::compareTo).get(); 


int max = numbers.stream().max(Integer::compareTo).get(); 


System.out.println("Minimum value: " + min);
System.out.println("Maximum value: " + max);
}
}
