package com.ss.lyrax.utils;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxValueType {
    NULL(0),
    BOOL(1),
    INT(2),
    UINT32(3),
    INT64(4),
    DOUBLE(5),
    STRING(6);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LyraxValueType fromId(int i) {
        for (LyraxValueType lyraxValueType : values()) {
            if (lyraxValueType.value() == i) {
                return lyraxValueType;
            }
        }
        return NULL;
    }

    public static LyraxValueType valueOf(String str) {
        return (LyraxValueType) C08FF.LIZ(LyraxValueType.class, str);
    }

    LyraxValueType(int i) {
        this.value = i;
    }
}
