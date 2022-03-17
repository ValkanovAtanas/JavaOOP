package workingWithAbstraction.hotelReservation;

public class PriceCalculator {

    private Reservation reservation;

    PriceCalculator (Reservation reservation) {
        this.reservation = reservation;
    }

    public double calculate() {
        return this.reservation.calculatePrice();
    }
}
