package edu.clarkson.mccannim.RPSLSGame;

/**
 * Derived class of Modifier and describes the radioactive modifier.
 * 
 * Extends Modifier.
 */
public class Radioactive extends Modifier {

	/**
	 * Radioavtive's only constructor.
	 * 
	 * @param w	The weapon this modifier is to be encapsulating
	 */
	public Radioactive(Weapon w) {
		super(w);
	}

	/**
	 * Returns the phrase of the radioactive modifier as well as the phrase of the weapon that
	 * Radioactive contains
	 * 
	 *  @param There are no input arguments.
	 *  
	 *  @return String	A string consisting of the phrase "A radioactive " followed by whatever weapon phrase this modifier
	 *  				happens to encapsulate.
	 */
	public String getPhrase() {
		return "A radioactive " + this.getWeapon().getPhrase();// Conctenating
																// the phrase
																// contained in
																// the weapon
																// and the
																// modifier and
																// concatenating
																// them.;
	}

}
