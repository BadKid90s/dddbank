package com.wry.domain.service.impl;

import com.wry.domain.entity.Account;
import com.wry.domain.service.AccountTransferService;
import com.wry.types.ExchangeRate;
import com.wry.types.Money;
import org.springframework.stereotype.Service;

/**
 * @author wry
 */
@Service
public class AccountTransferServiceImpl implements AccountTransferService {

    @Override
    public void transfer(Account sourceAccount, Account targetAccount, Money targetMoney, ExchangeRate exchangeRate) throws Exception {
        //根据汇率计算转账金额
        Money sourceMoney = exchangeRate.exchageTo(targetMoney);
        //原账户扣除
        sourceAccount.deposit(sourceMoney);
        //目标账户新增
        targetAccount.withdraw(targetMoney);
    }
}
