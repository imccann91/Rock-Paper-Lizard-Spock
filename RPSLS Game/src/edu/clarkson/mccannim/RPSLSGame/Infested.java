package edu.clarkson.mccannim.RPSLSGame;

/**
 * Derived class of Modifier and describes the infested modifier.
 * 
 * Extends Modifier.
 */
public class Infested extends Modifier {

	/**
	 * Infested's only constructor.
	 * 
	 * @param w	The weapon this modifier is to be encapsulating
	 */
	public Infested(Weapon w) {
		super(w);
	}

	/**
	 * Returns the phrase of the infested modifier as well as the phrase of the weapon that
	 * Infested contains
	 * 
	 *  @param There are no input arguments.
	 *  
	 *  @return String	A string consisting of the phrase "An infested " followed by whatever weapon phrase this modifier
	 *  				happens to encapsulate.
	 */
	@Override
	public String getPhrase() {
		return "An infested " + this.getWeapon().getPhrase();// Conctenating the
																// phrase
																// contained in
																// the weapon
																// and the
																// modifier and
																// concatenating
																// them.
	}

}
