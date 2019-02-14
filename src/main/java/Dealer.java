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

    public String checkResults(){
        int bestValue = 0;
        ArrayList<Player> winners = new ArrayList<>();

        for (Player player : this.players){
            if(player.getCard().getRank().getValueFromEnum() > bestValue){
                bestValue = player.getCard().getRank().getValueFromEnum();
            }
        }

        for (Player player : this.players){

            if(player.getCard().getRank().getValueFromEnum() == bestValue) {
                winners.add(player);
            }
        }

        if (winners.size() > 1){
            return "Game is a draw";
        } else {
            return String.format("The winner is %s", winners.get(0).getName());
        }


    }


}
