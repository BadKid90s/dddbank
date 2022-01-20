package com.wry.exception;

/**
 * @author wry
 */
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}
