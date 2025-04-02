package COLLECTIONFRAMEWORK;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class T8 {
//	Create a program that demonstrates the difference between HashSet, LinkedHashSet, and TreeSet by adding elements and printing the output.
public static void main(String[] args) {
	Set<String> hashset= new HashSet<>();
	Set<String> linkedhashset= new LinkedHashSet<>();
    Set<String> treeSet = new TreeSet<>();
    
    // Add elements
    String[] elements = {"Banana", "Apple", "Mango", "Grapes", "Orange"};
    for (String element : elements) {
        hashset.add(element);
        linkedhashset.add(element);
        treeSet.add(element);
    }
    
    // Print the sets to observe the order
    System.out.println("HashSet (Unordered, No duplicates): " + hashset);
    System.out.println("LinkedHashSet (Insertion Order maintained, No duplicates): " + linkedhashset);
    System.out.println("TreeSet (Sorted Order, No duplicates): " + treeSet);
}
}
