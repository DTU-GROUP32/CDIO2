package test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.*;

public class PlayerTest {
    int id,nextId;
    Player player;
    Bank bankAccount;
    @Before
    public void setUp() throws Exception {
        bankAccount = new Bank(1000);
        player = new Player();
        player.setPlayerName("Player");

    }


    @Test
    public final void getBalance() {
//		bankAccount.changeBalance(1000);
//		assertEquals(bankAccount.getBalance(), 1000);
        int currentBalance = 1000;
        int activePlayer = player.getBankAccount().getBalance();
        assertEquals(currentBalance, activePlayer);
    }

    @Before
    public void  setId() throws Exception {
        id = nextId++ ;
    }

    @Test
    public final void getId() throws Exception {
        assertEquals(player.getNextID(), 1);
    }


}
