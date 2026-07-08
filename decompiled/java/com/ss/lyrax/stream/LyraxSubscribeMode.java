package com.ss.lyrax.stream;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum LyraxSubscribeMode {
    AUTO(0),
    MANUAL(1);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxSubscribeMode fromId(int i) {
        for (LyraxSubscribeMode lyraxSubscribeMode : values()) {
            if (lyraxSubscribeMode.value() == i) {
                return lyraxSubscribeMode;
            }
        }
        return AUTO;
    }

    public static LyraxSubscribeMode valueOf(String str) {
        return (LyraxSubscribeMode) C08FF.LIZ(LyraxSubscribeMode.class, str);
    }

    LyraxSubscribeMode(int i) {
        this.val = i;
    }
}
