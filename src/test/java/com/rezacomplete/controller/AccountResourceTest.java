package com.rezacomplete.controller;

import com.rezacomplete.UserAccountApplication;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by Reza on 12/14/2018.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserAccountApplication.class)
@WebAppConfiguration
public class AccountResourceTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void retrieveUserAccounts() throws Exception {
        mockMvc.perform(get("/user-accounts/123"))
                .andExpect(status().isOk())
                .andExpect(content().string("[{\"accountNumber\":\"999\",\"accountName\":\"Reza Ahmadi\",\"accountType\":\"Savings\",\"balanceDate\":\"08/11/2018\",\"currency\":\"AUD\",\"availableBalance\":12345.45}]"))
                .andExpect(content().contentType("application/json;charset=UTF-8"));
    }

    @Test
    public void retrieveUserAccountsWhenDoesNotExist() throws Exception {
        mockMvc.perform(get("/user-accounts/1234"))
                .andExpect(status().isOk())
                .andExpect(content().string("[]"))
                .andExpect(content().contentType("application/json;charset=UTF-8"));
    }

    @Test
    public void retrieveAccountTransactions() throws Exception {
        mockMvc.perform(get("/account-transactions/999"))
                .andExpect(status().isOk())
                .andExpect(content().string("[{\"valueDate\":\"Jan. 12, 2012\",\"debitAmount\":0,\"creditAmount\":20000,\"transactionType\":\"Credit\"}]"))
                .andExpect(content().contentType("application/json;charset=UTF-8"));
    }

    @Test
    public void retrieveAccountTransactionsWhenDoesNotExist() throws Exception {
        mockMvc.perform(get("/account-transactions/9998"))
                .andExpect(status().isOk())
                .andExpect(content().string("[]"))
                .andExpect(content().contentType("application/json;charset=UTF-8"));
    }
}
