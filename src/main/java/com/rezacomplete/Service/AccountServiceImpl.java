package com.rezacomplete.Service;

import com.rezacomplete.controller.AccountInfo;
import com.rezacomplete.controller.Transaction;
import com.rezacomplete.repository.AccountRepository;
import com.rezacomplete.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Reza on 12/14/2018.
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<AccountInfo> retrieveUserAccounts(String userId) {
        return accountRepository.findByUserId(userId);
    }

    @Override
    public List<Transaction> retrieveAccountTransactions(String accountNumber) {
        return transactionRepository.findByAccountNumber(accountNumber);
    }
}
