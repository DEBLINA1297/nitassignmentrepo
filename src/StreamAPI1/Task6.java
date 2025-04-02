package StreamAPI1;

import java.util.Arrays;
import java.util.List;

public class Task6 {
public static void main(String[] args) {
//	Sum of All Even Numbers
	List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 10, 2);
    int sumOfEvens = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();

System.out.println("Sum of Even Numbers: "+ sumOfEvens);
}
}
