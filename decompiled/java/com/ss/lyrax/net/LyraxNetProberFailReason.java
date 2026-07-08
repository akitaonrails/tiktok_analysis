package com.ss.lyrax.net;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum LyraxNetProberFailReason {
    DEFAULT(-1),
    NOT_CONNECTED(1),
    PROBE_ERROR(2),
    PACKET_SEND_TIME_TOO_SHORT(3);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxNetProberFailReason fromId(int i) {
        for (LyraxNetProberFailReason lyraxNetProberFailReason : values()) {
            if (lyraxNetProberFailReason.value() == i) {
                return lyraxNetProberFailReason;
            }
        }
        return DEFAULT;
    }

    public static LyraxNetProberFailReason valueOf(String str) {
        return (LyraxNetProberFailReason) C08FF.LIZ(LyraxNetProberFailReason.class, str);
    }

    LyraxNetProberFailReason(int i) {
        this.val = i;
    }
}
