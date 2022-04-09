package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PrintDuplicates {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		int length = arr.length;
		//int count = 1;
		
		List<Integer> li= new ArrayList<Integer>();
		
		
		//Set<Integer> s= new TreeSet<Integer>();
		for(int i=0; i<length; i++)
		{
			li.add(arr[i]);
			
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					//count++;
				}
			}
					
		}
		

	}

}
