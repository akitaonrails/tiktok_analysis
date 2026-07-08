package com.ss.lyrax.engine;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxNetworkType {
    UNKNOWN(-1),
    DISCONNECTED(0),
    LAN(1),
    WIFI(2),
    MOBILE2G(3),
    MOBILE3G(4),
    MOBILE4G(5),
    MOBILE5G(6);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxNetworkType fromId(int i) {
        for (LyraxNetworkType lyraxNetworkType : values()) {
            if (lyraxNetworkType.value() == i) {
                return lyraxNetworkType;
            }
        }
        return UNKNOWN;
    }

    public static LyraxNetworkType valueOf(String str) {
        return (LyraxNetworkType) C08FF.LIZ(LyraxNetworkType.class, str);
    }

    LyraxNetworkType(int i) {
        this.val = i;
    }
}
