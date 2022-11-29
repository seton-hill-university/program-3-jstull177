// Project: Program 3
// Author: Jerod Stull
// Github: jstull177
// Date: September 29, 2022
// Version: 1.0
// Desc: This program is a submission for Program 3 listed on Canvas.

//================================================

import java.util.Scanner;

public class stull_program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (// Below activates the input device, 
			// So that the user can interact with the output device. 
			Scanner keyboard = new Scanner(System.in)) {
				// Prompt:
					System.out.println("Please provide your first name and a number between 0-100. ");
					
				//Initializes user input to answer the prompt above.
					String yourname = keyboard.next();
					int num = keyboard.nextInt();
					
				// If the user doesn't input a number between the prompted integers. 
					while(num < -1 || num > 101)
					{
						System.out.println("That number is invalid");
						System.out.println("Input a number between 0 and 100");
						num = keyboard.nextInt();
					}
				
				//If the user put in a number that is between 0 and 100. 
					while (num >= 0 || num <= 100)
					{
						System.out.println("That number is valid, thank you " + yourname + ".");
						System.out.println("Please enter that number again to continue");
						break;
					} 
					
					
				//Now for a "for" loop. 
				//The User's number will count down to 0; at that point the User will explode.
					
					for (num = keyboard.nextInt() ; num >= 0 || num <= 100; num--)
					{
						System.out.println("It was nice knowing you. " + num + " seconds until you spontaneously combust. ");
						
						if (num==0)
						{
							System.out.println("You are a pile of dust now.");
							break;
						}
					}
			}
	}

}
