package edu.clarkson.mccannim.RPSLSGame;

/**
 * Rock, paper, scissors, lizard, Spock game where weapons are compared first before modifiers.
 * 
 * Implements Game
 */
public class WeaponGame implements Game{
	
	private int roundsRemaining;//Number of rounds of play remaining.
	private int player1Wins = 0;//Number of wins player 1 has.
	private int player2Wins = 0;//Number of wins player 2 has.

		/**
		 * Default WeaponGame constructor which assumes the number of rounds to paly is 3.
		 * 
		 * @param There are no input arguments.
		 */
		public WeaponGame(){
			this.roundsRemaining = 3;
		}
		
		/**
		 * WeaponGame constructor that allows the number of rounds to be defined.
		 * @param rounds	The number of rounds to be played.
		 */
		public WeaponGame(int rounds){
			this.roundsRemaining = rounds;
		}
	
		/**
		 * Method that evaluates the weapon and modifier selections of two players. 
		 * 
		 * @param mod1		The modifier and weapon chosen by player 1. The modifier must contain a weapon.
		 * @param mod2		The modifier and weapon chosen by player 2. The modifier must contain a weapon.
		 * @param p2		The type of player 2. For the correct output the type of player for player 2 must be known.
		 * 
		 * @return String "There is a tie!"							In the event that a round ends in a tie.
		 * @return String "Player 1 has won this round with: " 		If player 1 wins a round. The string also contains the phrase created from the modifier and weapon chosen.
		 * @return String "Player 2 has won this round with: "  	If player 2 wins a round. The string also contains the phrase created from the modifier and weapon chosen.
		 * @return String "The computer has won this round with: "	If the computer wins a round. The string also contains the phrase created from the modifier and weapon chosen.
		 * 
		 * Strings created from modifiers and weapons vary based on what was chosen for the round. For example choosing radioactive and Spock will form the string "A radioactive Spock."
		 */
	public String evaluate (Modifier m1, Modifier m2, Player p2){
		boolean p2won = false;//True if player2 has won this round
		boolean tie = false;//True if checking modifiers and for a true tie
		
		if (m2.getWeapon() instanceof Rock){//If player2 chose rock
			if (m1.getWeapon() instanceof Rock){
				tie = true;//Rock is Rock, check modifiers
			} else if ((m1.getWeapon() instanceof Lizard) || (m1.getWeapon() instanceof Scissors)){
				p2won=true;//Rock crushes Lizard or Rock breaks Scissors regardless of modifiers
			} //Else player 2 Lost (default) and not tie (default)
		}
		if (m2.getWeapon() instanceof Paper){//If player2 chose Paper
			if (m1.getWeapon() instanceof Paper){
				tie = true;//Paper is Paper, check modifiers
			} else if ((m1.getWeapon() instanceof Rock) || (m1.getWeapon() instanceof Spock)){
				p2won=true;//Paper covers Rock or Paper disproves Spock regardless of modifiers
			} //Else player 2 Lost (default) and not tie (default)
		}
		if (m2.getWeapon() instanceof Scissors){//if player2 chose Scissors
			if (m1.getWeapon() instanceof Scissors){
				tie = true;//Both chose Scissors, resolve via checking modifiers 
			} else if ((m1.getWeapon() instanceof Lizard) || (m1.getWeapon() instanceof Paper)){
				p2won=true;//Scissors decapitates Lizard or Scissors cut Paper
			} //Else player 2 Lost (default) and not tie (default)
		}
		if (m2.getWeapon() instanceof Lizard){//If player2 chose lizard
			if (m1.getWeapon() instanceof Lizard){
				tie = true;//Both chose Lizards, resolve this via modifiers
			} else if ((m1.getWeapon() instanceof Paper) || (m1.getWeapon() instanceof Spock)){
				p2won=true;//Lizard Bites Spock or Lizard eats Paper
			} //Else player 2 Lost (default) and not tie (default)
		}
		if (m2.getWeapon() instanceof Spock){//If player2 chose Spock
			if (m1.getWeapon() instanceof Spock){
				tie = true;//We both chose Spock, resolve via modifiers
			} else if ((m1.getWeapon() instanceof Rock) || (m1.getWeapon() instanceof Scissors)){
				p2won=true;//Spock crushes Scissors, Spock vaporizes Rock
			} //Else player 2 Lost (default) and not tie (default)
		}
		//Take care of a weapon / gesture tie by comparing modifiers
		if (tie == true){
			if (m2 instanceof Poisonous) {
				if (m1 instanceof Poisonous){
					--roundsRemaining;//Decrement the number of rounds left to play.
					return "There is a tie!";//we are both poisonous, it really is a tie.
				}else if (m1 instanceof Infested){
					p2won = true;//Poison player1 cures/kills infested player2
				}//Else p2 LOST (default) because p1 must be Radioactive and Poisonous p2 LOSES against Radioactive p1
			} //Else p2 lost because poison beats Radioactive
			if (m2 instanceof Radioactive){
				if (m1 instanceof Radioactive){
					--roundsRemaining;//Decrement the number of rounds left to play.
					return "There is a tie!";//we are both radioactive, it really is a tie.
				}else if (m1 instanceof Poisonous){
					p2won = true;//Radiation player2 breaks down poisonous player1
				}//Else p2 LOST (default) because p1 must be infested and Radioactive p2 LOSES against Infested p1
			}
			if (m2 instanceof Infested){
				if (m1 instanceof Infested){
					--roundsRemaining;//Decrement the number of rounds left to play.
					return "There is a tie!";//we are both infested, it really is a tie.
				}else if (m1 instanceof Radioactive){
					p2won = true;//Infested player2 survives Radiation player1
				}//Else p2 LOST (default) because p1 must be Poison and Infested p2 LOSES against Poisonous p1
			}
		}
		//Declare a winner
		if (p2won == true){
			--roundsRemaining;//Decrement the number of rounds left to play.
			++player2Wins;//Increment the number of rounds player 2 has won.
			if (p2 instanceof HumanPlayer){
				return "Player 2 has won this round with: " + m2.getPhrase();	
			} else {//Player 2 is a computer
				return "The computer has won this round with: " + m2.getPhrase();
			}
			//return "Player 2 has won this round with: " + m2.getPhrase();
		}
		else{
			--roundsRemaining;//Decrement the number of rounds left to play.
			++player1Wins;//Increment the number of rounds player 1 has won.
			return "Player 1 has won this round with: " + m1.getPhrase();
		}
	}
	
	/**
	 * Return true if the number of remaining rounds is zero. Print message when Game over declaring winner/tie
	 * 
	 * @param  p2	The type of player for player 2. Used in generating the correct output message.
	 * 
	 * @return boolean true		There are no more rounds of play remaining. The game has ended.
	 * @return boolean false	There are more rounds of play remaining. The game has not ended.
	 */
	public boolean gameOver(Player p2){
		if(roundsRemaining == 0){//if no rounds remain
			if (player1Wins > player2Wins){//Player 1 has the most points
				System.out.println("Game over: Player 1 has won the most rounds.");
			}else if (player1Wins == player2Wins){//Score is tie
				System.out.println("Game over: It is a tie, everyone loses.");
			}else {//Player 2 must have won...
				if (p2 instanceof HumanPlayer){
					System.out.println("Game over: Player 2 has won the most rounds.");	
				} else {//Player 2 is a computer
					System.out.println("Game over: The computer has won the most rounds.");
				}
			}
			return true;
		}else{//there are STILL rounds remaining, CONTINUE !
			return false;
		}
	}
}