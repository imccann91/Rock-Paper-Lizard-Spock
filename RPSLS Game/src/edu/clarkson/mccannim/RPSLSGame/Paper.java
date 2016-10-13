package edu.clarkson.mccannim.RPSLSGame;

/**
 * Class that describes the paper weapon.
 *
 *Extends Weapon.
 */
public class Paper extends Weapon {
	/**
	 * Returns the string "piece of paper" so that a sentence can be constructed
	 * from the weapon and its modifier.
	 * 
	 * @param There are no input arguments.
	 * 
	 * @return String "piece of paper."
	 */
	@Override
	public String getPhrase() {
		return "piece of paper.";
	}

}
