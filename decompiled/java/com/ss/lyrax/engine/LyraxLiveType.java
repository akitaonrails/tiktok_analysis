package com.ss.lyrax.engine;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxLiveType {
    VIDEO(0),
    GAME(1);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxLiveType fromId(int i) {
        for (LyraxLiveType lyraxLiveType : values()) {
            if (lyraxLiveType.value() == i) {
                return lyraxLiveType;
            }
        }
        return VIDEO;
    }

    public static LyraxLiveType valueOf(String str) {
        return (LyraxLiveType) C08FF.LIZ(LyraxLiveType.class, str);
    }

    LyraxLiveType(int i) {
        this.val = i;
    }
}
