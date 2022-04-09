package week4.day2;

public class FindTypes {
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		// Pseudo Code:
		//a) Convert the String to character array
		char[] ch = test.toCharArray();
		int len= ch.length;

		//b) Traverse through each character (using loop)
		for(int i=0;i<len;i++)
		{

			//c) Find if the given character is what type using (if)
			//i)  Character.isLetter
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}

			//ii) Character.isDigit	
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}

			//iii)Character.isSpaceChar
			else if(ch[i]==' ')
			{
				space++;
			}

			//else -> consider as special character
			else
			{
				specialChar++;
			}
		}
		// Print the count here
		System.out.println("Total String value: " + len);	
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);


	}

}
