public class Player {

    private Card card;


    public Player(){
        this.card = null;
    }

    public void receiveCard(Card card){
        this.card = card;
    }

    public Card getCard(){
        return this.card;
    }

}
