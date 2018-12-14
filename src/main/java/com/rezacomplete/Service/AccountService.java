package com.rezacomplete.Service;

import com.rezacomplete.controller.AccountInfo;
import com.rezacomplete.controller.Transaction;

import java.util.List;

/**
 * Created by Reza on 12/14/2018.
 */
public interface AccountService {

    List<AccountInfo> retrieveUserAccounts(String userId);

    List<Transaction> retrieveAccountTransactions(String accountNumber);

}
