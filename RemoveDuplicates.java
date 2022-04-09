package week4.day2;

import java.util.LinkedHashSet;


public class RemoveDuplicates {

	public static void main(String[] args) {

		// a. Declare the string
		String str = "Paypal India";

		//Create LinkedHashSet of type character   
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();   
		//Add each character of the string into LinkedHashSet   
		for(int i=0;i<str.length();i++)  { 
			set.add(str.charAt(i));   
		}
		// print the string after removing duplicate characters   
		for(Character ch : set) {   
			System.out.print(ch);  
		}
		// the output will come like "Paypl Indi"
	}



}