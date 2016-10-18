package cdio;

public class Dansk {
	public Dansk (){}

	/** 
	 * Welcome message for user with commands available.
	 * @return
	 */

	public String welcomeMsg(){
		return "Velkommen til spillet!" + '\n' + "Skriv help for at åbne en hjælpemenu";
	}

	/** 
	 * Asks for playername 
	 * @return
	 */
	public String askForPlayerName(playernumber){
		return "Indtast spiller " + playernumber + "'s navn";
	}


	/** 
	 * Tells user that the game will start shortly. 
	 * @return
	 */
	public String readyToBegin(){
		return "Spillet vil nu begynde"; // Skal bruger trykke på noget for at starte?
	}
	/**
	 * Premessage at the start of players turn, tells player help option. 
	 * @return
	 */
	public String preMsg(player){
		return premsg = "Det er " + player.getname + "'s tur" + '\n' + "Hvis du har brug for hjælp skriv help"; // getbank.getbalance
	}

	/**
	 * Displays the result of the dice roll. 
	 * @return
	 */

	public String rollResult(dicecup){
		return resultofroll = "Du slog en " + dicecup.getDices()[0].getFaceValue() + "'er og en " + dicecup.getDices()[1].getFaceValue() + "'er/n";
	}
	/**
	 * switch case til at bestemme hvad der skal printes ud fra hvad man lander på.
	 * @return
	 */
	public String fieldMsg(dicecup){
		int field = dicecup.getDices(); // Hvilke input?
		String fieldString;
		switch (field) {
		case 2:  fieldString = "Du er landet på 2...";
		break;
		case 3:  fieldString = "Du er landet på 3...";
		break;
		case 4:  fieldString = "Du er landet på 4...";
		break;
		case 5:  fieldString = "Du er landet på 5...";
		break;
		case 6:  fieldString = "Du er landet på 6...";
		break;
		case 7:  fieldString = "Du er landet på 7...";
		break;
		case 8:  fieldString = "Du er landet på 8...";
		break;
		case 9:  fieldString = "Du er landet på 9...";
		break;
		case 10:  fieldString = "Du er landet på 10...";
		break;
		case 11: fieldString = "Du er landet på 11...";
		break;
		case 12: fieldString = "Du er landet på 12...";
		break;		
		}
		System.out.println(fieldString);
	}
	/**
	 * Udskriver hvor mange point silleren har efter kast
	 * @return
	 */
	public String postMsg(player){
		return player.getname() + "Har nu " + player.getbank() + "point";		
	}

	/**
	 * Udskriver hvem der har vundet med hvor mange point
	 * @return
	 */
	public String winnerMsg(player){
		return player.getname() + " Har vundet spillet med " + player.getbank() + "point!";
	}
	/**
	 * Udskriver hvilke muligheder der er i hjælpemenuen
	 * @return
	 */
	public String menu(){
		return "Skriv 1 for regler" + '\n' + "Skriv 2 for pointstillingen" + '\n' + "Skriv 3 for at skifte terninger" + '\n' + "Skriv 4 for at afslutte spillet";
	}
	/**
	 * Udskriver reglerne 
	 * @return
	 */
	public String printRules(){
		return "Regler blablabla";
	}
	/**
	 * Udskriver pointstillingen
	 * @return
	 */
	public String printScore(player){
		for (int i = 0; i < players.length; i++) 
			System.out.println(player[i].getbank);
	}

	/** 
	 * Udskriver hvordan man ændre terninger
	 * @return
	 */
	public String changeDices(){
		return "Indtast hvor mange øjne de to terninger skal have"; // Summen måtte kun gå op til 12?
	}
	/**
	 * Udskriver at terningerne succesfuldt er ændret		
	 * @return
	 */
	public String printDiceChangeSucces(){
		return "Terningerne er nu ændret!";
	}
	/**
	 * Udskriver fejlbesked hvis terningerne ikke kunne ændres
	 * @return
	 */
	public String printDiceChangeNotExecuted(){
		return "Terningerne kunne ikke ændres, prøv igen!";
	}
}
