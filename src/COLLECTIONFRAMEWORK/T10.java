package COLLECTIONFRAMEWORK;

import java.util.HashMap;

public class T10 {
//	Write a program to merge two HashMaps into a single HashMap.
public static void main(String[] args) {
	   // Creating first HashMap
    HashMap<Integer, String> map1 = new HashMap<>();
    map1.put(1, "Apple");
    map1.put(2, "Banana");
    map1.put(3, "Cherry");

    // Creating second HashMap
    HashMap<Integer, String> map2 = new HashMap<>();
    map2.put(4, "Grapes"); // This will overwrite "Cherry" from map1
    map2.put(5, "Mango");
    map2.put(6, "Peach");

    // Merging map2 into map1
    map1.putAll(map2);

    // Displaying the merged HashMap
    System.out.println("Merged HashMap: " + map1);

}
}
