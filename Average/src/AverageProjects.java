//Written by CS 1323 Fall 2018
public class AverageProjects 
{
	/** This program averages three project grades 
	 * 
	 * @param argus There are no command line arguments for this program. 
	 */
	public static void main(String[] argus)  
	{
		//These are the project grades
		int project1 = 83;
		int project2 = 67;
		int project3 = 79;
		
		//Declare the average 
		double average;
		
		//Calculate the average from the project score 
		average = (project1 + project2 + project3) / 3.0;
		
		//Show output to user
		System.out.println("The average is " + average);
	}
}