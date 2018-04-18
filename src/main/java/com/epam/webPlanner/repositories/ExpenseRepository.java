package com.epam.webPlanner.repositories;

import com.epam.webPlanner.beans.Expense;
import com.epam.webPlanner.beans.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Integer> {
    public Expense findById(Integer id);
    List<Expense> findAll();
    public List<Expense> findByName(String name);
}
