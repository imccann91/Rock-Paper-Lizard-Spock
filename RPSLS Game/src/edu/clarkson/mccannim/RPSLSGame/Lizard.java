package edu.clarkson.mccannim.RPSLSGame;

/**
 * Class that describes the lizard weapon.
 *
 *Extends Weapon.
 */
public class Lizard extends Weapon {
	/**
	 * Returns the string "lizard." so that a sentence can be constructed from
	 * the weapon and its modifier.
	 * 
	 * @param There are no input arguments.
	 * 
	 * @return String "lizard."
	 */
	@Override
	public String getPhrase() {
		return "lizard.";
	}

}
