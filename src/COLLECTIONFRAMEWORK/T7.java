package COLLECTIONFRAMEWORK;

import java.util.ArrayList;
import java.util.HashSet;

public class T7 {
//	Write a Java program to convert an ArrayList to an HashSet and remove duplicate elements.
	  public static void main(String[] args) {
	        // Create an ArrayList with duplicate elements
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Apple");
	        list.add("Orange");
	        list.add("Banana");
	        list.add("Grapes");

	        // Convert ArrayList to HashSet to remove duplicates
	        HashSet<String> set = new HashSet<>(list);

	        // Print the HashSet (duplicates removed)
	        System.out.println("HashSet (no duplicates): " + set);
	    }
}
