package spil.language;

import spil.DiceCup;
import spil.Player;

public interface Language {

	public String welcomeMsg();

	/** 
	 * Asks for playername 
	 * @return
	 */
	public String askForPlayerName(int playerNumber);


	/** 
	 * Tells user that the game will start shortly. 
	 * @return
	 */
	public String readyToBegin();

	/**
	 * Premessage at the start of players turn, tells player help option. 
	 * @return
	 */
	public String preMsg(Player player);

	/**
	 * Displays the result of the dice roll. 
	 * @return
	 */
	public String rollResult(DiceCup diceCup);

	/**
	 * switch case til at bestemme hvad der skal printes ud fra hvad man lander på.
	 * @return
	 */
	public String fieldMsg(DiceCup diceCup);
	/**
	 * Udskriver hvor mange point silleren har efter kast
	 * @return
	 */
	public String postMsg(Player player);

	/**
	 * Udskriver hvem der har vundet med hvor mange point
	 * @return
	 */
	public String winnerMsg(Player player);

	/**
	 * Udskriver hvilke muligheder der er i hjælpemenuen
	 * @return
	 */
	public String menu();
	/**
	 * Udskriver reglerne 
	 * @return
	 */
	public String printRules();
	/**
	 * Udskriver pointstillingen
	 * @return
	 */
	public String printScore(Player[] players);

	/** 
	 * Udskriver hvordan man ændre terninger
	 * @return
	 */
	public String changeDices();
	/**
	 * Udskriver at terningerne succesfuldt er ændret		
	 * @return
	 */
	public String printDiceChangeSucces();
	/**
	 * Udskriver fejlbesked hvis terningerne ikke kunne ændres
	 * @return
	 */
	public String printDiceChangeNotExecuted();
}