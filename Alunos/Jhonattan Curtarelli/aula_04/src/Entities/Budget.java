package src.Entities;

import java.math.BigDecimal;
import java.util.Date;

public class Budget
{
    public BigDecimal value;
    public int items;
    public BigDecimal total;
    public Date budgetDate;

    public Budget(BigDecimal value,int items)
    {
        this.items = items;
        this.value = value;
        this.total = value.multiply(new BigDecimal(items));
        this.budgetDate = new Date();
    }

    public BigDecimal getValue()
    {
        return value;
    }
    public void setTotal(BigDecimal total)
    {
        this.total = total;
    }
    @Override
    public String toString() {
        return  value +";"+ items+";"+total;
    }
}
