package com.ss.lyrax.video;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum ErrorStrategy {
    FREEZE(0),
    BLACK(1),
    GAUSSIAN(2);

    public final int value;

    public int value() {
        return this.value;
    }

    public static ErrorStrategy fromValue(int i) {
        for (ErrorStrategy errorStrategy : values()) {
            if (errorStrategy.value == i) {
                return errorStrategy;
            }
        }
        return FREEZE;
    }

    public static ErrorStrategy valueOf(String str) {
        return (ErrorStrategy) C08FF.LIZ(ErrorStrategy.class, str);
    }

    ErrorStrategy(int i) {
        this.value = i;
    }
}
