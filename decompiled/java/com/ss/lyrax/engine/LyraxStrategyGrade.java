package com.ss.lyrax.engine;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum LyraxStrategyGrade {
    UNKNOWN(-1),
    HIGH(0),
    MIDDLE(1),
    LOW(2);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxStrategyGrade fromId(int i) {
        for (LyraxStrategyGrade lyraxStrategyGrade : values()) {
            if (lyraxStrategyGrade.value() == i) {
                return lyraxStrategyGrade;
            }
        }
        return UNKNOWN;
    }

    public static LyraxStrategyGrade valueOf(String str) {
        return (LyraxStrategyGrade) C08FF.LIZ(LyraxStrategyGrade.class, str);
    }

    LyraxStrategyGrade(int i) {
        this.val = i;
    }
}
