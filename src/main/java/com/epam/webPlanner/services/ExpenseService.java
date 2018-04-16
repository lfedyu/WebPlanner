package com.epam.webPlanner.services;

import com.epam.webPlanner.beans.Expense;
import com.epam.webPlanner.repositories.ExpenseRepositoryJpa;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpenseService {
    private ExpenseRepositoryJpa expenseRepository;
    Expense expense;

    public List<Expense> getAllExpenses(){
        return  expenseRepository.findAll();
    }

    public Expense getExpenseById(Integer expenseId){
        expense = expenseRepository.findById(expenseId);
        return expense;
    }

    public void addExpense (Expense expense){
        expenseRepository.save(expense);
    }
    public void updateExpense (Integer id, Expense expense){
        expenseRepository.save(expense);
    }
    public void deleteExpense (Integer id){
        expenseRepository.delete(id);
    }

}
