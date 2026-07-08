package com.ss.lyrax.room;

import X.C08FF;

/* JADX INFO: loaded from: classes18.dex */
public enum LyraxStreamRemoveReason {
    UNPUBLISH(0),
    PUBLISH_FAILED(1),
    KEEP_LIVE_FAILED(2),
    CLIENT_DISCONNECTED(3),
    REPUBLISH(4),
    OTHER(5),
    PUBLISH_PRIVILEGE_TOKEN_EXPIRED(6);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LyraxStreamRemoveReason fromId(int i) {
        for (LyraxStreamRemoveReason lyraxStreamRemoveReason : values()) {
            if (lyraxStreamRemoveReason.value() == i) {
                return lyraxStreamRemoveReason;
            }
        }
        return UNPUBLISH;
    }

    public static LyraxStreamRemoveReason valueOf(String str) {
        return (LyraxStreamRemoveReason) C08FF.LIZ(LyraxStreamRemoveReason.class, str);
    }

    LyraxStreamRemoveReason(int i) {
        this.value = i;
    }
}
