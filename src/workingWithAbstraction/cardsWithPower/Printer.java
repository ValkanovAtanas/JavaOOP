package workingWithAbstraction.cardsWithPower;

public class Printer {
    private Card card;

    public void print(Card card) {
        System.out.printf("Card name: %s of %s; Card power: %d", card.cardRank().name(), card.cardSuit().name(), card.power());
    }
}
