package edu.clarkson.mccannim.RPSLSGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassStructureTest {

	@Test
	public void test() {

		// Testing if class Spock returns the correct phrase.
		Spock spock = new Spock();
		assertEquals("The expected phrase is: ", "Spock.", spock.getPhrase());

		Rock rock = new Rock();
		assertEquals("The expected phrase is: ", "rock.", rock.getPhrase());

		Paper paper = new Paper();
		assertEquals("The expected phrase is: ", "piece of paper.",
				paper.getPhrase());

		Scissors scissors = new Scissors();
		assertEquals("The expected phrase is: ", "pair of scissors.",
				scissors.getPhrase());

		Lizard lizard = new Lizard();
		assertEquals("The expected phrase is: ", "lizard.", lizard.getPhrase());

	//Richard's EoponGameTests	
		//Weapon Game, A true Tie with 2 Radio-active lizards
		WeaponGame wg = new WeaponGame();
		HumanPlayer p2 = new HumanPlayer();//Need this to get computer player to print custom phrases at rounds end
		ComputerPlayer ai2 = new ComputerPlayer();
		assertEquals("The expected phrase is: ","There is a tie!", wg.evaluate(new Radioactive(lizard), new Radioactive(lizard), p2));
		
		//Weapon Game, Tied gestures, use modifiers to resolve , P1 = (Infested Lizard) beats (P2 = Radio-active Lizard)
		assertEquals("The expected phrase is: ","Player 1 has won this round with: An infested lizard.", wg.evaluate(new Infested(lizard), new Radioactive(lizard), p2));
		
		//Weapon Game, Scissor beats lizard, P1 = (Infested Lizard) loses to (P2 = Radio-active Scissors)
		assertEquals("The expected phrase is: ","Player 2 has won this round with: A radioactive pair of scissors.", wg.evaluate(new Infested(lizard), new Radioactive(scissors), p2 ) );
		
		//Weapon Game, Scissor beats lizard, P1 = (Infested Lizard) loses to (P2 = Radio-active Scissors) who is a computer
		assertEquals("The expected phrase is: ","The computer has won this round with: A radioactive pair of scissors.", wg.evaluate(new Infested(lizard), new Radioactive(scissors), ai2 ) );		
		
	// Wrapping Spock with a radio-active modifier.
		Radioactive radioactive = new Radioactive(spock);
		assertEquals("The expected phrase is: ", "A radioactive Spock.",
				radioactive.getPhrase());
		
	//Ian's ModifierGeme Tests
		//Checking tie logic in ModifierGame by sending a radioactive Spock for both players.
		ModifierGame mg = new ModifierGame();
		assertEquals("The expected phrase is: ", "There is a tie!",mg.evaluate(new Radioactive(new Spock()), new Radioactive(new Spock()), p2));
		
		//Checking logic for player 1 winning.
		assertEquals("The expected phrase is: ", "Player 1 has won this round with: A radioactive Spock.",mg.evaluate(new Radioactive(new Spock()), new Poisonous(new Rock()), p2));
		
		//Checking logic for player 1 winning if the modifiers initially are tied.
		assertEquals("The expected phrase is: ", "Player 1 has won this round with: A radioactive Spock.",mg.evaluate(new Radioactive(new Spock()), new Radioactive(new Rock()), p2));
		
		//Checking logic for player 2 winning.
		assertEquals("The expected phrase is: ", "Player 2 has won this round with: An infested Spock.",mg.evaluate(new Radioactive(new Rock()), new Infested(new Spock()), p2));
				
		//Checking logic for player 2 winning if the modifiers initially are tied.
		assertEquals("The expected phrase is: ", "Player 2 has won this round with: A radioactive lizard.",mg.evaluate(new Radioactive(new Spock()), new Radioactive(new Lizard()), p2));
		
		//Checking logic for player 2 winning if the modifiers initially are tied. As a computer for player2
		assertEquals("The expected phrase is: ", "The computer has won this round with: A radioactive lizard.",mg.evaluate(new Radioactive(new Spock()), new Radioactive(new Lizard()), ai2));
				
		
		HumanPlayer human = new HumanPlayer();
		human.setAttack();//Enter in a radioactive Spock.
		
		//Testing Human player class
		assertEquals("The expected phrase is: ", "A radioactive Spock.", human.getAttack().getPhrase());
	}

}
