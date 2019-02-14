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

        player1 = new Player("Steve");
        player2 = new Player("Barry");
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
        System.out.println(dealer.getDeck().getCards().get(0).getRank());
        System.out.println(dealer.getDeck().getCards().get(0).getSuit());
    }

    @Test
    public void dealerCanDeal(){
        dealer.populateAndShuffleDeck();
        dealer.dealCards();
        assertEquals(50, dealer.getDeck().getCards().size());
    }

    @Test
    public void canDetermineWinner(){
        dealer.populateAndShuffleDeck();
        dealer.dealCards();
        System.out.println(player1.getCard().getRank());
        System.out.println(player1.getCard().getSuit());
        System.out.println(player2.getCard().getRank());
        System.out.println(player2.getCard().getSuit());
        String winner = dealer.checkResults();
        System.out.println(winner);
    }



}
