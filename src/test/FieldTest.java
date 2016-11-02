package test;

import spil.Field;
import spil.Player;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FieldTest {
	Player player;
	
	@Before
	public void setUp() throws Exception {
		player = new Player();
	}

	@After
	public void tearDown() throws Exception {
		player = null;
	}


	@Test // Tests landOnField() method with a plus-effect
	public void testLandOnFieldPlusEffect() {
		Field field = new Field(300);
		
		field.landOnField(player);

		int actual = player.getBank().getBalance();
		int expected = 1300;
		
		assertEquals(expected, actual);
	} // As expected

	
	@Test // Tests landOnField() method with a minus-effect
	public void testLandOnFieldMinusEffect() {
		Field field = new Field(-300);
		
		field.landOnField(player);

		int actual = player.getBank().getBalance();
		int expected = 700;
		
		assertEquals(expected, actual);
	} // As expected
	
	
	@Test // Tests if landOnField() returns false (extraTurn)
	public void testLandOnFieldReturnFalse() {
		Field field = new Field(-300);
		
		assertEquals(false, field.landOnField(player));
	} // As expected
	
	
	@Test // Again, tests if landOnField() returns false (extraTurn), using secondary constructor
	public void testLandOnFieldReturnFalse2() {
		Field field = new Field(-300, false);
		
		assertEquals(false, field.landOnField(player));
	} // As expected
	
	
	@Test // Tests if landOnField() returns true (extraTurn)
	public void testLandOnFieldReturnTrue() {
		Field field = new Field(-300, true);
		
		assertEquals(true, field.landOnField(player));
	} // As expected
	
	
	// FOLLOWING TESTS ARE CONSIDERED (MAYBE) UNNECESSARY AND SUPERFICIAL,
	// BECAUSE WE ASSUME THAT SUCH THINGS WON'T BE ABLE TO OCCUR UNDER OUR CIRCUMSTANCES.
	
	
	@Test // Tests landOnField() method with max value
	public void testLandOnFieldMaxEffect() {

		Field field = new Field(Integer.MAX_VALUE);
		
		field.landOnField(player);

		int actual = player.getBank().getBalance();
		int expected = Integer.MAX_VALUE;
		
		assertEquals(expected, actual);
	} // Not as expected
	
	
	@Test // Tests landOnField() method with max value
	public void testLandOnFieldMinEffect() {

		Field field = new Field(Integer.MIN_VALUE);
		
		field.landOnField(player);

		int actual = player.getBank().getBalance();
		int expected = Integer.MIN_VALUE;
		
		assertEquals(expected, actual);
	} // Not as expected
	
    
}