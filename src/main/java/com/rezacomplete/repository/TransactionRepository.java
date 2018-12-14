package com.rezacomplete.repository;

import com.rezacomplete.controller.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reza on 12/14/2018.
 */
@Service
public class TransactionRepository {

    public List<Transaction> findByAccountNumber(String accountNumber) {
        List<Transaction> transactions = new ArrayList<>();

        //todo should get these values from a database or at least from an in-memory structure like a map.
        if ("999".equalsIgnoreCase(accountNumber)) {
            Transaction transaction = new Transaction();
            transaction.setCreditAmount(BigDecimal.valueOf(20000));
            transaction.setDebitAmount(BigDecimal.ZERO);
            transaction.setTransactionType("Credit");
            transaction.setValueDate("Jan. 12, 2012");

            transactions.add(transaction);
        }

        return transactions;
    }
}
