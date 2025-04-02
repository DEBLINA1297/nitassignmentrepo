package StreamSK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class T2 {
	public static void main(String[] args) {
//		2.How do you filter a list of integers to only include even numbers and then calculate the sum of those numbers using the Stream API?
	    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
List<Integer> evennumbers= numbers.stream().filter(n -> n %2 ==0).collect(Collectors.toList());
System.out.println(" even numbers : "+ evennumbers);
 int sumofEvens= evennumbers.stream().mapToInt(Integer::intValue).sum();
 System.out.println("Sum of even numbers: "+sumofEvens );
	}

}
