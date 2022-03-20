package restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    protected static final double COFFEE_MILLILITERS = 50;
    protected static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    protected double caffeine;

    public Coffee(String name) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
    }

    public double getCaffeine() {
        return caffeine;
    }
}
