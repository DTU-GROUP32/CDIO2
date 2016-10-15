package spil;

import java.util.Scanner;

public class GameBoard {
    public static DiceCup diceCup;
    private Player[] players = new Player[2];
    private Player Winner = null;
    private Field[] fields = new Field[11];

    public GameBoard(){
        this.createGame();
        this.playGame();
    }

    public void createGame(){
        this.chooseLanguage();
        this.createPlayers();
        this.initFields();
    }

    public void playGame(){

    }

    public void chooseLanguage(){
        System.out.println(" ");
    }

    /**
     * Method to ask for each players name and generate a player object from it.
     */
    public void createPlayers(){
        for(int i = 0; i < players.length; i++){
            System.out.printf("Indtast spillerens navn");
            Scanner input = new Scanner(System.in);
            String name = input.next();
            players[i] = new Player(input);
        }
    }

    /**
     * Method to create fields in gameboard.
     */
    public void initFields(){
        fields[0] = new Field(250);
        fields[1] = new Field(-100);
        fields[2] = new Field(100);
        fields[3] = new Field(-20);
        fields[4] = new Field(180);
        fields[5] = new Field(0);
        fields[6] = new Field(-70);
        fields[7] = new Field(60);
        fields[8] = new Field(-80, true);
        fields[9] = new Field(-50);
        fields[10] = new Field(650);

    }

    public void playTurn(){

    }

    public void gameMenu(){

    }

    public void postWinner(Player winner){
        System.out.println("");
    }
}
