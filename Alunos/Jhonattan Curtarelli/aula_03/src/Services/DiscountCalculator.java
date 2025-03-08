package src.Services;

import src.Entities.Budget;
import src.Entities.Discounts.Discount;
import src.Entities.Discounts.DiscountForMoreThan5Items;
import src.Entities.Discounts.WithoutDiscount;

import java.math.BigDecimal;

public class DiscountCalculator
{
    public BigDecimal calculate(Budget budget)
    {
        BigDecimal discount = new BigDecimal(0);
        Discount discountChain = new DiscountForMoreThan5Items(new WithoutDiscount());
        discount = discountChain.calculate(budget);
        return budget.getValue().subtract(discount);
    }
}
