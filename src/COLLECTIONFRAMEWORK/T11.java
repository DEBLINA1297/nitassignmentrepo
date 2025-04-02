package COLLECTIONFRAMEWORK;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T11 {
//	Write a program to compare the performance of ArrayList and LinkedList for insertion, deletion, and retrieval operations.
public static void main(String[] args) {
	   final int ELEMENTS = 100000;
       
       List<Integer> arrayList = new ArrayList<>();
       List<Integer> linkedList = new LinkedList<>();
       
       System.out.println("Testing insertion...");
       measureInsertion(arrayList, "ArrayList", ELEMENTS);
       measureInsertion(linkedList, "LinkedList", ELEMENTS);
       
       System.out.println("\nTesting retrieval...");
       measureRetrieval(arrayList, "ArrayList", ELEMENTS);
       measureRetrieval(linkedList, "LinkedList", ELEMENTS);
       
       System.out.println("\nTesting deletion...");
       measureDeletion(arrayList, "ArrayList");
       measureDeletion(linkedList, "LinkedList");
   }

   private static void measureInsertion(List<Integer> list, String type, int elements) {
       long startTime = System.nanoTime();
       for (int i = 0; i < elements; i++) {
           list.add(i);
       }
       long endTime = System.nanoTime();
       System.out.println(type + " insertion time: " + (endTime - startTime) / 1_000_000 + " ms");
   }

   private static void measureRetrieval(List<Integer> list, String type, int elements) {
       long startTime = System.nanoTime();
       for (int i = 0; i < elements; i++) {
           list.get(i);
       }
       long endTime = System.nanoTime();
       System.out.println(type + " retrieval time: " + (endTime - startTime) / 1_000_000 + " ms");
   }

   private static void measureDeletion(List<Integer> list, String type) {
       long startTime = System.nanoTime();
       while (!list.isEmpty()) {
           list.remove(0); // Removing from the front
       }
       long endTime = System.nanoTime();
       System.out.println(type + " deletion time: " + (endTime - startTime) / 1_000_000 + " ms");
   
}
}
