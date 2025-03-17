package Utils;

import src.Entities.Budget;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Budget> budgets;

    public Stack() {
        this.budgets = new ArrayList<>();
    }

    public boolean addBudget(Budget budget) {
        return this.budgets.add(budget);
    }
    public List<Budget> GetBudgets() {
        return this.budgets;
    }
}
