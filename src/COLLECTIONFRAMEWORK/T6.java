package COLLECTIONFRAMEWORK;

import java.util.ArrayList;
import java.util.Collections;

public class T6 {

//	Given an ArrayList<Integer>, sort it in ascending and descending order using Collections.sort().
public static void main(String[] args) {
    // Creating an ArrayList
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(1);
    numbers.add(9);
    numbers.add(3);
    numbers.add(7);

    // Sorting in ascending order
    Collections.sort(numbers);
    System.out.println("Ascending Order: " + numbers);

    // Sorting in descending order
    Collections.sort(numbers, Collections.reverseOrder());
    System.out.println("Descending Order: " + numbers);
}

}

