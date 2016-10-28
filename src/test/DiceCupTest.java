package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.Dice;
import spil.DiceCup;

import static org.junit.Assert.*;

public class DiceCupTest {
	DiceCup dices;

	@Before
	public void setUp() throws Exception {
		dices = new DiceCup(4);
		dices.rollDices();
	}

	@After
	public void tearDown() throws Exception {
		dices = null;
	}

	/**
	 * Tests if the getDices method actually return an array of Dice objects.
	 * @throws Exception
	 */
	@Test
	public void getDices() throws Exception {
		Dice dice = new Dice();
		assertEquals(dices.getDices()[0], dice);
	}

	
	/**
	 * Tests if all dices have the same value after having used the rollDices, it is possible that this could
	 * happen even if the dices were in fact rolled, but it's highly unlikely.
	 * @throws Exception
	 */
	@Test
	public void rollDices() throws Exception {
		int d1before = dices.getDices()[0].getFaceValue();
		int d2before = dices.getDices()[1].getFaceValue();
		int d3before = dices.getDices()[2].getFaceValue();
		int d4before = dices.getDices()[3].getFaceValue();
		dices.rollDices();
		int d1after = dices.getDices()[0].getFaceValue();
		int d2after = dices.getDices()[1].getFaceValue();
		int d3after = dices.getDices()[2].getFaceValue();
		int d4after = dices.getDices()[3].getFaceValue();
		assertFalse(d1before == d1after && d2before == d2after && d3before == d3after && d4before == d4after);
	}

	/**
	 * Tests if the getSum method return the same result, as if you added all the face values together one by one.
	 * @throws Exception
	 */
	@Test
	public void getSum() throws Exception {
		int expected = 0;
		for(Dice dice : dices.getDices())
			expected += dice.getFaceValue();
		int actual = dices.getSum();
		assertTrue(expected == actual);
	}

	/**
	 * Tests if the sides of the first dice in the array of dices is indeed changed after having called the method.
	 * @throws Exception
	 */
	@Test
	public void setDiceSides() throws Exception {
		dices = new DiceCup();
		int before = dices.getDices()[0].getSides();
		dices.setDiceSides(5, 7);
		int after = dices.getDices()[0].getSides();
		assertFalse(before == after);
	}

}