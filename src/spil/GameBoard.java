package spil;

public class GameBoard {
	
	DiceCup diceCup = new DiceCup();
	

	public void playTurn(Player player) {
		
		while(winner == null)
		{
			do
			{
				boolean extraTurn = false;
				
				System.out.println(preMsg(player));
				
				
				
			} while (extraTurn == true);
		}
		
	}
	
}
