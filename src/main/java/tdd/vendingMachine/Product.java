package tdd.vendingMachine;

import java.math.BigDecimal;

public enum Product {
    COLA_025L(new Money(new BigDecimal(10))),
    CHOCOLATE_BAR(new Money(new BigDecimal(10))),
    WATER_033L(new Money(new BigDecimal(10))),
    CHIPS(new Money(new BigDecimal(10))),
    NUTS(new Money(new BigDecimal(10)))
    ;

    private Money price;

    Product(Money price) {
        this.price = price;
    };

    public Money getPrice() {
        return price;
    }

}
