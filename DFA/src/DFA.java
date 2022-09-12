import java.util.Scanner;
public class DFA 
{
	public static void main(String[] args) 
	{
		String state = "q0";
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your string: ");
		String myString = sc.nextLine();
        
        for(int x = 0; x < myString.length(); x++)
        {
            if(state.equals("q0") && myString.charAt(x) == '0'  )
            {
                state = "q1";
            }
            else if(state.equals("q0") && myString.charAt(x) == '1'  )
            {
                state = "q0";
            }
            else if(state.equals("q1") && myString.charAt(x) == '0'  )
            {

                state = "q1";
            }
            else if(state.equals("q1") && myString.charAt(x) == '1'  )
            {

                state = "q2";
            }
            else if(state.equals("q2") && myString.charAt(x) == '0')
            {
            	state = "q1";
            }
            else if(state.equals("q2") && myString.charAt(x) == '1')
            {
            	state = "q0";
            }
            
            else
            {
                System.out.println("Invalid input.. Exiting automaton");
            }
        }
        
        if(state.equals("q2"))
        {
            System.out.println("String accepted");
        }
        else
        {
            System.out.println("String not accepted");
        }
    }

}

