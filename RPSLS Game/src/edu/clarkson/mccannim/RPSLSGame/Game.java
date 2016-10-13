package edu.clarkson.mccannim.RPSLSGame;

/**
 * Interface for game types. Used to create different game modes that may evaluate rounds of play or victory conditions differently.  
 *
 */
public interface Game {
	
	/**
	 * Evaluates a round of play.
	 * @param mod1		Modifier and weapon chosen by player 1, the modifier must contain a weapon.
	 * @param mod2		Modifier and weapon chosen by player 2, the modifier must conatin a weapon.
	 * @param p2		The type of player 2 that is used for a game.
	 * @return	String	The contents of the String is determined by the implementation.
	 */
	public String evaluate(Modifier mod1, Modifier mod2, Player p2);
	
	/**
	 * Determines victory conditions and if a game has ended.
	 * @param p2					The type of player 2 that is used for a game.
	 * @return boolean true/false	Interpretation as to what true and false mean is dependent on the game implementing the method.
	 */
	public boolean gameOver(Player p2);

}
