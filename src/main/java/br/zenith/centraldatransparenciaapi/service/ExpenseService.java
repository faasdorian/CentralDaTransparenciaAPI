package br.zenith.centraldatransparenciaapi.service;

import br.zenith.centraldatransparenciaapi.model.Expense;
import br.zenith.centraldatransparenciaapi.repository.ExpenseRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getExpensesByPage(Long cityId, int page) {
        Pageable pageable = PageRequest.of(page, 10);
        List<Expense> expenses = expenseRepository.getAllByCityId(cityId, pageable);
        return expenses;
    }

    public int getExpensesCount(Long cityId) {
        int total = expenseRepository.countAllByCityId(cityId);
        return total;
    }

    public List<Expense> getAllExpensesByCityId(Long cityId) {
        List<Expense> expenses = expenseRepository.getAllByCityId(cityId);
        return expenses;
    }

}
