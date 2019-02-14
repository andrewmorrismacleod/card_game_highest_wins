import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before

    public void before(){
        player = new Player("Steve");
        card = new Card(SuitType.HEARTS, RankType.EIGHT);
    }

    @Test
    public void playerHasCard(){
        player.receiveCard(card);
        assertEquals(SuitType.HEARTS, card.getSuit());
    }
}
