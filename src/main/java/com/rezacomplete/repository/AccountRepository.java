package com.rezacomplete.repository;

import com.rezacomplete.controller.AccountInfo;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reza on 12/14/2018.
 */
@Component
public class AccountRepository {

    public List<AccountInfo> findByUserId(String userId) {
        List<AccountInfo> accounts = new ArrayList<>();

        //todo should get these values from a database or at least from an in-memory structure like a map.
        if ("123".equalsIgnoreCase(userId)) {
            AccountInfo accountInfo = new AccountInfo();
            accountInfo.setAccountName("Reza Ahmadi");
            accountInfo.setAccountNumber("999");
            accountInfo.setAccountType("Savings");
            accountInfo.setAvailableBalance(BigDecimal.valueOf(12345.45));
            accountInfo.setBalanceDate("08/11/2018");
            accountInfo.setCurrency("AUD");

            accounts.add(accountInfo);
        }

        return accounts;
    }
}
