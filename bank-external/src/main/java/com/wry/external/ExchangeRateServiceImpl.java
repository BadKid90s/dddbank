package com.wry.external;

import com.wry.types.Currency;
import com.wry.types.ExchangeRate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author wry
 */
@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {
    @Override
    public ExchangeRate getExchangeRate(Currency source, Currency target) {
        return new ExchangeRate(new BigDecimal(0.1), source, target);
    }
}
