package com.wry.persistence.impl;

import java.math.BigDecimal;

import com.wry.persistence.AccountDO;
import com.wry.persistence.AccountMapper;
import org.springframework.stereotype.Component;

@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public int insert(AccountDO accountDO) {
        return 1;
    }

    @Override
    public int update(AccountDO accountDO) {
        return 1;
    }

    @Override
    public AccountDO selectByUserId(Long id) {
        AccountDO accountDO = new AccountDO();

        if (id.equals(1L)) {
            accountDO.setCurrency("人民币");
            accountDO.setId(1L);
            accountDO.setAccountNumber("123");
            accountDO.setUserId(1L);
            accountDO.setAvailableAmout(new BigDecimal("100"));
            accountDO.setDailyLimitAmout(new BigDecimal("1000"));
        } else {
            accountDO.setCurrency("人民币");
            accountDO.setId(2L);
            accountDO.setAccountNumber("456");
            accountDO.setUserId(2L);
            accountDO.setAvailableAmout(new BigDecimal("100"));
            accountDO.setDailyLimitAmout(new BigDecimal("1000"));
        }
        return accountDO;
    }

    @Override
    public AccountDO selectByAccountNumber(String accountNumber) {
        AccountDO accountDO = new AccountDO();

        if (accountNumber.equals("123")) {
            accountDO.setCurrency("人民币");
            accountDO.setId(1L);
            accountDO.setAccountNumber("123");
            accountDO.setUserId(1L);
            accountDO.setAvailableAmout(new BigDecimal("100"));
            accountDO.setDailyLimitAmout(new BigDecimal("1000"));
        } else {
            accountDO.setCurrency("人民币");
            accountDO.setId(2L);
            accountDO.setAccountNumber("456");
            accountDO.setUserId(2L);
            accountDO.setAvailableAmout(new BigDecimal("100"));
            accountDO.setDailyLimitAmout(new BigDecimal("1000"));
        }
        return accountDO;
    }

    @Override
    public AccountDO selectById(Long id) {
        AccountDO accountDO = new AccountDO();

        if (id == 1) {
            accountDO.setCurrency("人民币");
            accountDO.setId(1L);
            accountDO.setAccountNumber("123");
            accountDO.setUserId(1L);
            accountDO.setAvailableAmout(new BigDecimal("100"));
            accountDO.setDailyLimitAmout(new BigDecimal("1000"));
        } else {
            accountDO.setCurrency("人民币");
            accountDO.setId(2L);
            accountDO.setAccountNumber("456");
            accountDO.setUserId(2L);
            accountDO.setAvailableAmout(new BigDecimal("100"));
            accountDO.setDailyLimitAmout(new BigDecimal("1000"));
        }
        return accountDO;
    }
}
