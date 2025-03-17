package src.Repositories.Stack;

import Utils.Stack;
import src.Entities.Budget;

import java.util.List;

public class CalculatorRepository implements src.Interfaces.CalculatorRepository {
    private Stack stack;
    public CalculatorRepository(
            Stack stack
    ) {
        this.stack = stack;
    }
    @Override
    public boolean SaveBudget(Budget budget) {
        return false;
    }

    @Override
    public List<Budget> GetBudgets() {
        return stack.GetBudgets();
    }
}
