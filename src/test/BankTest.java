package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spil.Bank;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class BankTest {
    private Bank bank;
    @Before
    public void setUp() throws Exception {
        bank = new Bank();
    }

    @After
    public void tearDown() throws Exception {
        bank = null;
    }

    @Test
    public void changeBalance() throws Exception {
        bank.changeBalance(-100);
        assertEquals(bank.getBalance(), 900);
        bank.changeBalance(100);
        assertEquals(bank.getBalance(), 1000);
        bank.changeBalance(-1001);
        assertEquals(bank.getBalance(), 0);
    }

    @Test
    public void getBalance() throws Exception {
        assertEquals(bank.getBalance(), 1000);
    }

}