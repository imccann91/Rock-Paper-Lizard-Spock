package edu.clarkson.mccannim.RPSLSGame;

/**
 * Abstract class Weapon defines methods for implementation by derivative classes.
 *  
 */
public abstract class Weapon {

	/**
	 * Abstract method that returns the phrase that describes a weapon.
	 * 
	 * @param There are no input arguments.
	 * 
	 * @return String A string that describes that weapon.
	 */
	public abstract String getPhrase();// Implemented in derived classes.
}
