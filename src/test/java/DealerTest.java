import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Player player1;
    Player player2;
    ArrayList<Player> players;
    Deck deck;

    @Before
    public void before(){

        player1 = new Player();
        player2 = new Player();
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        deck = new Deck();

        dealer = new Dealer(players, deck);
    }

    @Test
    public void hasPlayers(){
        assertEquals(2, dealer.getPlayers().size());
    }

    @Test
    public void hasFullDeck(){
        dealer.populateAndShuffleDeck();
        assertEquals(52, dealer.getDeck().getCards().size());
    }


}
