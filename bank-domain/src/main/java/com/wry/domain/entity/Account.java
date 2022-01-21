package com.wry.domain.entity;

import com.wry.exception.DailyLimitExceededException;
import com.wry.exception.InsufficientFundsException;
import com.wry.exception.InvalidCurrencyException;
import com.wry.types.*;


/**
 * @author wry
 */
public class Account {
    /**
     * 账户Id
     */
    private AccountId id;
    /**
     * 账户号码
     */
    private AccountNumber accountNumber;
    /**
     * 用户Id
     */
    private UserId userId;
    /**
     * 余额
     */
    private Money available;
    /**
     * 每日限额
     */
    private Money dailyLimit;

    public Currency getCurrency() {
        return this.available.getCurrency();
    }

    /**
     * 转入
     * @param money 钱币
     */
    public void deposit(Money money) {
        if (!this.getCurrency().equals(money.getCurrency())) {
            throw new InvalidCurrencyException();
        }
        this.available = this.available.add(money);
    }

    /**
     * 转出
     * @param money 钱币
     */
    public void withdraw(Money money) throws Exception {
        if (this.available.compareTo(money) < 0) {
            throw new InsufficientFundsException();
        }
        if (this.dailyLimit.compareTo(money) < 0) {
            throw new DailyLimitExceededException();
        }
        this.available = this.available.subtract(money);
    }

    public AccountId getId() {
        return id;
    }

    public void setId(AccountId id) {
        this.id = id;
    }

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(AccountNumber accountNumber) {
        this.accountNumber = accountNumber;
    }

    public UserId getUserId() {
        return userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public Money getAvailable() {
        return available;
    }

    public void setAvailable(Money available) {
        this.available = available;
    }

    public Money getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(Money dailyLimit) {
        this.dailyLimit = dailyLimit;
    }
}
