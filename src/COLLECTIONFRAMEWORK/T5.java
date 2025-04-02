package COLLECTIONFRAMEWORK;

import java.util.Iterator;
import java.util.TreeSet;

public class T5 {
//	Write a program to iterate over a TreeSet in descending order.
    public static void main(String[] args) {
        // Create a TreeSet and add some elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(25);

        // Get the descending iterator
        Iterator<Integer> iterator = treeSet.descendingIterator();

        // Iterate and print elements in descending order
        System.out.println("TreeSet elements in descending order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
