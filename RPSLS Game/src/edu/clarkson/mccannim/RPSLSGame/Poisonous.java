package edu.clarkson.mccannim.RPSLSGame;

/**
 * Derived class of Modifier and describes the poisonous modifier.
 * 
 * Extends Modifier.
 */
public class Poisonous extends Modifier {

	/**
	 * Poisonous's only constructor.
	 * 
	 * @param w	The weapon this modifier is to be encapsulating
	 */
	public Poisonous(Weapon w) {
		super(w);
	}

	/**
	 * Returns the phrase of the poisonous modifier as well as the phrase of the weapon that
	 * Poisonous contains
	 * 
	 *  @param There are no input arguments.
	 *  
	 *  @return String	A string consisting of the phrase "A poisonous " followed by whatever weapon phrase this modifier
	 *  				happens to encapsulate.
	 */
	@Override
	public String getPhrase() {
		return "A poisonous " + this.getWeapon().getPhrase();// Conctenating the
																// phrase
																// contained in
																// the weapon
																// and the
																// modifier and
																// concatenating
																// them.;
	}

}
