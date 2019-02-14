import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;


    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void hasNoCards(){
        assertEquals(0, deck.getDeckSize());
    }

    @Test
    public void has52Cards(){
        deck.populate();
        assertEquals(52, deck.getDeckSize());
        System.out.println(deck.getCards().get(13).getRank());
        System.out.println(deck.getCards().get(13).getSuit());
    }

    @Test
    public void canShuffleCards(){
        deck.populate();
        deck.shuffle();
        System.out.println(deck.getCards().get(13).getRank());
        System.out.println(deck.getCards().get(13).getSuit());
    }
}
