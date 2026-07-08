package com.ss.lyrax.room;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum LyraxUserVisibilityChangeError {
    OK(0),
    UNKNOWN(1),
    TOO_MANY_VISIBLE_USER(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static LyraxUserVisibilityChangeError fromId(int i) {
        for (LyraxUserVisibilityChangeError lyraxUserVisibilityChangeError : values()) {
            if (lyraxUserVisibilityChangeError.value() == i) {
                return lyraxUserVisibilityChangeError;
            }
        }
        return UNKNOWN;
    }

    public static LyraxUserVisibilityChangeError valueOf(String str) {
        return (LyraxUserVisibilityChangeError) C08FF.LIZ(LyraxUserVisibilityChangeError.class, str);
    }

    LyraxUserVisibilityChangeError(int i) {
        this.value = i;
    }
}
