package com.ss.lyrax.net;

import X.C08FF;

/* JADX INFO: loaded from: classes10.dex */
public enum LyraxNetProberBandwidthCalcType {
    NEWEST(0),
    MAX_AVG(1),
    FOF(2);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxNetProberBandwidthCalcType fromId(int i) {
        for (LyraxNetProberBandwidthCalcType lyraxNetProberBandwidthCalcType : values()) {
            if (lyraxNetProberBandwidthCalcType.value() == i) {
                return lyraxNetProberBandwidthCalcType;
            }
        }
        return NEWEST;
    }

    public static LyraxNetProberBandwidthCalcType valueOf(String str) {
        return (LyraxNetProberBandwidthCalcType) C08FF.LIZ(LyraxNetProberBandwidthCalcType.class, str);
    }

    LyraxNetProberBandwidthCalcType(int i) {
        this.val = i;
    }
}
