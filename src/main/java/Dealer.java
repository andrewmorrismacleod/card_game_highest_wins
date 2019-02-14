import java.util.ArrayList;

public class Dealer {

    private ArrayList<Player> players;
    private Deck deck;

    public Dealer(ArrayList<Player> players, Deck deck){
        this.players = players;
        this.deck = deck;
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }

    public void populateAndShuffleDeck(){
        this.deck.populate();
        this.deck.shuffle();
    }

    public Deck getDeck(){
        return this.deck;
    }

    public void dealCards(){
        for (Player player : this.players){
            player.receiveCard(this.deck.dealCard());
        }

    }


}
