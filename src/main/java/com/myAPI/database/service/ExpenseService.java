package com.myAPI.database.service;


import com.myAPI.database.entity.Expenses;

import java.util.List;

public interface ExpenseService {

    //save expense
    Expenses saveExpenses(Expenses expenses);

    //get expense
    List<Expenses> fetchExpensesList();

}
