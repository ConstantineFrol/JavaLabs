/**
 * 
 */
package Practicing2ndYear;

import java.util.Scanner;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class Week3_Lab1_ReplaceCharacter_in_a_String {

	/**
	 * 	Write a program to print every third character of a user-inputed string. The characters
	 *	not displayed are instead printed as underscores. A sample run of the program may look
	 *	like
	 *	Enter a string: Constantinople
	 * 	C_ _ s _ _ n _ _ n _ _ l
	 */
	public static void main(String[] args) {

		//Scanner
		Scanner scanner = new Scanner(System.in);
	
		//Initialize variable
		String userInput = "";
	
		//Asking user to enter a string
		System.out.print("Enter a string: ");
	
		//Validate that input in not a number
		while(scanner.hasNextInt())
		{
			System.out.println("Oops, wrong input!\nEnter a string: ");
			scanner.nextLine();
		}
			
		//read and store user input
		userInput = scanner.next();
	
		//use for-loop to display first and every third character
		for (int i = 0; i < userInput.length(); i++)
		{
		    System.out.print(i % 3 == 0 ? userInput.charAt(i) : " _ ");
		}
	
		//close Scanner
		scanner.close();

		
		
	}

}
