package DebanjanSir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class T1 {
	
	public static void main(String [] args) {
		List<Integer> collectionNumber=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> evenList=new ArrayList<>();
		List<Integer> oddList=new ArrayList<>();
		collectionNumber.stream().forEach(e->{
			if(e%2==0) {
				evenList.add(e);
			}else {
				oddList.add(e);
			}
		});
		System.out.println(evenList);
		System.out.println(oddList);
	}

}
