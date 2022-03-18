package workingWithAbstraction.cardsWithPower;

public class Card {
    private CardSuit cardSuit;
    private CardRank cardRank;

    public Card (CardSuit cardSuit, CardRank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public int power() {
        return this.cardRank.getPower() + this.cardSuit.getPower();
    }

    public CardSuit cardSuit() {
        return this.cardSuit;
    }

    public CardRank cardRank() {
        return this.cardRank;
    }
}
