package br.zenith.centraldatransparenciaapi.service;

import br.zenith.centraldatransparenciaapi.model.Expense;
import br.zenith.centraldatransparenciaapi.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getAllExpensesByCityId(Long cityId) {
        List<Expense> expenses = expenseRepository.getAllByCityCityId(cityId);
        return expenses;
    }

}
