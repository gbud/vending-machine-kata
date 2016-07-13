package tdd.vendingMachine;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Money {

    private BigDecimal value;

    public Money(BigDecimal value) {
        this.value = value.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(value);
    }
}
