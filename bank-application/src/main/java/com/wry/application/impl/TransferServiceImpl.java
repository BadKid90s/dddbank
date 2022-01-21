package com.wry.application.impl;

import com.wry.application.TransferService;
import com.wry.common.Result;
import com.wry.domain.entity.Account;
import com.wry.domain.service.AccountTransferService;
import com.wry.external.ExchangeRateService;
import com.wry.messaging.AuditMessageProducer;
import com.wry.repository.AccountRepository;
import com.wry.types.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author wry
 */
@Service
public class TransferServiceImpl implements TransferService {

    private AccountRepository accountRepository;
    private AuditMessageProducer auditMessageProducer;
    private ExchangeRateService exchangeRateService;
    private AccountTransferService accountTransferService;

    public TransferServiceImpl(AccountRepository accountRepository, AuditMessageProducer auditMessageProducer, ExchangeRateService exchangeRateService, AccountTransferService accountTransferService) {
        this.accountRepository = accountRepository;
        this.auditMessageProducer = auditMessageProducer;
        this.exchangeRateService = exchangeRateService;
        this.accountTransferService = accountTransferService;
    }

    @Override
    public Result<Boolean> transfer(Long sourceUserId, String targetAccountNumber, BigDecimal targetAmount, String targetCurrency) throws Exception {
        // 参数校验
        Money targetMoney = new Money(targetAmount, new Currency(targetCurrency));

        // 读数据
        Account sourceAccount = accountRepository.find(new UserId(sourceUserId));
        Account targetAccount = accountRepository.find(new AccountNumber(targetAccountNumber));
        ExchangeRate exchangeRate = exchangeRateService.getExchangeRate(sourceAccount.getCurrency(), targetMoney.getCurrency());

        // 业务逻辑
        accountTransferService.transfer(sourceAccount, targetAccount, targetMoney, exchangeRate);

        // 保存数据
        accountRepository.save(sourceAccount);
        accountRepository.save(targetAccount);

        // 发送审计消息
        AuditMessage message = new AuditMessage(sourceAccount, targetAccount, targetMoney);
        auditMessageProducer.send(message);

        return Result.success(true);
    }
}
