package workingWithAbstraction.hotelReservation;

public class Reservation {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private Discount discount;

    public Reservation (double pricePerDay, int numberOfDays, Season season, Discount discount) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discount = discount;
    }

    public double calculatePrice() {
        double basePrice = pricePerDay * numberOfDays;
        basePrice = season.multipliedPrice(basePrice);
        basePrice = discount.discountedPrice(basePrice);
        return basePrice;
    }

    public static void main(String[] args) {
        Reservation reservation = new Reservation(10, 2, Season.SPRING, Discount.NONE);
        System.out.println(reservation.calculatePrice());
    }
}
