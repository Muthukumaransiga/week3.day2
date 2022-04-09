package week4.day2;

public class Palindrome {

	public static void main(String[] args) {


		// a) Declare A String value as"madam"
		String val = "madam";

		//b) Declare another String rev value as ""
		String revval = "";
		//c) Iterate over the String in reverse order
		int len = val.length();
		for(int i=len-1;i>=0;i--)
		{
			//d) Add the char into rev	
			revval = revval+(val.charAt(i));
		}

		//e) Compare the original String with the reversed String, if it is same then print palinDrome 
		boolean compare = revval.equalsIgnoreCase(val);
		if(compare)
		{
			System.out.println("The given string "+revval  +" is palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
		// Hint: Use .equals or .equalsIgnoreCase when you compare a String 


	}

}
