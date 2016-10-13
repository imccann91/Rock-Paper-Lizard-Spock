package edu.clarkson.mccannim.RPSLSGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean flag = true;// Used in detecting if the user inputted a valid
		// number (either a 1 or a 2).
		int gameMode = 0;// Used for input by user in selecting game mode.
		int rounds = 0;// The number of rounds the user wishes to play.
		int playerSelect = 0;// Whether the game will be two humans, or human vs the computer.

		Scanner inputScanner = new Scanner(System.in);// Creating a scanner, so
		// input from the user
		// can be taken.

		//Asking the user for what game mode they wish to play.
		do {

			// Outputting welcome message and game mode selection.
			System.out.println("\nWelcome to Rock, Paper, Scissors, Lizard, Spock!");
			System.out.print("What mode would you like to play?\n" + "1. Modifiers in a round are compared first.\n");
			System.out.println("2. Weapons in a round are compared first.\n");
			System.out.print("Mode: ");

			try {
				gameMode = inputScanner.nextInt();// Getting input from the
				// user and storing it in
				// answer.

			} catch (InputMismatchException e) {
				System.out.println("That is not a number, Try again...");
				inputScanner.nextLine();// Clear the current line from the
				// scanner.
			}
			// If the user inputs either of the correct choices then flag is set
			// to false.
			if ((gameMode == 1) || (gameMode == 2)) {
				flag = false;
			} else {
				System.out.println("\nThat is not a valid input...");
				System.out.println("Acceptable inputs are a \"1\" or a \"2\".");
			}
		} while (flag == true);
		flag = true;// Resetting flag.
		inputScanner.nextLine();//Clearing the current line.

		//Asking the user for how many rounds of play they wish.
		do {

			// Outputting question of the number of rounds the user would like to play.
			System.out.println("\nHow many rounds would you like to play?");
			System.out.print("Acceptable number of rounds is any integer greater than or equal to 0.\n");
			System.out.print("If the number of rounds is entered as 0, 3 rounds of play will be assumed.\n");
			System.out.print("rounds: ");

			try {
				rounds = inputScanner.nextInt();// Getting input from the
				// user and storing it in
				// answer.

			} catch (InputMismatchException e) {
				System.out.println("That is not a number, Try again...");
				inputScanner.nextLine();// Clear the current line from the
				// scanner.
			}
			// If the user inputs either of the correct choices then flag is set
			// to false.
			if (rounds >= 0) {
				flag = false;
			} else {
				System.out.println("\nThat is not a valid input...");
				System.out.println("Acceptable inputs are any number 0 or greater.");
			}
		} while (flag == true);
		flag = true;// Resetting flag.
		inputScanner.nextLine();//Clearing the current line.
		
		//Asking the user if the game will be with two people, or human vs the computer.
		do {

			// Outputting question of the number of rounds the user would like to play.
			System.out.println("\nWould you like to play against a friend, or the computer?");
			System.out.print("1. Human vs Human\n" + "2. Human vs Computer\n");
			System.out.print("Game type: ");

			try {
				playerSelect = inputScanner.nextInt();// Getting input from the
				// user and storing it in
				// answer.

			} catch (InputMismatchException e) {
				System.out.println("That is not a number, Try again...");
				inputScanner.nextLine();// Clear the current line from the
				// scanner.
			}
			// If the user inputs either of the correct choices then flag is set
			// to false.
			if ((playerSelect == 1) || (playerSelect == 2)) {
				flag = false;
			} else {
				System.out.println("\nThat is not a valid input...");
				System.out.println("Acceptable inputs are \"1\" or \"2\".");
			}
		} while (flag == true);
		
		// If the user enters a 1 a game where modifiers are started first is
		// started.
		// Else a game where weapons are compared first is started.
		if (gameMode == 1) {
			if (rounds == 0) {
				ModifierGame game1 = new ModifierGame();// Create a new game where modifiers are
														// compared first.
				//PVP or PVE
				if(playerSelect == 1){
					humanVsHuman(game1);
				}else{
					humanVsMachine(game1);
				}
				
			} else {
				ModifierGame game1 = new ModifierGame(rounds);// Creates a game with the specified
																// number of rounds.
				//PVP or PVE
				if(playerSelect == 1){
					humanVsHuman(game1);
				}else{
					humanVsMachine(game1);
				}
			}

		} else {
			if (rounds == 0) {
				WeaponGame game2 = new WeaponGame();// Create a new game where weapons are compared
													// first.
				//PVP or PVE
				if(playerSelect == 1){
					humanVsHuman(game2);
				}else{
					humanVsMachine(game2);
				}
			} else {
				WeaponGame game2 = new WeaponGame(rounds);// Creates a game with the specified
														  // number of rounds.
				//PVP or PVE
				if(playerSelect == 1){
					humanVsHuman(game2);
				}else{
					humanVsMachine(game2);
				}
			}
		}
		inputScanner.close();//Closing the input scanner.
	}
	
	//Human vs Human game
	private static void humanVsHuman(Game game){
		
		HumanPlayer player1 = new HumanPlayer();
		HumanPlayer player2 = new HumanPlayer();
		
		while(game.gameOver(player2) == false){
			System.out.println("Player 1, select an attack:");
			player1.setAttack();
			System.out.println("Player 2, select an attack:");
			player2.setAttack();
			
			System.out.println(game.evaluate(player1.getAttack(), player2.getAttack(), player2));
		}
	}
	
	//Human vs the computer game.
		private static void humanVsMachine(Game game){
			
			HumanPlayer player1 = new HumanPlayer();
			ComputerPlayer player2 = new ComputerPlayer();
			
			while(game.gameOver(player2) == false){
				System.out.println("Player select an attack:");
				player1.setAttack();
				System.out.println("\nComputer's turn...\n");
				player2.setAttack();
				
				System.out.println(game.evaluate(player1.getAttack(), player2.getAttack(), player2));
			}
		}
}
