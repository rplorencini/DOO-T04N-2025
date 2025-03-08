package src.Entities;

import java.math.BigDecimal;

public class Budget
{
    private BigDecimal value;
    public int items;

    public Budget(BigDecimal value,int items)
    {
        this.value = value;
        this.items = items;
    }

    public BigDecimal getValue()
    {
        return value;
    }

}
