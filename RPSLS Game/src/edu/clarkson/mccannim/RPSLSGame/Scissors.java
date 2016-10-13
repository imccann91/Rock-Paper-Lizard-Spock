package edu.clarkson.mccannim.RPSLSGame;

/**
 * Class that describes the scissors weapon.
 *
 *Extends Weapon.
 */
public class Scissors extends Weapon {
	/**
	 * Returns the string "pair of scissors." so that a sentence can be
	 * constructed from the weapon and its modifier.
	 * 
	 * @param There are no input arguments.
	 * 
	 * @return String "pair of scissors."
	 */
	@Override
	public String getPhrase() {
		return "pair of scissors.";
	}

}
