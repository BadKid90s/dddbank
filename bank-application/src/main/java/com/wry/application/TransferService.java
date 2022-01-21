package com.wry.application;

import com.wry.common.Result;

import java.math.BigDecimal;

/**
 * 转账服务
 *
 * @author wry
 */
public interface TransferService {
    /**
     * 转账
     *
     * @param sourceUserId        用户id
     * @param targetAccountNumber 转账账户
     * @param targetAmount        转账金额
     * @param targetCurrency      转账货币
     * @return 转账结果
     * @throws Exception
     */
    Result<Boolean> transfer(Long sourceUserId, String targetAccountNumber, BigDecimal targetAmount, String targetCurrency) throws Exception;
}
