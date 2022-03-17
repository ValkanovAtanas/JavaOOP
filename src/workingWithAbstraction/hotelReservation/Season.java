package workingWithAbstraction.hotelReservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int priceMultiplier;

    Season(int multiplier) {
        this.priceMultiplier = multiplier;
    }

    public double multipliedPrice(double price) {
        return priceMultiplier * price;
    }


}
