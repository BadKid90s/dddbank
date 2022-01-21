package com.wry.persistence.impl;

import com.wry.domain.entity.Account;
import com.wry.persistence.AccountBuilder;
import com.wry.persistence.AccountDO;
import com.wry.types.*;
import org.springframework.stereotype.Component;

@Component
public class AccountBuilderImpl implements AccountBuilder {
    @Override
    public Account toAccount(AccountDO accountDO) throws Exception {
        Account account = new Account();
        account.setId(new AccountId(accountDO.getId()));
        account.setAccountNumber(new AccountNumber(accountDO.getAccountNumber()));
        account.setUserId(new UserId(accountDO.getUserId()));
        Currency currency = new Currency(accountDO.getCurrency());
        account.setAvailable(new Money(accountDO.getAvailableAmout(), currency));
        account.setDailyLimit(new Money(accountDO.getDailyLimitAmout(), currency));
        return account;
    }

    @Override
    public AccountDO fromAccount(Account account) {
        AccountDO accountDO = new AccountDO();
        if (account.getId() != null) {
            accountDO.setId(account.getId().getValue());
        }
        accountDO.setUserId(account.getUserId().getValue());
        accountDO.setAccountNumber(account.getAccountNumber().getValue());
        accountDO.setAvailableAmout(account.getAvailable().getAmout());
        accountDO.setDailyLimitAmout(account.getDailyLimit().getAmout());
        accountDO.setCurrency(account.getCurrency().getValue());
        return accountDO;
    }
}
