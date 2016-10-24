package spil.language;

import spil.DiceCup;
import spil.Player;

public class LanguageHandler {

	private Language selectedLanguage;

	public LanguageHandler(String language) {
		setLanguage(language);
	}

	public void setLanguage(String language) {
		switch(language) {
		case "Dansk": selectedLanguage = new Dansk(); break;
		case "English": selectedLanguage = new English(); break;
		default: selectedLanguage = new English();
		}
	}

	public String welcomeMsg(){
		return selectedLanguage.welcomeMsg();
	}

	/** 
	 * Asks for playername 
	 * @return String
	 */
	public String askForPlayerName(int playerNumber){
		return selectedLanguage.askForPlayerName(playerNumber);
	}


	/** 
	 * Tells user that the game will start shortly. 
	 * @return String
	 */
	public String readyToBegin(){
		return selectedLanguage.readyToBegin();
	}

	/**
	 * Premessage at the start of players turn, tells player help option. 
	 * @return String
	 */
	public String preMsg(Player player){
		return selectedLanguage.preMsg(player);
	}

	/**
	 * Displays the result of the dice roll. 
	 * @return String
	 */
	public String rollResult(DiceCup diceCup){
		return selectedLanguage.rollResult(diceCup);
	}

	/**
	 * switch case til at bestemme hvad der skal printes ud fra hvad man lander på.
	 * @return String
	 */
	public String fieldMsg(DiceCup diceCup){
		return selectedLanguage.fieldMsg(diceCup);
	}
	/**
	 * Udskriver hvor mange point silleren har efter kast
	 * @return String
	 */
	public String postMsg(Player player){
		return selectedLanguage.postMsg(player);
	}

	/**
	 * Udskriver hvem der har vundet med hvor mange point
	 * @return String
	 */
	public String winnerMsg(Player player){
		return selectedLanguage.winnerMsg(player);
	}

	/**
	 * Udskriver hvilke muligheder der er i hjælpemenuen
	 * @return String
	 */
	public String menu(){
		return selectedLanguage.menu();
	}
	/**
	 * Udskriver reglerne 
	 * @return String
	 */
	public String printRules(){
		return selectedLanguage.printRules();
	}
	/**
	 * Udskriver pointstillingen
	 * @return String
	 */
	public String printScore(Player[] players){
		return selectedLanguage.printScore(players);
	}

	/** 
	 * Udskriver hvordan man ændre terninger
	 * @return String
	 */
	public String changeDices(){
		return selectedLanguage.changeDices();
	}
	/**
	 * Udskriver at terningerne succesfuldt er ændret		
	 * @return String
	 */
	public String printDiceChangeSucces(){
		return selectedLanguage.printDiceChangeSucces();
	}
	/**
	 * Udskriver fejlbesked hvis terningerne ikke kunne ændres
	 * @return String
	 */
	public String printDiceChangeNotExecuted(){
		return selectedLanguage.printDiceChangeNotExecuted();
	}
	/**
	 * Udskriver spilmenu
	 * @return String
	 */
	public String printGameMenu(){
		return selectedLanguage.printGameMenu();
	}
}
