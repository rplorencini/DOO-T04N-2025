package src.Repositories.Stack;

import Utils.Stack;
import src.Entities.Budget;

import java.util.List;

public class CalculatorRepository implements src.Interfaces.ICalculatorRepository {
    private final Stack stack;
    public CalculatorRepository(
    ) {
        this.stack = new Stack();
    }
    @Override
    public boolean SaveBudget(Budget budget) {
        this.stack.addBudget(budget);
        return true;
    }

    @Override
    public List<Budget> GetBudgets() {
        return stack.GetBudgets();
    }
}
