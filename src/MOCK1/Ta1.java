package MOCK1;

import java.util.ArrayList;
import java.util.List;

class Ta1 {
public static void main(String[] args)
{
	int [] num = {1,2,3,4,5,6,7,8,9,10};
	List<Integer> Evennumbers= new ArrayList<>();
	List<Integer> Oddnumbers= new ArrayList<>();
//	System.out.println("Even Numbers: ");
	for(int numbers:num)
	{ 
		if(numbers % 2==0)
		{
			Evennumbers.add(numbers);
		}
		else
		{
			Oddnumbers.add(numbers);
		}
	}
	System.out.println("Even Numbers :"+ Evennumbers);
	System.out.println("Odd Numbers :"+ Oddnumbers);
//	for(int numbers:num)
//	{
//		if(numbers % 2==0)
//		{
//			System.out.println(numbers +" ");
//		}
//	}
//	System.out.println("Odd Numbers: ");
//	for(int numbers:num)
//	{
//		if(numbers % 2!=0)
//		{
//			System.out.println(numbers +" ");
//		}
//	
}
}
 
