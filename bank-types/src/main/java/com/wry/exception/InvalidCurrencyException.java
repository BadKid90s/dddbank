package com.wry.exception;

/**
 * @author wry
 */
public class InvalidCurrencyException extends RuntimeException {

    public InvalidCurrencyException(String message) {
        super(message);
    }

    public InvalidCurrencyException() {
    }
}
