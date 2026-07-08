package com.ss.lyrax.transcoder;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxTranscoderSyncStrategy {
    NO_SYNC(0),
    AUDIO_PRECISE_SYNC(1),
    SIMPLEX_MODE_SYNC(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static LyraxTranscoderSyncStrategy fromId(int i) {
        for (LyraxTranscoderSyncStrategy lyraxTranscoderSyncStrategy : values()) {
            if (lyraxTranscoderSyncStrategy.value() == i) {
                return lyraxTranscoderSyncStrategy;
            }
        }
        return NO_SYNC;
    }

    public static LyraxTranscoderSyncStrategy valueOf(String str) {
        return (LyraxTranscoderSyncStrategy) C08FF.LIZ(LyraxTranscoderSyncStrategy.class, str);
    }

    LyraxTranscoderSyncStrategy(int i) {
        this.value = i;
    }
}
