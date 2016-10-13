package edu.clarkson.mccannim.RPSLSGame;

/**
 * Abstract class Modifier is a decorator to the class Weapon
 * 
 * Extends Weapon
 */
public abstract class Modifier extends Weapon {

	private Weapon weapon;// The base weapon to modify with radioactivity,
							// poison, or infestation.

	/**
	 * Modifier's default and only constructor.
	 * 
	 * @param w
	 */
	public Modifier(Weapon w) {

		this.weapon = w;// Encapsulating the weapon chosen within this modifier.
	}

	/**
	 * Return the weapon encapsulated by the modifier.
	 * 
	 * @param There are no input arguments.
	 * 
	 * @return weapon	The weapon encapsulated by the modifier.
	 */
	public Weapon getWeapon() {
		return weapon;
	}
}
