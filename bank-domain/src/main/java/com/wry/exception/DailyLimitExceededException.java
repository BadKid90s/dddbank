package com.wry.exception;

/**
 * 每日超出限额异常
 *
 * @author wry
 */
public class DailyLimitExceededException extends RuntimeException {

    public DailyLimitExceededException(String message) {
        super(message);
    }

    public DailyLimitExceededException() {
    }
}
