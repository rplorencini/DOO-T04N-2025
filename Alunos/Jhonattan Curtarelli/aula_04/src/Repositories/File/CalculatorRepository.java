package src.Repositories.File;

import src.Entities.Budget;
import src.Mappers.BudgetMapper;
import src.Services.FileService;

import java.io.IOException;
import java.util.List;

public class CalculatorRepository implements src.Interfaces.CalculatorRepository
{
    private final FileService fileService;
    public CalculatorRepository() throws IOException {
        this.fileService = new FileService(null,null);
        this.fileService.CreateFile();
    }
    public boolean SaveBudget(Budget budget)
    {
        try{
            this.fileService.WriteFile(budget.toString());
            return true;

        } catch(IOException e){
            return false;
        }
    }
    public List<Budget> GetBudgets()
    {
        return BudgetMapper.TxtToEntity(
                this.fileService.ReadFile()
        );
    }
}
