import java.util.Scanner;
public class Remainder 
{
	public static void main(String[] args)
	{
		//Ask user for two integer
		int first, second;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user
		System.out.println("Enter two integers and I'll tell you the raminder of integer division");
		first = keyboard.nextInt();
		second = keyboard.nextInt();
		keyboard.nextLine(); //get rid of extra newline character -- this program will work without this
		
		//Tell the user for the reminder of he division operation
		System.out.println(first + " % " + second + " = " + first % second);
		
		keyboard.close();
	}
}


//Reflective Practioner