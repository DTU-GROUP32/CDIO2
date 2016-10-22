package spil;

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
	 * @return
	 */
	public String askForPlayerName(int playerNumber){
		return selectedLanguage.askForPlayerName(playerNumber);
	}


	/** 
	 * Tells user that the game will start shortly. 
	 * @return
	 */
	public String readyToBegin(){
		return selectedLanguage.readyToBegin();
	}

	/**
	 * Premessage at the start of players turn, tells player help option. 
	 * @return
	 */
	public String preMsg(Player player){
		return selectedLanguage.preMsg(player);
	}

	/**
	 * Displays the result of the dice roll. 
	 * @return
	 */
	public String rollResult(DiceCup diceCup){
		return selectedLanguage.rollResult(diceCup);
	}

	/**
	 * switch case til at bestemme hvad der skal printes ud fra hvad man lander på.
	 * @return
	 */
	public String fieldMsg(DiceCup diceCup){
		return selectedLanguage.fieldMsg(diceCup);
	}
	/**
	 * Udskriver hvor mange point silleren har efter kast
	 * @return
	 */
	public String postMsg(Player player){
		return selectedLanguage.postMsg(player);
	}

	/**
	 * Udskriver hvem der har vundet med hvor mange point
	 * @return
	 */
	public String winnerMsg(Player player){
		return selectedLanguage.winnerMsg(player);
	}

	/**
	 * Udskriver hvilke muligheder der er i hjælpemenuen
	 * @return
	 */
	public String menu(){
		return selectedLanguage.menu();
	}
	/**
	 * Udskriver reglerne 
	 * @return
	 */
	public String printRules(){
		return selectedLanguage.printRules();
	}
	/**
	 * Udskriver pointstillingen
	 * @return
	 */
	public String printScore(Player[] players){
		return selectedLanguage.printScore(players);
	}

	/** 
	 * Udskriver hvordan man ændre terninger
	 * @return
	 */
	public String changeDices(){
		return selectedLanguage.changeDices();
	}
	/**
	 * Udskriver at terningerne succesfuldt er ændret		
	 * @return
	 */
	public String printDiceChangeSucces(){
		return selectedLanguage.printDiceChangeSucces();
	}
	/**
	 * Udskriver fejlbesked hvis terningerne ikke kunne ændres
	 * @return
	 */
	public String printDiceChangeNotExecuted(){
		return selectedLanguage.printDiceChangeNotExecuted();
	}
}
