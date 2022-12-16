import java.util.Scanner;

public class SyntaxAnalysis
{
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Tokens: ");
			String line = sc.nextLine();
			sc.close();
			String[] word = line.split(" ");
		
			System.out.println("\n----------------");
			
			String a = "<data_type>";
			String b = "<identifier>";
			String c = "<assignment_operator>";
			String d = "<value>";
			String e = "<delimiter>";
					
			if(word.length == 5)
	        {
	            if (word[0].equals(a) && word[1].equals(b) && word[2].equals(c) && word[3].equals(d) && word[4].equals(e))
	            {
	                System.out.println("Syntax is Correct!");
	            }
	            else
	            {
	                System.out.println("Syntax is Error!");
	            }
	        }
			else
			{
				System.out.println("Syntax is Error!");
			}
	}
}