package com.ss.lyrax.room;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxMessageType {
    RELIABLE_ORDERED(0),
    UNRELIABLE_ORDERED(1),
    UNRELIABLE_UNORDERED(2);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxMessageType fromId(int i) {
        for (LyraxMessageType lyraxMessageType : values()) {
            if (lyraxMessageType.value() == i) {
                return lyraxMessageType;
            }
        }
        return RELIABLE_ORDERED;
    }

    public static LyraxMessageType valueOf(String str) {
        return (LyraxMessageType) C08FF.LIZ(LyraxMessageType.class, str);
    }

    LyraxMessageType(int i) {
        this.val = i;
    }
}
