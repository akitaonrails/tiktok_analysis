package com.ss.lyrax.engine;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxAttributeKey {
    UNKNOWN(-1),
    LIVE_ROOM_ID(0),
    AB_LABEL(1),
    APP_STATE(2),
    FORCE_RTMP_IN_LIVE(3),
    FALLBACK_RTMP_BY_RTC(4),
    NOT_ALLOW_FALLBACK_RTMP(5),
    NOT_ALLOW_FALLBACK_RTMP_SUBCODES(6),
    RUNTIME_CONFIG(7),
    ENABLE_LDS(8),
    LDS_CONFIG(9),
    LIVE_SETTINGS(10),
    LIVE_ROLE(11),
    ACCESS_GROUP_ID(12);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxAttributeKey fromId(int i) {
        for (LyraxAttributeKey lyraxAttributeKey : values()) {
            if (lyraxAttributeKey.value() == i) {
                return lyraxAttributeKey;
            }
        }
        return UNKNOWN;
    }

    public static LyraxAttributeKey valueOf(String str) {
        return (LyraxAttributeKey) C08FF.LIZ(LyraxAttributeKey.class, str);
    }

    LyraxAttributeKey(int i) {
        this.val = i;
    }
}
