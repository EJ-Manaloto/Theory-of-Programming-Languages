import java.util.Scanner;
public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("What is your word/phrase? ");
		String original = input.nextLine();
		String noSpacesOrSpecialChar = original.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println();
		
		String line = "=";
		System.out.println(line.repeat(noSpacesOrSpecialChar.length() + 2));
		
		String reverse = "";
		for (int i = noSpacesOrSpecialChar.length() - 1; i >= 0; i--)
		{
			reverse += noSpacesOrSpecialChar.charAt(i);
			System.out.println(reverse);
		}
		
		boolean palindrome = true;
		for (int i = 0; i < noSpacesOrSpecialChar.length(); i++)
		{
			if(reverse.charAt(i) != noSpacesOrSpecialChar.charAt(i)) 
			{
				palindrome = false;
			}
		}
		
		System.out.println(line.repeat(noSpacesOrSpecialChar.length() + 2));
		
		if(palindrome) 
		{
			System.out.println();
			System.out.println(original + " is a PALINDROME!");
		} 
		else 
		{
			System.out.println();
			System.out.println(original + " is NOT a palindrome!");
		}
	}

}
