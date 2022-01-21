package com.wry.external;

import com.wry.types.Currency;
import com.wry.types.ExchangeRate;

public interface ExchangeRateService {

    ExchangeRate getExchangeRate(Currency source, Currency target);
}
