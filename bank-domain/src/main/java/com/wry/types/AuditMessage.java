package com.wry.types;

import com.wry.domain.entity.Account;

/**
 * 审计消息
 *
 * @author wry
 */
public class AuditMessage {

    private Account sourceAccount;
    private Account targetAccount;
    private Money targetMoney;

    public AuditMessage(Account sourceAccount, Account targetAccount, Money targetMoney) {
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
        this.targetMoney = targetMoney;
    }
}
