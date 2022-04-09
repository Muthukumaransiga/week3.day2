package week4.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {

		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		String test = "I am a software tester"; 


		// a) split the words and have it in an array

		String[] split= test.split(" ");
		String reversedString = "";

		//b) Traverse through each word (using loop)

		for(int i=0;i<split.length;i++)
		{
			String word = split[i]; 
			String reverseWord = "";

			//c) find the odd index within the loop (use mod operator)
			for (int j = word.length()-1; j >= 0; j--) 
			{
				reverseWord = reverseWord + word.charAt(j);

			}
			reversedString = reversedString + reverseWord + " ";
		}

		System.out.println(test);
		System.out.println(reversedString);

	}


}
