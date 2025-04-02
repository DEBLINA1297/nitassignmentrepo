package DebanjanSir;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class T2 {
//	Filtering Strings Containing Both Uppercase and Lowercase Letters
	public static void main(String [] args) {
//		String NameSurname="DeblinaBhunia";
//   
//      List<String> result = Arrays.stream(NameSurname.split("(?=[A-Z])"))
//                .collect(Collectors.toList( ));
//        
//     System.out.println("Split Name: " + result);

		List<String> sampleList=Arrays.asList("RupaliBhunia","MeghaBhunia","DeblinaBhunia");
List<String> sampleList1 = sampleList.stream().flatMap(name -> Arrays.stream(name.split("(?=[A-Z])")))
	    .collect(Collectors.toList());
	System.out.println(sampleList1); 
	}

}
