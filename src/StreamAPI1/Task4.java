package StreamAPI1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
public static void main(String[] args) {
//	Sort the given list of numbers in descending order.

//	List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 10, 2);
//    List<Integer> sortedNumbersDesc = numbers.stream().sorted((n1, n2) -> n2- n1)   .collect(Collectors.toList());  


//System.out.println("Sorted Numbers in Descending Order: " + sortedNumbersDesc);
//	write a Java program using Lambda Expression to sort the strings based on their lengths in ascending order

	List<String> Strings = new ArrayList<>(List.of("Pineapple", "Apple", "Banana", "Orange", "Raspberries", "Grape", "Blueberry"));
	Collections.sort(Strings, (s1,s2) -> s1.length()-s2.length());
	System.out.println("Strings based on their lengths in ascending order: "+  Strings);
}
}
