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

    @GetMapping("/{cityId}")
    public ResponseEntity<List<Expense>> getCityExpenses(@PathVariable String cityId) {
        List<Expense> expenses = expenseService.getAllExpensesByCityId(Long.parseLong(cityId));

        if (expenses.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(expenses, HttpStatus.NOT_FOUND);
    }
}
