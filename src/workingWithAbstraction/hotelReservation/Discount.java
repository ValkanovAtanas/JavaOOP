package workingWithAbstraction.hotelReservation;

public enum Discount {
    VIP(0.2),
    SECONDVISIT(0.1),
    NONE(0);

    private double discountPercentage;

    Discount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double discountedPrice(double price) {
        return this.discountPercentage * price + price;
    }

}
