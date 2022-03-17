package workingWithAbstraction.hotelReservation;

import java.util.Locale;

public class InputDataReservationParser {

    public Reservation parseFromLine (String line) {
        String[] split = line.split("\\s+");
        double pricePerDay = Double.parseDouble(split[0]);
        int numberOfDays = Integer.parseInt(split[1]);
        Season season = Season.valueOf(split[2].toUpperCase(Locale.ROOT));
        Discount discount = Discount.valueOf(split[3].toUpperCase(Locale.ROOT));
        return new Reservation(pricePerDay, numberOfDays, season, discount);
    }

}
