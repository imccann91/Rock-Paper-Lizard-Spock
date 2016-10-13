package edu.clarkson.mccannim.RPSLSGame;

/**
 * Class that defines a computer opponent. Weapons and modifiers are chosen at random.
 * 
 * Extends Player
 *
 */
public class ComputerPlayer extends Player {
	private Weapon weapon;//Weapon chosen by the computer
	private Modifier modifier;//Modifier chosen that encapsulates the weapon chosen.
	
	/**
	 * Randomly chooses a weapon and a modification. The chosen modification wraps the chosen weapon.
	 * 
	 * @param There are no input arguments.
	 * 
	 * @return Nothing is returned.
	 */
	@Override
	public void setAttack() {
		int choice = (int) (Math.random() * 5);// Create a random number between 0 and 4.
		switch (choice) {
		case 0:
			this.weapon = new Spock();
			break;
		case 1:
			this.weapon = new Lizard();
			break;
		case 2:
			this.weapon = new Scissors();
			break;
		case 3:
			this.weapon = new Rock();
			break;
		case 4:
			this.weapon = new Paper();
			break;
		default:
			this.weapon = new Spock();
			break;
		}

		choice = (int) (Math.random() * 3);// Create a random number between 0 and 2

		switch (choice) {
		case 0:
			this.modifier = new Radioactive(weapon);
			break;
		case 1:
			this.modifier = new Infested(weapon);
			break;
		case 2:
			this.modifier = new Poisonous(weapon);
			break;
		default:
			this.modifier = new Radioactive(weapon);
			break;
		}

	}

	/**
	 * Method to return the selected weapon and modification.
	 * 
	 * @param 			 There are no input arguments.
	 * 
	 * @return modifier	 Modifier that wraps a weapon chosen randomly by the computer.
	 */
	@Override
	public Modifier getAttack() {
		return modifier;
	}

}
