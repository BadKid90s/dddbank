package com.wry.types;

import com.wry.exception.MoneyAmoutNotNullException;

import java.math.BigDecimal;

/**
 * @author wry
 */
public class Money {
    /**
     * 金额
     */
    private BigDecimal amout;
    /**
     * 货币
     */
    private Currency currency;

    public Money(BigDecimal amout, Currency currency) {

        if (amout == null){
            throw new MoneyAmoutNotNullException("金额不能为空");
        }
        this.amout = amout;
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getAmout() {
        return amout;
    }

    public int compareTo(Money money) {
        return this.amout.compareTo(money.getAmout());
    }

    public Money subtract(Money money) throws Exception {
        BigDecimal resultAmout = this.amout.subtract(money.getAmout());
        return new Money(resultAmout, this.currency);
    }


    public Money add(Money money) throws MoneyAmoutNotNullException {
        BigDecimal resultAmout = this.amout.add(money.getAmout());
        return new Money(resultAmout, this.currency);
    }
}
