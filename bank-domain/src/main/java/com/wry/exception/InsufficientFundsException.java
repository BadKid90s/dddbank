package com.wry.exception;

/**
 * 余额不足异常
 *
 * @author wry
 */
public class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException() {
    }
}
