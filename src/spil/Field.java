package spil;

import spil.Player;

public class Field {

	private int effect;
	private boolean extraTurn;
	
	public Field(int effect, boolean extraTurn) {
		this.effect = effect;
		this.extraTurn = extraTurn;
	}
	
	public Field(int effect) {
		this.effect = effect;
		this.extraTurn = false;
	}


	public boolean LandOnField(Player player) {
		player.changeBalance(this.effect);
		return extraTurn;
	}
}
