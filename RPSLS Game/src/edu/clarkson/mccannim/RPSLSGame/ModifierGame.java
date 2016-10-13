package edu.clarkson.mccannim.RPSLSGame;

/**
 * Rock, paper, scissors, lizard, Spock game where modifiers are compared first before weapons.
 *
 *Implements Game
 */
public class ModifierGame implements Game{
	
private int roundsRemaining;//Number of rounds of play remaining.
private int player1Wins = 0;//Number of wins player 1 has.
private int player2Wins = 0;//Number of wins player 2 has.
	
	/**
	* Default ModifierGame constructor which assumes that the number of rounds to be played is 3.
	* 
	*@param There are no input arguments
	*/
	//Default constructor, assumes at least 3 rounds of play.
	public ModifierGame(){
		this.roundsRemaining = 3;
	}
	
	/**
	 * ModifierGame constructor that allows the number of rounds to be defined.
	 * @param rounds	The number of rounds to be played.
	 */
	//Constructor that allows selection of rounds.
	public ModifierGame(int rounds){
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
	public String evaluate(Modifier mod1, Modifier mod2, Player p2){
		boolean result = false;//Gets set to true if player 1 wins. Stays false if player 2 wins.
		boolean tie = false;//gets set to true if there is a complete tie.
		
		//Checking all the possibilities if player 1 chose radioactive.
		if(mod1 instanceof Radioactive && mod2 instanceof Poisonous){
			result = true;//Radioactivity beats poisonous
		}else{
			if(mod1 instanceof Radioactive && mod2 instanceof Radioactive){//If both players chose radioactive.
				if(mod1.getWeapon() instanceof Spock && mod2.getWeapon() instanceof Rock){
					result = true;
				}
				if(mod1.getWeapon() instanceof Spock && mod2.getWeapon() instanceof Scissors){
					result = true;
				}
				if(mod1.getWeapon() instanceof Scissors && mod2.getWeapon() instanceof Paper){
					result = true;
				}
				if(mod1.getWeapon() instanceof Scissors && mod2.getWeapon() instanceof Lizard){
					result = true;
				}
				if(mod1.getWeapon() instanceof Paper && mod2.getWeapon() instanceof Rock){
					result = true;
				}
				if(mod1.getWeapon() instanceof Paper && mod2.getWeapon() instanceof Spock){
					result = true;
				}
				if(mod1.getWeapon() instanceof Rock && mod2.getWeapon() instanceof Lizard){
					result = true;
				}
				if(mod1.getWeapon() instanceof Rock && mod2.getWeapon() instanceof Scissors){
					result = true;
				}
				if(mod1.getWeapon() instanceof Lizard && mod2.getWeapon() instanceof Spock){
					result = true;
				}
				if(mod1.getWeapon() instanceof Lizard && mod2.getWeapon() instanceof Paper){
					result = true;
				}
				//Checking for ties in weapons.
				if(mod1.getWeapon() instanceof Spock && mod2.getWeapon() instanceof Spock){
					tie = true;
				}
				if(mod1.getWeapon() instanceof Scissors && mod2.getWeapon() instanceof Scissors){
					tie = true;
				}
				if(mod1.getWeapon() instanceof Paper && mod2.getWeapon() instanceof Paper){
					tie = true;
				}
				if(mod1.getWeapon() instanceof Rock && mod2.getWeapon() instanceof Rock){
					tie = true;
				}
				if(mod1.getWeapon() instanceof Lizard && mod2.getWeapon() instanceof Lizard){
					tie = true;
				}
				
			}
			//Checking all possibilities if player 1 chose poisonous.
			if(mod1 instanceof Poisonous && mod2 instanceof Infested){
				result = true;
			}else{
				if(mod1 instanceof Poisonous && mod2 instanceof Poisonous){//If both players chose poisonous.
					if(mod1.getWeapon() instanceof Spock && mod2.getWeapon() instanceof Rock){
						result = true;
					}
					if(mod1.getWeapon() instanceof Spock && mod2.getWeapon() instanceof Scissors){
						result = true;
					}
					if(mod1.getWeapon() instanceof Scissors && mod2.getWeapon() instanceof Paper){
						result = true;
					}
					if(mod1.getWeapon() instanceof Scissors && mod2.getWeapon() instanceof Lizard){
						result = true;
					}
					if(mod1.getWeapon() instanceof Paper && mod2.getWeapon() instanceof Rock){
						result = true;
					}
					if(mod1.getWeapon() instanceof Paper && mod2.getWeapon() instanceof Spock){
						result = true;
					}
					if(mod1.getWeapon() instanceof Rock && mod2.getWeapon() instanceof Lizard){
						result = true;
					}
					if(mod1.getWeapon() instanceof Rock && mod2.getWeapon() instanceof Scissors){
						result = true;
					}
					if(mod1.getWeapon() instanceof Lizard && mod2.getWeapon() instanceof Spock){
						result = true;
					}
					if(mod1.getWeapon() instanceof Lizard && mod2.getWeapon() instanceof Paper){
						result = true;
					}
					//Checking for ties in weapons.
					if(mod1.getWeapon() instanceof Spock && mod2.getWeapon() instanceof Spock){
						tie = true;
					}
					if(mod1.getWeapon() instanceof Scissors && mod2.getWeapon() instanceof Scissors){
						tie = true;
					}
					if(mod1.getWeapon() instanceof Paper && mod2.getWeapon() instanceof Paper){
						tie = true;
					}
					if(mod1.getWeapon() instanceof Rock && mod2.getWeapon() instanceof Rock){
						tie = true;
					}
					if(mod1.getWeapon() instanceof Lizard && mod2.getWeapon() instanceof Lizard){
						tie = true;
					}
				}
				
				//Checking if player 1 chose infested.
				if(mod1 instanceof Infested && mod2 instanceof Radioactive){
					result = true;
				}else{
					if(mod1 instanceof Infested && mod2 instanceof Infested){//If both players chose infested, check weapons.
						if(mod1.getWeapon() instanceof Spock && mod2.getWeapon() instanceof Rock){
							result = true;
						}
						if(mod1.getWeapon() instanceof Spock && mod2.getWeapon() instanceof Scissors){
							result = true;
						}
						if(mod1.getWeapon() instanceof Scissors && mod2.getWeapon() instanceof Paper){
							result = true;
						}
						if(mod1.getWeapon() instanceof Scissors && mod2.getWeapon() instanceof Lizard){
							result = true;
						}
						if(mod1.getWeapon() instanceof Paper && mod2.getWeapon() instanceof Rock){
							result = true;
						}
						if(mod1.getWeapon() instanceof Paper && mod2.getWeapon() instanceof Spock){
							result = true;
						}
						if(mod1.getWeapon() instanceof Rock && mod2.getWeapon() instanceof Lizard){
							result = true;
						}
						if(mod1.getWeapon() instanceof Rock && mod2.getWeapon() instanceof Scissors){
							result = true;
						}
						if(mod1.getWeapon() instanceof Lizard && mod2.getWeapon() instanceof Spock){
							result = true;
						}
						if(mod1.getWeapon() instanceof Lizard && mod2.getWeapon() instanceof Paper){
							result = true;
						}
						//Checking for ties in weapons.
						if(mod1.getWeapon() instanceof Spock && mod2.getWeapon() instanceof Spock){
							tie = true;
						}
						if(mod1.getWeapon() instanceof Scissors && mod2.getWeapon() instanceof Scissors){
							tie = true;
						}
						if(mod1.getWeapon() instanceof Paper && mod2.getWeapon() instanceof Paper){
							tie = true;
						}
						if(mod1.getWeapon() instanceof Rock && mod2.getWeapon() instanceof Rock){
							tie = true;
						}
						if(mod1.getWeapon() instanceof Lizard && mod2.getWeapon() instanceof Lizard){
							tie = true;
						}
					}
				}
			}
		}
		
		//If there is a complete tie between the players this round, state so.
		if(tie == true){
			--roundsRemaining;//Decrement the number of rounds left to play.
			return "There is a tie!";
		}else{
			if(result == true){
				--roundsRemaining;//Decrement the number of rounds left to play.
				++player1Wins;//Increment the number of rounds player 1 has won.
				return "Player 1 has won this round with: " + mod1.getPhrase();
			}else{
				--roundsRemaining;//Decrement the number of rounds left to play.
				++player2Wins;//Increment the number of rounds player 2 has won.
				
				//Player 2 must have won...
				if (p2 instanceof HumanPlayer){
					return "Player 2 has won this round with: " + mod2.getPhrase();
				} else {//Player 2 is a computer
					return "The computer has won this round with: " + mod2.getPhrase();
				}
				//return "Player 2 has won this round with: " + mod2.getPhrase();
			}
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