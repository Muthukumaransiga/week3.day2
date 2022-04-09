package week4.day2;

import java.util.HashSet;
import java.util.Set;


public class FindIntersection {
	public static void main(String[] args) {

		// a) Declare An array for {3,2,11,4,6,7};
		int[] a= {3,2,11,4,6,7};

		// b) Declare another array for {1,2,8,4,9,7};
		int[] b= {1,2,8,4,9,7};

		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();

		// c) Declare for loop iterator from 0 to array length
		for(int i=0;i<a.length;i++)
		{
			s1.add(a[i]);
		}
		
		//d) Declare a nested for another array from 0 to array length

		for(int j=0;j<b.length;j++)
		{
			s2.add(b[j]);
		}
		
		// e) Compare Both the arrays using a condition statement
		System.out.println(s1);
		System.out.println(s2);
		s2.retainAll(s1);
		
		//  f) Print the first array (shoud match item in both arrays)
		System.out.println("The intersection is "+s2);
			}
}
