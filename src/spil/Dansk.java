package spil;

public class Dansk implements Language{
	
	public Dansk(){}

	/** 
	 * Welcome message for user with commands available.
	 * @return
	 */
	@Override
	public String welcomeMsg(){
		return "Velkommen til spillet!";
	}

	/** 
	 * Asks for playername 
	 * @return
	 */
	@Override
	public String askForPlayerName(int playerNumber){
		return "Indtast spiller " + playerNumber + "'s navn";
	}

	/** 
	 * Tells user that the game will start shortly. 
	 * @return
	 */
	@Override
	public String readyToBegin(){
		return "Spillet vil nu begynde. Den spiller der fÃ¸rst nÃ¥r 3000 point har vundet spillet. + '\n' + Du kan skrive help nÃ¥r det bliver din tur, for en Ã¥bne en hjÃ¦lpemenu "; // Skal bruger trykke pÃ¥ noget for at starte?
	}
	
	/**
	 * Premessage at the start of players turn, tells player help option. 
	 * @return
	 */
	@Override
	public String preMsg(Player player){
		return "Det er " + player.getName() + "'s tur"; // getbank.getbalance
	}

	/**
	 * Displays the result of the dice roll. 
	 * @return
	 */
	@Override
	public String rollResult(DiceCup diceCup){
		return "Du slog en " + diceCup.getDices()[0].getFaceValue() + "'er og en " + diceCup.getDices()[1].getFaceValue() + "'er";
	}
	
	/**
	 * switch case til at bestemme hvad der skal printes ud fra hvad man lander pÃ¥.
	 * @return
	 */
	@Override
	public String fieldMsg(DiceCup diceCup){
		String fieldString;
		switch (diceCup.getSum()) {
		case 2:  fieldString = "Du har kravlet op i det hÃ¸je tÃ¥rn og finder 250!";
		break;
		case 3:  fieldString = "Du er faldet ned i krateret og det koster dig 100 at komme op.";
		break;
		case 4:  fieldString = "Du stÃ¥r overfor en stor port til et palads. Vagterne giver dig 100 i velkomst gave, da du passerer";
		break;
		case 5:  fieldString = "Du er faret vild i den kolde Ã¸rken, men finder en bod der sÃ¦lger varme handsker, det koster dig 20.";
		break;
		case 6:  fieldString = "Du er ankommet til den befÃ¦stede by! Du finder en mand i nÃ¸d og hjÃ¦lper ham. Han giver dig 180 som tak.";
		break;
		case 7:  fieldString = "Du ser et kloster i horisonten og gÃ¥r nÃ¦rmere for at udforske det. Du gÃ¥r derfra med det du kom med.";
		break;
		case 8:  fieldString = "Du er er gÃ¥et ind i en sort hule for at udforske den, du bliver taget til fange af de indfÃ¸dte og skal betale 70 for at gÃ¥ derfra.";
		break;
		case 9:  fieldString = "Du bestiger bjergene og finder nogle bjerghytter, de indfÃ¸dte synes om dig og giver dig 60";
		break;
		case 10:  fieldString = "Du ankommer til en stor mur og kan ikke passere. Vareulve stÃ¥r vagt i porten og vil ikke lade dig gÃ¥. Du giver dem 80, men som tak fÃ¥r du lov til at passere og slÃ¥ igen.";
		break;
		case 11: fieldString = "Du er rÃ¸get ned i et hul, en mand passerer og hjÃ¦lper dig, du giver ham 50 som tak.";
		break;
		case 12: fieldString = "Du ankommer til en guldmine og undersÃ¸ger den. Du finder guld og sÃ¦lger det for 650!";
		break;	
		default: fieldString = "Ukendt felt DESVÃ†RRE!";
		break;
		}
		return fieldString;
	}
	
	/**
	 * Udskriver hvor mange point silleren har efter kast
	 * @return
	 */
	@Override
	public String postMsg(Player player){
		return " Efter denne runde har " + player.getName() + " nu " + player.getBank() + " point";		
	}

	/**
	 * Udskriver hvem der har vundet med hvor mange point
	 * @return
	 */
	@Override
	public String winnerMsg(Player player){
		return player.getName() + " Har vundet spillet med " + player.getBank() + "point!";
	}
	/**
	 * Udskriver hvilke muligheder der er i hjÃ¦lpemenuen
	 * @return
	 */
	@Override
	public String menu(){
		return "Skriv 1 for regler" + '\n' + "Skriv 2 for pointstillingen" + '\n' + "Skriv 3 for at skifte terninger" + '\n' + "Skriv 4 for at afslutte spillet";
	}
	
	/**
	 * Udskriver reglerne 
	 * @return
	 */
	@Override
	public String printRules(){
		return "Regler blablabla"; // Mangler disse!
	}
	
	/**
	 * Udskriver pointstillingen
	 * @return
	 */
	@Override
	public String printScore(Player[] players){
		StringBuilder str = new StringBuilder();
		str.append("Stillingen er:");
		for (int i = 0; i < players.length; i++) 
			str.append("\n" + players[i].getName() + " har " + players[i].getBank().getBalance());
			return str.toString();
	}

	/** 
	 * Udskriver hvordan man Ã¦ndre terninger
	 * @return
	 */
	@Override
	public String changeDices(){
		return "Indtast hvor mange Ã¸jne de to terninger skal have"; // Summen mÃ¥tte kun gÃ¥ op til 12?
	}
	
	/**
	 * Udskriver at terningerne succesfuldt er Ã¦ndret		
	 * @return
	 */
	@Override
	public String printDiceChangeSucces(){
		return "Terningerne er nu Ã¦ndret!";
	}
	
	/**
	 * Udskriver fejlbesked hvis terningerne ikke kunne Ã¦ndres
	 * @return
	 */
	@Override
	public String printDiceChangeNotExecuted(){
		return "Terningerne kunne ikke Ã¦ndres";
	}
}
