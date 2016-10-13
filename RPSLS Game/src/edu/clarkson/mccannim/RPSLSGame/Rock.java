package edu.clarkson.mccannim.RPSLSGame;

/**
 * Class that describes the rock weapon.
 *
 *Extends Weapon.
 */
public class Rock extends Weapon {
	/**
	 * Returns the string "rock." so that a sentence can be constructed from the
	 * weapon and its modifier.
	 * 
	 * @param There are no input arguments.
	 * 
	 * @return String "rock."
	 */
	@Override
	public String getPhrase() {
		return "rock.";
	}

}
