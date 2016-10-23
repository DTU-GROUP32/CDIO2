package spil;

public class Player{

	private String name;
	private Bank bank;
	private int ID; 
	private static int nextID = 0; 


	// Create a bank account for each player and set player's credit to 1000
	public Player() {
		this.ID = nextID++;
		bank = new Bank(1000);


	}
	/**
	 * Sets player names on player object
	 * @param player
	 */
	public void setName(String name){
		this.name = name;
	}


	/**
	 * Return player's bank account from Bank object
	 * @return
	 */
	public Bank getBank(){
		return bank;
	}

	/**
	 * Return player's name from Player object
	 * @return
	 */
	public String getName(){
		return name;
	}

	/**
	 * Return player's ID
	 * @return
	 */
	public int getID(){
		return ID;
	}

	/**
	 * Return next ID from ID object
	 * @return
	 */
	public int getNextID(){

		return nextID;
	}
}
