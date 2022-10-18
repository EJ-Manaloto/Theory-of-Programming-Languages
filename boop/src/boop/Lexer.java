package boop;

import java.util.Scanner;

public class Lexer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Source Language: ");
		String line = sc.next();
		String[] word = line.split(",");
		//i can't make the splitter a space. 
		//So instead of space, i used comma to separate each word
	
		System.out.println("\n---------------------------");
		
		for (int i = 0; i < word.length; i++)
		{
			if (word[i].equals("int") || word[i].equals("double") || word[i].equals("char") ||  word[i].equals("String"))
			{
				System.out.println(word[i] + " - <data_type>");
			}
			else if (word[i].matches("[a-zA-Z]+") || word[i].matches("[0-9]"))
			{
				System.out.println(word[i] + " - <identifier>");
			}
			else if (word[i].equals("="))
			{
				System.out.println(word[i] + " - <assignment_operator>");
			}
			else if (word[i].equals(";"))
			{
				System.out.println(word[i] + " - <delimiter>");
			}
			else if (word[i].startsWith("\"") || word[i].startsWith("\'"))
			{
				System.out.println(word[i] + " - <value>");
			}
			else
			{
				System.out.println("invalid");
			}
		}		
	}
}