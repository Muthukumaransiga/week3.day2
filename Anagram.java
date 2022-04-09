package week4.day2;
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		//Declare a String 
		String text1 = "stops";
		
		// Declare another String
		String text2 = "potss";

		// a) Check length of the strings are same then (Use A Condition)
		int len1= text1.length();
		int len2 = text2.length();
		
		//b) Convert both Strings in to characters
		char[] t1=text1.toCharArray();
		char[] t2= text2.toCharArray();
		
		// c) Sort Both the arrays
		Arrays.sort(t1);
		Arrays.sort(t2);
		
		//d) Check both the arrays has same value
		boolean status=Arrays.equals(t1, t2);
		if(status)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}

	}
}
