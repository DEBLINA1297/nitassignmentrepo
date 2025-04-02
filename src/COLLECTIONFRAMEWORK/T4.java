package COLLECTIONFRAMEWORK;

import java.util.HashMap;
import java.util.Map;

public class T4 {
//	Create a HashMap that stores student names as keys and their marks as values. Retrieve and print the marks of a specific student.
    public static void main(String[] args) {
        // Create a HashMap to store student names and their marks
        Map<String, Integer> studentMarks = new HashMap<>();

        // Add students and their marks
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 90);
        studentMarks.put("Charlie", 78);
        studentMarks.put("David", 92);
        studentMarks.put("Emma", 88);

        // Student to retrieve marks for
        String studentName = "Bob";

        // Retrieve and print the marks of the specific student
        if (studentMarks.containsKey(studentName)) {
            System.out.println(studentName + "'s marks: " + studentMarks.get(studentName));
        } else {
            System.out.println(studentName + " not found in the records.");
        }
    }
}
