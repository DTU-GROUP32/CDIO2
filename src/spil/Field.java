package spil;

public class Field {
    private int effect;
    private boolean extraTurn;

    public Field(){
        this(0);
    }
    public Field(int effet){
        this(effet, false);
    }
    public Field(int effect, boolean extraTurn){
        this.effect = effect;
        this.extraTurn = extraTurn;
    }

    /**
     * Player object sent to method, when landing on field.
     * @param player
     * @return int used in for-loop to grant extra-turn
     */
    public int landOnField(Player player){
        Bank bankAccount = player.getBankAccount();
        if(this.effect < 0){
            bankAccount.withdraw(effect);
        }else{
            bankAccount.deposit(effect);
        }
        if(extraTurn){
            return 1;
        }else{
            return 0;
        }
    }
}
