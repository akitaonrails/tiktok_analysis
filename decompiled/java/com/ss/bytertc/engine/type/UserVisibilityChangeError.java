package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum UserVisibilityChangeError {
    OK(0),
    UNKNOWN(1),
    TOO_MANY_VISIBLE_USER(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static UserVisibilityChangeError fromId(int i) {
        for (UserVisibilityChangeError userVisibilityChangeError : values()) {
            if (userVisibilityChangeError.value() == i) {
                return userVisibilityChangeError;
            }
        }
        return UNKNOWN;
    }

    public static UserVisibilityChangeError valueOf(String str) {
        return (UserVisibilityChangeError) C08FF.LIZ(UserVisibilityChangeError.class, str);
    }

    UserVisibilityChangeError(int i) {
        this.value = i;
    }
}
