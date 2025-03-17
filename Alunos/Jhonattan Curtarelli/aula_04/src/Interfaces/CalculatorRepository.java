package src.Interfaces;

import src.Entities.Budget;

import java.util.List;

public interface CalculatorRepository {
    public boolean SaveBudget(Budget budget);
    public List<Budget> GetBudgets();
}
