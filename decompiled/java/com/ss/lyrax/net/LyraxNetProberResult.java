package com.ss.lyrax.net;

import X.C08FF;

/* JADX INFO: loaded from: classes10.dex */
public enum LyraxNetProberResult {
    DEFAULT(-1),
    SUCCESS(1),
    FAILED(2),
    STOPPED_MANUALLY(3);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxNetProberResult fromId(int i) {
        for (LyraxNetProberResult lyraxNetProberResult : values()) {
            if (lyraxNetProberResult.value() == i) {
                return lyraxNetProberResult;
            }
        }
        return DEFAULT;
    }

    public static LyraxNetProberResult valueOf(String str) {
        return (LyraxNetProberResult) C08FF.LIZ(LyraxNetProberResult.class, str);
    }

    LyraxNetProberResult(int i) {
        this.val = i;
    }
}
