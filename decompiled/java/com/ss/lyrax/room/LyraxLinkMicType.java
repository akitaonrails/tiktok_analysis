package com.ss.lyrax.room;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum LyraxLinkMicType {
    NONE(0),
    ANCHOR(1),
    GUEST(2);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxLinkMicType fromId(int i) {
        for (LyraxLinkMicType lyraxLinkMicType : values()) {
            if (lyraxLinkMicType.value() == i) {
                return lyraxLinkMicType;
            }
        }
        return NONE;
    }

    public static LyraxLinkMicType valueOf(String str) {
        return (LyraxLinkMicType) C08FF.LIZ(LyraxLinkMicType.class, str);
    }

    LyraxLinkMicType(int i) {
        this.val = i;
    }
}
