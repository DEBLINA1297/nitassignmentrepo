package StreamSK;

import java.util.Arrays;

public class TRAKESH1 {


//	 Given two sorted arrays, merge them into a single sorted array. Input: [1, 3, 5] and [2, 4, 6]  Output: [1, 2, 3, 4, 5, 6]  


	public static void main(String[] args) {
		int []a= {1, 3, 5};
		int []b= {2, 4, 6};
		int n=a.length;
		int m=b.length;
		int []c=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n)
		{	
				c[k++]=a[i++];	
		}
		while(j<m)
		{
			c[k++]=b[j++];
		}
		Arrays.sort(c);
		for(int nums:c)
		{
			System.out.print(nums);
		}
	}
	

}