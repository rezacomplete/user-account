package com.rezacomplete.controller;

import com.rezacomplete.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Reza on 12/14/2018.
 */

@RestController
public class AccountResource {

    @Autowired
    private AccountService accountService;

    @RequestMapping(path = "/user-accounts/{userId}", method = RequestMethod.GET)
    public List<AccountInfo> retrieveUserAccounts(@PathVariable String userId) {

        //todo some input validations here ...
        return accountService.retrieveUserAccounts(userId);
    }

    @RequestMapping(path = "/account-transactions/{accountNumber}", method = RequestMethod.GET)
    public List<Transaction> retrieveAccountTransactions(@PathVariable String accountNumber) {

        //todo some input validations here ...
        return accountService.retrieveAccountTransactions(accountNumber);
    }
}
