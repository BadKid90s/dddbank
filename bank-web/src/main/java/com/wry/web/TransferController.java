package com.wry.web;

import com.wry.application.TransferService;
import com.wry.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author wry
 */
@RestController
@RequestMapping("/test")
public class TransferController {
    @Autowired
    private TransferService transferService;

    @RequestMapping("/transfer")
    public Result<Boolean> transfer() throws Exception {
        Long sourceUserId = 1L;
        String targetAccountNumber = "123";
        BigDecimal targetAmount = new BigDecimal(100);
        String targetCurrency = "人民币";
        return transferService.transfer(sourceUserId, targetAccountNumber, targetAmount, targetCurrency);
    }
}
