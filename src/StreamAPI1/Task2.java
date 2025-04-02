package StreamAPI1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
public static void main(String[] args) {
//	Given a list of names, convert all names to uppercase using Streams.
	

	List<String> names = Arrays.asList("alice", "bob", "charlie");
List<String> uppercaseNames= names.stream().map(String::toUpperCase).collect(Collectors.toList());
System.out.println("UpperCaseNames "+ uppercaseNames);
}
}
