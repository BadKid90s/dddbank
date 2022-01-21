package com.wry.persistence;

import com.wry.domain.entity.Account;

public interface AccountBuilder {

    Account toAccount(AccountDO accountDO) throws Exception;

    AccountDO fromAccount(Account account);
}
