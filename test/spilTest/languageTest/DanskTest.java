package spilTest.languageTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.Player;
import spil.language.Dansk;
import spil.DiceCup;
import static org.junit.Assert.*;

/**
 * Created by Viktor on 24/10/2016.
 */
public class DanskTest {
	Dansk language; 
	Player player; 
	Player[] players;
	DiceCup diceCup;

	@Before
	public void setUp() throws Exception {
		language = new Dansk();
		player = new Player();
		diceCup = new DiceCup();
		players = new Player[2];
	}

	@After
	public void tearDown() throws Exception {
		language = null;
		player = null;
		players = null;
		diceCup = null;
	}

	@Test
	public void welcomeMsg() throws Exception {
		assertTrue(language.welcomeMsg() instanceof String);

	}


	@Test
	public void askForPlayerName() throws Exception {
		assertTrue(language.askForPlayerName(0) instanceof String);
	}

	@Test
	public void readyToBegin() throws Exception {
		assertTrue(language.readyToBegin() instanceof String);
	}

	@Test
	public void preMsg() throws Exception {
		assertTrue(language.preMsg(player) instanceof String);
	}

	@Test
	public void rollResult() throws Exception {
		assertTrue(language.rollResult(diceCup) instanceof String);
	}

	@Test
	public void fieldMsg() throws Exception {
		assertTrue(language.fieldMsg(diceCup) instanceof String);
	}


	@Test
	public void postMsg() throws Exception {
		assertTrue(language.postMsg(player) instanceof String);
	}


	@Test
	public void winnerMsg() throws Exception {
		assertTrue(language.winnerMsg(player) instanceof String);
	}


	@Test
	public void menu() throws Exception {
		assertTrue(language.menu() instanceof String);
	}


	@Test
	public void printRules() throws Exception {
		assertTrue(language.printRules() instanceof String);
	}


	@Test
	public void printScore() throws Exception {
		assertTrue(language.printScore(players) instanceof String); // Failure
	}


	@Test
	public void changeDices() throws Exception {
		assertTrue(language.changeDices() instanceof String);
	}


	@Test
	public void printDiceChangeSucces() throws Exception {
		assertTrue(language.printDiceChangeSucces() instanceof String);

	}

	@Test
	public void printDiceChangeNotExecuted() throws Exception {
		assertTrue(language.printDiceChangeNotExecuted() instanceof String);
	}


	@Test
	public void printGameMenu() throws Exception {
		assertTrue(language.printGameMenu() instanceof String);
	}

}
