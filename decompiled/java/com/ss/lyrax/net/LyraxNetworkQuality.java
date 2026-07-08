package com.ss.lyrax.net;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxNetworkQuality {
    UNKNOWN(0),
    EXCELLENT(1),
    GOOD(2),
    POOR(3),
    BAD(4),
    VERYBAD(5),
    DOWN(6);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxNetworkQuality fromId(int i) {
        for (LyraxNetworkQuality lyraxNetworkQuality : values()) {
            if (lyraxNetworkQuality.value() == i) {
                return lyraxNetworkQuality;
            }
        }
        return UNKNOWN;
    }

    public static LyraxNetworkQuality valueOf(String str) {
        return (LyraxNetworkQuality) C08FF.LIZ(LyraxNetworkQuality.class, str);
    }

    LyraxNetworkQuality(int i) {
        this.val = i;
    }
}
