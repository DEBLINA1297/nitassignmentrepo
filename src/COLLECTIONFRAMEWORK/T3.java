package COLLECTIONFRAMEWORK;

import java.util.HashSet;

//Write a Java program to check if a HashSet contains a specific element.

public class T3 {
    public static void main(String[] args) {
        // Create a HashSet and add some elements
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Element to check
        String searchElement = "Orange";

        // Check if the element exists in the HashSet
        if (fruits.contains(searchElement)) {
            System.out.println(searchElement + " is present in the HashSet.");
        } else {
            System.out.println(searchElement + " is not present in the HashSet.");
        }
    }
}
