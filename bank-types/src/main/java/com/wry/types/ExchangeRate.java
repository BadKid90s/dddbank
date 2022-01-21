package com.wry.types;

import java.math.BigDecimal;

/**
 * 兑换
 * @author wry
 */
public class ExchangeRate {
    /**
     * 比率
     */
    private BigDecimal rage;
    /**
     * 原货币
     */
    private Currency source;
    /**
     * 目标货币
     */
    private Currency target;

    public ExchangeRate(BigDecimal rage, Currency source, Currency target) {
        this.rage = rage;
        this.source = source;
        this.target = target;
    }

    public Money exchageTo(Money targetMoney)  {
        BigDecimal targetMount = targetMoney.getAmout().multiply(rage);
        return new Money(targetMount, target);
    }
}
