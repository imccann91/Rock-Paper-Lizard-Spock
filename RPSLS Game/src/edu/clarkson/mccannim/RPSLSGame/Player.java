package edu.clarkson.mccannim.RPSLSGame;

/**
 * Abstract class Player defines methods for implementation by derivative classes.
 * 
 */
public abstract class Player {
	
	/**
	 * Abstract method that allows the selection of a weapon and modifier for a player. This is
	 * to be implemented in sub-classes.
	 * 
	 * @param There are no input arguments.
	 * 
	 * @return Void
	 */
	public abstract void setAttack();
	
	/**
	 * Abstract method that returns a player's weapon and modification selection. This is to be
	 * implemented in sub-classes.
	 * 
	 * @param There are no input arguments.
	 * 
	 * @return A modifier that wraps a weapon.
	 * 
	 * 
	 */
	public abstract Modifier getAttack();
}
