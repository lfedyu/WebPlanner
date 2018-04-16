package com.epam.webPlanner.controllers;


import com.epam.webPlanner.beans.Expense;
import com.epam.webPlanner.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/")
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }
}
