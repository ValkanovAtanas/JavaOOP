package workingWithAbstraction.cardsWithPower;

public class InputParser {
    private String firstLine;
    private String secondLine;

    public InputParser(String firstLine, String secondLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
    }

    public Card parse () {
        CardRank cardRank = CardRank.valueOf(firstLine);
        CardSuit cardSuit = CardSuit.valueOf(secondLine);
        return new Card(cardSuit, cardRank);
    }
}
