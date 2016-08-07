
package Practicing2ndYear;

import java.util.Scanner;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 */
public class Week_1_Lab_1 {

	public static void main(String[] args) {

		// Scanner named userInput
		Scanner userInput = new Scanner(System.in);

		// Initialize variables
		int randomNumber = 0;
		int userNumber = 0;
		int count = -1;

		// Using method Math. every time u run this application var randomNumber == random number from 1 to 10
		randomNumber = (int)(Math.random() * 10 + 1);

		// Quick explanation to user what to do
		System.out.println("Try to guess the secret number\nYou have only 3 tries!!!\n");

		// Calling method
		askUser();

		// Using do-while loop to run it once and depends on result execute or run it again
		while(randomNumber!= userNumber){
			
			// every time it loops variable count adds one number
			count++;

			// Display how many tries user has left over
			if(count == 1)
			{
				System.out.println("Oh, don't worry you still have 2 more tries to go");

				// Calling method
				askUser();
			}
			else if(count == 2)
			{
				System.out.println("Well, try one more time");

				// Calling method
				askUser();
			}

			// Display secret number and execute this application
			else if(count == 3)
			{
				System.out.println("The secret number was: " + randomNumber);
				System.exit(0);
			}

			// Read user input from keyboard
			userNumber = userInput.nextInt();

			// Conditions, depends on user input in console will be displayed particular string
			if(userNumber > randomNumber && count != 2)
			{
				System.out.println("You entered too big number, next time try smaller number");
			}
			else if(userNumber < randomNumber && count != 2)
			{
				System.out.println("You entered too small number, next time try bigger number");
			}
			else if(userNumber < randomNumber && count == 2)
			{
				System.out.println("Oops, Game Over !\nYou entered too small number");
			}
			else if(userNumber > randomNumber && count == 2)
			{
				System.out.println("Oops, Game Over !\nYou entered too big number");
			}
			else
			{
				System.out.println("WoW You Won!!!, the secret number was: " + randomNumber);
			}

		}

		// Always close the scanner  
		userInput.close();

	}

	private static void askUser()
	{
		// Ask user to input number from 1 to 10
		System.out.println("Plese input numbers from 1 to 10");	
	}

}
