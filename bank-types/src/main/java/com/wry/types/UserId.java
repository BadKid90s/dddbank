package com.wry.types;

/**
 * @author wry
 */
public class UserId {
    private Long value;

    public UserId(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
