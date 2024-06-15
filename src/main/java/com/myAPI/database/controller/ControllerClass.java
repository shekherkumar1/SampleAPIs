package com.myAPI.database.controller;

import com.myAPI.database.entity.Expenses;
import com.myAPI.database.service.ExpenseService;
import com.myAPI.database.service.ExpenseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/webApp")
public class ControllerClass {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("/getExpense")
    public List<Expenses> getExpense(){
        return expenseService.fetchExpensesList();
    }

    @PostMapping("/addExpense")
    public void addExpense(@RequestBody Expenses expenses ){
        expenseService.saveExpenses(expenses);

    }

}
