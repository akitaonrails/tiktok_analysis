package com.ss.lyrax.room;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxForwardStreamError {
    OK(0),
    INVALID_ARGUMENT(1201),
    INVALID_TOKEN(1202),
    RESPONSE(1203),
    REMOTE_KICKED(1204),
    NOT_SUPPORT(1205);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxForwardStreamError fromId(int i) {
        for (LyraxForwardStreamError lyraxForwardStreamError : values()) {
            if (lyraxForwardStreamError.value() == i) {
                return lyraxForwardStreamError;
            }
        }
        return NOT_SUPPORT;
    }

    public static LyraxForwardStreamError valueOf(String str) {
        return (LyraxForwardStreamError) C08FF.LIZ(LyraxForwardStreamError.class, str);
    }

    LyraxForwardStreamError(int i) {
        this.val = i;
    }
}
