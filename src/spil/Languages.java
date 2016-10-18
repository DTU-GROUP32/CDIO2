package cdio;
import cdio.*;
public class dansksprog {

	/** 
	 * Welcome message for user with commands available.
	 * @return
	 */

	public String WelcomeMsg(){
		String welcomeMsg = "Velkommen til spillet!" + '\n' + "Skriv help for at åbne en hjælpemenu";
		return welcomeMsg;

	}

	/** 
	 * Asks for playername 
	 * @return
	 */
	public String askForPlayerName(){
		String askforplayername = "Indtast spiller " + playernumber + "'s navn";
		return askforplayername;	
	}

	/** 
	 * Tells user that the game will start shortly. 
	 * @return
	 */
	public String readyToBegin(){
		String gameReady = "Spillet vil nu begynde"; // Skal bruger trykke på noget for at starte?
		return gameReady;
	}
	/**
	 * Premessage at the start of players turn, tells player help option. 
	 * @return
	 */
	public String preMsg(){
		String premsg = "Det er " + players[i].getName() + "'s tur" + '\n' + "Hvis du har brug for hjælp skriv help";
		return premsg;
	}

	/**
	 * Displays the result of the dice roll. 
	 * @return
	 */
	public String rollResult(){
		String resultofroll = player.getName() + " slog en " + player.dicecup.getDices()[0].getFaceValue() + "'er og en " + player.dicecup.getDices()[1].getFaceValue() + "'er/n";
		return resultofroll;
	}

}



