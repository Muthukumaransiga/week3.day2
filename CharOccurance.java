package week4.day2;

public class CharOccurance {
	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences

		char ch ='c';
		int count =0;

		// convert the string into char array
		char[] ch1= str.toCharArray();

		//get the length of the array
		int len = ch1.length;

		// traverse from 0 till the array length 
		for(int i=0;i<len;i++)
		{
		//Check the char array has the particular char in it 
			if(ch1[i]==ch)
			{
		// if is has increment the count
				count++;
			}
		}
		// print the count out of the loop
		System.out.println("The "+ch+" count is "+count);
	}

}
