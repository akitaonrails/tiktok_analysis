package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum LocalLogLevel {
    INFO(0),
    WARNING(1),
    ERROR(2),
    NONE(3);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static LocalLogLevel fromId(int i) {
        for (LocalLogLevel localLogLevel : values()) {
            if (localLogLevel.getValue() == i) {
                return localLogLevel;
            }
        }
        return WARNING;
    }

    public static LocalLogLevel valueOf(String str) {
        return (LocalLogLevel) C08FF.LIZ(LocalLogLevel.class, str);
    }

    LocalLogLevel(int i) {
        this.value = i;
    }
}
