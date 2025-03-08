package src.Entities.Discounts;

import src.Entities.Budget;

import java.math.BigDecimal;

public class DiscountForMoreThan5Items extends Discount  {

    public DiscountForMoreThan5Items(Discount next) {
        super(next);
    }
    public BigDecimal calculate(Budget budget) {
        if (budget.items > 5) {
            return budget.getValue().multiply(BigDecimal.valueOf(0.5));
        }
        return next.calculate(budget);
    }
}
