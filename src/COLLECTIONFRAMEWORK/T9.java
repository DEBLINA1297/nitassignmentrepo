package COLLECTIONFRAMEWORK;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class T9 {
//	Implement a program that sorts a list of strings using TreeSet.
public static void main(String[] args) {
    // Create a TreeSet to store strings in sorted order
    Set<String> sortedStrings = new TreeSet<>();
    
    // Define an array of strings to be sorted
    String[] inputStrings = {"banana", "apple", "cherry", "mango", "blueberry"};
    
    // Add strings to the TreeSet
    for (String str : inputStrings) {
        sortedStrings.add(str);
    }
    
    // Display the sorted strings
    System.out.println("Sorted Strings:");
    for (String str : sortedStrings) {
        System.out.println(str);
    }

}
//	Implement a program that explain fail-fast
//public static void main(String[] args) {
//	
//	List<Integer> collection =new ArrayList<>();
//	collection.add(1);
//	collection.add(9);
//	collection.add(5);
//	collection.add(7);
//	
//	collection.forEach(e->{
//		if(e.equals(9)) {
//			collection.remove(0);
//			collection.add(7);
//		}
//	});
//	
//	
////	for(int i=0;i<collection.size();i++) {
////		if(collection.get(0).equals(1)) {
////			//collection.remove(0);
////			collection.add(7);
////		}
////	}
//	System.out.println(collection);
//	
//}
}
