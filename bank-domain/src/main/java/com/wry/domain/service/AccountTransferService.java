package com.wry.domain.service;

import com.wry.domain.entity.Account;
import com.wry.types.ExchangeRate;
import com.wry.types.Money;

/**
 * 账户转账服务
 *
 * @author wry
 */
public interface AccountTransferService {
    /**
     * 转账
     *
     * @param sourceAccount 原账户
     * @param targetAccount 转载账户
     * @param targetMoney   转载金额
     * @param exchangeRate  汇率
     * @throws Exception
     */
    void transfer(Account sourceAccount, Account targetAccount, Money targetMoney, ExchangeRate exchangeRate) throws Exception;
}
