package edu.clarkson.mccannim.RPSLSGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {

	private Weapon weapon;// Chosen weapon by player.
	private Modifier modifier;// Chosen modifier by player.
	private Scanner inputScanner = new Scanner(System.in);// Creating a scanner, so input from the user
														  // can be taken.
	/**
	 * Asks user for integer input after listing a menu of choices for weapons and modifiers.
	 * 
	 * @param There are no input arguments.
	 * 
	 * @return Nothing is returned.
	 */
	@Override
	public void setAttack() {

		boolean flag = true;// Used in detecting if the user inputted a valid
							// value.
		int answer = 0;// Used for input by user in selecting weapon and
						// modifier.

		// Will continually ask user for input until the correct input is
		// entered.
		do {

			// Outputting welcome message and game mode selection.
			System.out.println("\nPlease select a weapon...");
			System.out.println("1. Spock");
			System.out.println("2. Scissors");
			System.out.println("3. Paper");
			System.out.println("4. Rock");
			System.out.println("5. Lizard");
			System.out.print("\nWeapon: ");

			try {
				answer = inputScanner.nextInt();// Getting input from the
				// user and storing it in
				// answer.

			} catch (InputMismatchException e) {
				System.out.println("That is not a number, Try again...");
				inputScanner.nextLine();// Clear the current line from the
				// scanner.
			}
			// If the user inputs either of the correct choices then flag is set
			// to false.
			if ((answer == 1) || (answer == 2) || (answer == 3)
					|| (answer == 4) || (answer == 5)) {
				flag = false;
			} else {
				System.out.println("\nThat is not a valid input...");
				System.out
						.println("Acceptable inputs are a \"1\", \"2\", \"3\", \"4\", or \"5\".");
			}
		} while (flag == true);

		// Based on the user's input create an instance of the selected weapon.
		switch (answer) {
		case 1:
			this.weapon = new Spock();
			break;
		case 2:
			this.weapon = new Scissors();
			break;
		case 3:
			this.weapon = new Paper();
			break;
		case 4:
			this.weapon = new Rock();
			break;
		case 5:
			this.weapon = new Lizard();
			break;

		}
		inputScanner.nextLine();//Skip to a new line of input.
		flag = true;// Resetting flag
		answer = 0;// Resetting answer

		// Will continually ask user for input until the correct input is
		// entered.
		do {

			// Outputting welcome message and game mode selection.
			System.out.println("\nPlease select a modifier...");
			System.out.println("1. Raidoactive");
			System.out.println("2. Poisonous");
			System.out.println("3. Infested");
			System.out.print("\nModifier: ");

			try {
				answer = inputScanner.nextInt();// Getting input from the
												// user and storing it in
												// answer.

			} catch (InputMismatchException e) {
				System.out.println("That is not a number, Try again...");
				inputScanner.nextLine();// Clear the current line from the
				// scanner.
			}
			// If the user inputs either of the correct choices then flag is set
			// to false.
			if ((answer == 1) || (answer == 2) || (answer == 3)) {
				flag = false;
			} else {
				System.out.println("\nThat is not a valid input...");
				System.out
						.println("Acceptable inputs are a \"1\", \"2\", or \"3\".");
			}
		} while (flag == true);

		// Based on the user's input create an instance of the selected weapon.
		switch (answer) {
		case 1:
			this.modifier = new Radioactive(weapon);
			break;
		case 2:
			this.modifier = new Poisonous(weapon);
			break;
		case 3:
			this.modifier = new Infested(weapon);
			break;
		}
	}
	
	/**
	 * Method to return the selected weapon and modification.
	 * 
	 * @param 			 There are no input arguments.
	 * 
	 * @return modifier	 Modifier that wraps a weapon chosen randomly by the computer.
	 */
	@Override
	public Modifier getAttack() {
		return modifier;
	}

}
