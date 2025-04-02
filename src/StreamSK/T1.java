package StreamSK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T1 {
public static void main(String[] args) {
//	1.How would you use a lambda expression to sort a list of strings in ascending order based on their length?
	List<String> Strings = new ArrayList<>(List.of("Pineapple", "Apple", "Banana", "Orange", "Raspberries", "Grape", "Blueberry"));
	Collections.sort(Strings,(s1,s2)-> s1.length()- s2.length());
	System.out.println("strings in ascending order based on their length: " + Strings);
}
}
