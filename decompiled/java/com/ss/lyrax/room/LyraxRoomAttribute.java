package com.ss.lyrax.room;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum LyraxRoomAttribute {
    UNKNOWN(0),
    BUSINESSID(1),
    BUSINESS_SESSION_ID(2),
    BUSINESS_LABEL(3),
    CUSTOM_USER_ROLE(4),
    GROUP_CHANNEL_ID(5);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxRoomAttribute fromId(int i) {
        for (LyraxRoomAttribute lyraxRoomAttribute : values()) {
            if (lyraxRoomAttribute.value() == i) {
                return lyraxRoomAttribute;
            }
        }
        return UNKNOWN;
    }

    public static LyraxRoomAttribute valueOf(String str) {
        return (LyraxRoomAttribute) C08FF.LIZ(LyraxRoomAttribute.class, str);
    }

    LyraxRoomAttribute(int i) {
        this.val = i;
    }
}
