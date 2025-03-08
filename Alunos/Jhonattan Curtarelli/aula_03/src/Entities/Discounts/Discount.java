package src.Entities.Discounts;

import src.Entities.Budget;

import java.math.BigDecimal;

abstract public class Discount {
    protected Discount next;
    public Discount(Discount? next)
    {
        this.next = next;
    }
    abstract public BigDecimal calculate(Budget value);

}
