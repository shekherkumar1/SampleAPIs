package com.myAPI.database.service;

import com.myAPI.database.entity.Expenses;
import com.myAPI.database.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImp implements ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public Expenses saveExpenses(Expenses expenses) {

        return expenseRepository.save(expenses);

    }

    @Override
    public List<Expenses> fetchExpensesList() {
        return expenseRepository.findAll();
    }
}
