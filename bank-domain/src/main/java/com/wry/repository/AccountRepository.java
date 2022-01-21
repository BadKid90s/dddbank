package com.wry.repository;

import com.wry.domain.entity.Account;
import com.wry.types.AccountId;
import com.wry.types.AccountNumber;
import com.wry.types.UserId;

/**
 * 账户仓库
 *
 * @author wry
 */
public interface AccountRepository {
    Account find(AccountId id) throws Exception;

    Account find(AccountNumber accountNumber) throws Exception;

    Account find(UserId userId) throws Exception;

    Account save(Account account) throws Exception;
}
