package com.example.panage.model;

import java.util.Arrays;

/**
 * @author panage
 */
public enum Flag {
    OFF(0),
    ON(1);

    private int value;

    Flag(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static Flag parse(int value) {
        return Arrays.stream(Flag.values())
                .filter(flag -> flag.getValue() == value)
                .findFirst()
                .orElseGet(() -> Flag.OFF);
    }
}
