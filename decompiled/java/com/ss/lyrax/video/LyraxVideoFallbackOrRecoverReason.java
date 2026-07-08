package com.ss.lyrax.video;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum LyraxVideoFallbackOrRecoverReason {
    UNKNOWN(-1),
    SUBSCRIBE_FALLBACK_BY_BANDWIDTH(0),
    SUBSCRIBE_FALLBACK_BY_PERFORMANCE(1),
    SUBSCRIBE_RECOVER_BY_BANDWIDTH(2),
    SUBSCRIBE_RECOVER_BY_PERFORMANCE(3),
    PUBLISH_FALLBACK_BY_BANDWIDTH(4),
    PUBLISH_FALLBACK_BY_PERFORMANCE(5),
    PUBLISH_RECOVER_BY_BANDWIDTH(6),
    PUBLISH_RECOVER_BY_PERFORMANCE(7);

    public int value;

    public int value() {
        return this.value;
    }

    public static LyraxVideoFallbackOrRecoverReason fromId(int i) {
        for (LyraxVideoFallbackOrRecoverReason lyraxVideoFallbackOrRecoverReason : values()) {
            if (lyraxVideoFallbackOrRecoverReason.value() == i) {
                return lyraxVideoFallbackOrRecoverReason;
            }
        }
        return UNKNOWN;
    }

    public static LyraxVideoFallbackOrRecoverReason valueOf(String str) {
        return (LyraxVideoFallbackOrRecoverReason) C08FF.LIZ(LyraxVideoFallbackOrRecoverReason.class, str);
    }

    LyraxVideoFallbackOrRecoverReason(int i) {
        this.value = i;
    }
}
