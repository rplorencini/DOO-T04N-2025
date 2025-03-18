package src.Interfaces;

import src.Entities.Budget;

import java.util.List;

public interface ICalculatorRepository {
    public boolean SaveBudget(Budget budget);
    public List<Budget> GetBudgets();
}
