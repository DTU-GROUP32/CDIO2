package spil;

public class Dice {
	
	private int sides = 6; // Number of sides of the dice
	private int faceValue; // Current face value of the dice
	
	/**
	 * Default constructor
	 */
	public Dice() {
		this(2);
	}
	
	/**
	 * Secondary constructor
	 * @param sides
	 */
	public Dice(int faceValue) {
		this.sides = faceValue;
	}
	
	/**
	 * Gets the number of sides of the dice
	 * @return sides
	 */
	public int getSides() {
		return this.sides;
	}
	
	/**
	 * Sets the number of sides of the dice
	 * @param sides
	 * @return sides
	 */
	public int setSides(int sides) {
		this.sides = sides;
		return sides;
	}
	
	/**
	 * Gets face value of the dice
	 * @return faceValue
	 */
	public int getFaceValue() {
		return this.faceValue;
	}
	
	/**
	 * Sets face value to random generated number inbetween 1 and the int 'sides'
	 */
	public void roll() {
		this.faceValue = (int) ((Math.random()*sides)+1);
	}
}
