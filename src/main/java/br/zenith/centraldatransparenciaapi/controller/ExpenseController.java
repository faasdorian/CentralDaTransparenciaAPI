package br.zenith.centraldatransparenciaapi.controller;

import br.zenith.centraldatransparenciaapi.model.Expense;
import br.zenith.centraldatransparenciaapi.service.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/{cityId}/{page}")
    public ResponseEntity<List<Expense>> getCityExpenses(@PathVariable String cityId, @PathVariable String page) {
        List<Expense> expenses = expenseService.getExpensesByPage(Long.parseLong(cityId), Integer.parseInt(page));

        if (expenses.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }

    @GetMapping("/{cityId}/count")
    public ResponseEntity<Integer> getCityExpensesCount(@PathVariable String cityId) {
        int expensesCount = expenseService.getExpensesCount(Long.parseLong(cityId));

        return new ResponseEntity<>(expensesCount, HttpStatus.OK);
    }
}
