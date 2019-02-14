public class Player {

    private Card card;
    private String name;

    public Player(String name){
        this.card = null;
        this.name = name;
    }

    public void receiveCard(Card card){
        this.card = card;
    }

    public Card getCard(){
        return this.card;
    }

    public String getName(){
        return this.name;
    }

}
