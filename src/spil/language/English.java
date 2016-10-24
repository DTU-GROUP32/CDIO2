package spil.language;

import spil.DiceCup;
import spil.Player;

public class English implements Language{

	public English(){}

	/**
	 * Welcome message for user with commands available.
	 * @return
	 */
	@Override
	public String welcomeMsg(){
		return "Welcome to the game!";
	}

	/**
	 * Asks for playername
	 * @return
	 */
	@Override
	public String askForPlayerName(int playerNumber){
		return "Type player " + playerNumber + "'s name";
	}

	/**
	 * Tells user that the game will start shortly.
	 * @return
	 */
	@Override
	public String readyToBegin(){
		return "The game is starting. The player who reaches 3000 points is the winner. + '\n' + You can type 'help' when it's your turn, to open a help menu. "; // Skal bruger trykke på noget for at starte?
	}

	/**
	 * Premessage at the start of players turn, tells player help option.
	 * @return
	 */
	public String preMsg(Player player){
		return "It's " + player.getName() + "s turn"; // getbank.getbalance
	}

	/**
	 * Displays the result of the dice roll.
	 * @return
	 */
	@Override
	public String rollResult(DiceCup diceCup){
		return "You rolled a " + diceCup.getDices()[0].getFaceValue() + " and a " + diceCup.getDices()[1].getFaceValue();
	}

	/**
	 * switch case til at bestemme hvad der skal printes ud fra hvad man lander på.
	 * @return
	 */
	@Override
	public String fieldMsg(DiceCup diceCup){
		String fieldString;
		switch (diceCup.getSum()) {
			case 2:  fieldString = "You've climbed to the top of the tower and found 250!";
				break;
			case 3:  fieldString = "You've fallen into the crater, it'll cost you 100 to get back up.";
				break;
			case 4:  fieldString = "You've arrived at the palace gates, the guards greets you with 100 when you pass.";
				break;
			case 5:  fieldString = "You've gotten lost in the cold dessert, you find a guy who sells you warm clothes costs you 20.";
				break;
			case 6:  fieldString = "You've arrived at the walled city. A man needs your help, after you've helped him he gave you 180!";
				break;
			case 7:  fieldString = "You've seen a monastery, you didn't find anything there.";
				break;
			case 8:  fieldString = "You've walked into a black cave and taken captive, it costs you 70 to walk free.";
				break;
			case 9:  fieldString = "You've found some huts in the mountains, the people that live there likes you and give you 60!";
				break;
			case 10: fieldString = "You've arrived at the werewall. The werewolf doesn't want to let you go, you give them 80, as thanks they let you walk free and roll the dice again.";
				break;
			case 11: fieldString = "You've fallen into the pit, a friendly man helps you back up. You give him 50 as thanks.";
				break;
			case 12: fieldString = "You've arrived at the goldmine. You find gold in there, you sell it for 650!";
				break;
			default: fieldString = "Unknown field.";
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
		return "After this round " + player.getName() + " has got " + player.getBank().getBalance() + " point\n";
	}

	/**
	 * Udskriver hvem der har vundet med hvor mange point
	 * @return
	 */
	@Override
	public String winnerMsg(Player player){
		return player.getName() + " has won the game with " + player.getBank().getBalance() + "point!";
	}
	/**
	 * Udskriver hvilke muligheder der er i hjælpemenuen
	 * @return
	 */
	@Override
	public String menu(){
		return "Type 1 for rules" + '\n' + "Type 2 for scoreboard" + '\n' + "Type 3 to swap dices" + '\n' + "Type 4 to end the game";
	}

	/**
	 * Udskriver reglerne
	 * @return
	 */
	@Override
	public String printRules(){
		return "Rules.........???"; // Mangler disse!
	}

	/**
	 * Udskriver pointstillingen
	 * @return
	 */
	@Override
	public String printScore(Player[] players){
		StringBuilder str = new StringBuilder();
		str.append("The score is:");
		for (int i = 0; i < players.length; i++)
			str.append("\n" + players[i].getName() + " has " + players[i].getBank().getBalance());
		return str.toString();
	}

	/**
	 * Udskriver hvordan man ændre terninger
	 * @return
	 */
	@Override
	public String changeDices(){
		return "Type how many sides the two dices should have"; // Summen måtte kun gå op til 12?
	}

	/**
	 * Udskriver at terningerne succesfuldt er ændret
	 * @return
	 */
	@Override
	public String printDiceChangeSucces(){
		return "The dices have been changed.";
	}

	/**
	 * Udskriver fejlbesked hvis terningerne ikke kunne ændres
	 * @return
	 */
	@Override
	public String printDiceChangeNotExecuted(){
		return "The dices couldn't be changed.";
	}
	/**
	 * Udskriver spilmenu
	 * @return
	 */
	@Override
	public String printGameMenu(){
		return "Type 1 to resume game\n" +
				"Type 2 to change language\n" +
				"Type 3 to end the game\n"+
				"Type 4";
	}
}
