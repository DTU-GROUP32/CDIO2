package spil;

public class Player{

	private String playerName;
	private Bank bankAccount;
	private int id; 
	private int nextId = 0; 


	// Create a bank account for each player and set player's credit to 1000
	public Player() {
		this.id = nextId++;
		bankAccount = new Bank(1000);

	}

	/**
	 * Sets player names on player object
	 * @param playerName
	 */
	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}

	
	/**
	 * Return player's bank account from Bank object
	 * @return
	 */
	public Bank getBankAccount(){
		return bankAccount;
	}
	
	/**
	 * Return player's name from Player object
	 * @return
	 */
	public String getPlayerName(){
		return playerName;
	}
	
	/**
	 * Return player's ID
	 * @return
	 */
	public int getID(){
		return id;
	}
	
	/**
	 * Return next ID from ID object
	 * @return
	 */
	public int getNextID(){

		return nextId;
	}
}
