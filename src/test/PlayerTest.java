package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.*;

public class PlayerTest {
    Player player;
    @Before
    public void setUp() throws Exception {
        player = new Player("Test");
    }

    @Test
    public final void getBalance() {
        Assert.assertEquals(1000, player.getBank().getBalance());
    }

    @Test
    public final void getId() throws Exception {
        Assert.assertEquals(player.getID(), 0);
        player = new Player("new player");
        Assert.assertEquals(player.getID(), 1);
    }
}
