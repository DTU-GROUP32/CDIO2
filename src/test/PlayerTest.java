package test;

import org.junit.Before;
import org.junit.Test;
import spil.Player;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    @Before
    public void setUp() throws Exception {
        player = new Player("Test");
    }

    @Test
    public final void getBalance() {
        assertEquals(1000, player.getBank().getBalance());
    }

    @Test
    public final void getId() throws Exception {
        assertEquals(player.getID(), 0);
        player = new Player("new player");
        assertEquals(player.getID(), 1);
    }
}
