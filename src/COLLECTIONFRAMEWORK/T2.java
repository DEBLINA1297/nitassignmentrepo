package COLLECTIONFRAMEWORK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T2 {
//	Implement a program that removes duplicate elements from a List.
//	   public static List<Integer> removeDuplicates(List<Integer> list) {
//	        Set<Integer> seen = new HashSet<>();
//	        List<Integer> uniqueList = new ArrayList<>();
//	        
//	        for (Integer item : list) {
//	            if (seen.add(item)) { // add() returns false if the item is already in the set
//	                uniqueList.add(item);
//	            }
//	        }
//	        
//	        return uniqueList;
//	    }
//
//	    public static void main(String[] args) {
//	        List<Integer> myList = Arrays.asList(1, 2, 2, 3);
//	        System.out.println(removeDuplicates(myList));
	    
//}
	public static void main(String[] args) {
		
	
	ArrayList<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(2);
	list.add(3);
	List<Integer> dublicateList=new ArrayList<>();
	list.forEach(e->{
		if(!dublicateList.contains(e)) {
			dublicateList.add(e);
		}
		else if(dublicateList.contains(e)) {
			dublicateList.remove(e);
		}
	});
	System.out.println(dublicateList);
}
}
