package com.wry.common;

/**
 * @author wry
 */
public class Result<T> {

    T data;

    public Result(T data) {
        this.data = data;
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
