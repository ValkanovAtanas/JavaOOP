package workingWithAbstraction.hotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        InputDataReservationParser parser = new InputDataReservationParser();
        Reservation reservation = parser.parseFromLine(line);

        PriceCalculator priceCalculator = new PriceCalculator(reservation);
        System.out.println(priceCalculator.calculate());

    }
}
