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
		return "Spillet vil nu begynde. Den spiller der først når 3000 point har vundet spillet. + '\n' + Du kan skrive help når det bliver din tur, for en åbne en hjælpemenu "; // Skal bruger trykke på noget for at starte?
	}
	
	/**
	 * Premessage at the start of players turn, tells player help option. 
	 * @return
	 */
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
	 * switch case til at bestemme hvad der skal printes ud fra hvad man lander på.
	 * @return
	 */
	@Override
	public String fieldMsg(DiceCup diceCup){
		String fieldString;
		switch (diceCup.getSum()) {
		case 2:  fieldString = "Du har kravlet op i det høje tårn og finder 250!";
		break;
		case 3:  fieldString = "Du er faldet ned i krateret og det koster dig 100 at komme op.";
		break;
		case 4:  fieldString = "Du står overfor en stor port til et palads. Vagterne giver dig 100 i velkomst gave, da du passerer";
		break;
		case 5:  fieldString = "Du er faret vild i den kolde ørken, men finder en bod der sælger varme handsker, det koster dig 20.";
		break;
		case 6:  fieldString = "Du er ankommet til den befæstede by! Du finder en mand i nød og hjælper ham. Han giver dig 180 som tak.";
		break;
		case 7:  fieldString = "Du ser et kloster i horisonten og går nærmere for at udforske det. Du går derfra med det du kom med.";
		break;
		case 8:  fieldString = "Du er er gået ind i en sort hule for at udforske den, du bliver taget til fange af de indfødte og skal betale 70 for at gå derfra.";
		break;
		case 9:  fieldString = "Du bestiger bjergene og finder nogle bjerghytter, de indfødte synes om dig og giver dig 60";
		break;
		case 10:  fieldString = "Du ankommer til en stor mur og kan ikke passere. Vareulve står vagt i porten og vil ikke lade dig gå. Du giver dem 80, men som tak får du lov til at passere og slå igen.";
		break;
		case 11: fieldString = "Du er røget ned i et hul, en mand passerer og hjælper dig, du giver ham 50 som tak.";
		break;
		case 12: fieldString = "Du ankommer til en guldmine og undersøger den. Du finder guld og sælger det for 650!";
		break;	
		default: fieldString = "Ukendt felt DESVÆRRE!";
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
	 * Udskriver hvilke muligheder der er i hjælpemenuen
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
	 * Udskriver hvordan man ændre terninger
	 * @return
	 */
	@Override
	public String changeDices(){
		return "Indtast hvor mange øjne de to terninger skal have"; // Summen måtte kun gå op til 12?
	}
	
	/**
	 * Udskriver at terningerne succesfuldt er ændret		
	 * @return
	 */
	@Override
	public String printDiceChangeSucces(){
		return "Terningerne er nu ændret!";
	}
	
	/**
	 * Udskriver fejlbesked hvis terningerne ikke kunne ændres
	 * @return
	 */
	@Override
	public String printDiceChangeNotExecuted(){
		return "Terningerne kunne ikke ændres";
	}
}
