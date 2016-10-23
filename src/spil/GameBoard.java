package spil;

import java.util.Scanner;

public class GameBoard {
	private Scanner input = new Scanner(System.in);
	private LanguageHandler language;
	private DiceCup diceCup;
	private Player[] players = new Player[2];
	private Player winner = null;
	private Field[] fields = new Field[11];

	public GameBoard(){
		this.chooseLanguage();
	}

	public void createGame(){
		this.createPlayers();
		this.initFields();
	}

	public void playGame(){

		input.close();
	}

	public void chooseLanguage(){
		System.out.println(" ");
	}

	/**
	 * Method to ask for each players name and generate a player object from it.
	 */
	public void createPlayers(){
		for(int i = 0; i < players.length; i++){
			System.out.printf("Indtast spillerens navn");
			String name = input.nextLine();
			players[i] = new Player(name);
		}
	}

	/**
	 * Method to create fields in gameboard.
	 */
	public void initFields(){
		fields[0] = new Field(250);
		fields[1] = new Field(-100);
		fields[2] = new Field(100);
		fields[3] = new Field(-20);
		fields[4] = new Field(180);
		fields[5] = new Field(0);
		fields[6] = new Field(-70);
		fields[7] = new Field(60);
		fields[8] = new Field(-80, true);
		fields[9] = new Field(-50);
		fields[10] = new Field(650);

	}

	
	/**
	 * Method that receives a player object and posts a message with instructions for the player.
	 * After the player has pressed "enter" the method will roll the dices, print the result of the roll,
	 * enforce the landOnField method for the given field, do a win condition check, if the player
	 * hasn't won, it will print a message with the players current score, if the player has won,
	 * the method will post a message saying that.
	 * @param Player player
	 */
	public void playTurn(Player player){
		boolean extraTurn;
		do {
			extraTurn = false;
			System.out.println(language.preMsg(player));
			input.nextLine();
			diceCup.rollDices();
			System.out.println(language.rollResult(diceCup));
			System.out.println(language.fieldMsg(diceCup));
			extraTurn = fields[diceCup.getSum()].landOnField(player);

			if (player.getBank().getBalance() >= 3000)
				winner = player;

		} while (extraTurn && winner == null);

		if (winner == null) 
			System.out.println(language.postMsg(player));
		else System.out.println(language.winnerMsg(winner));
	}

	public void gameMenu(){

	}

	public void postWinner(Player winner){
		System.out.println("");
	}
}
