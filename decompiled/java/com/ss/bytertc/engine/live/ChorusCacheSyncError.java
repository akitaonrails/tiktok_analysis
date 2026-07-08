package com.ss.bytertc.engine.live;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum ChorusCacheSyncError {
    CHORUS_CACHE_SYNC_ERROR_OK(0),
    CHORUS_CACHE_SYNC_ERROR_WRONG_STATE(1),
    CHORUS_CACHE_SYNC_ERROR_ALREADY_RUNNING(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static ChorusCacheSyncError fromId(int i) {
        for (ChorusCacheSyncError chorusCacheSyncError : values()) {
            if (chorusCacheSyncError.value() == i) {
                return chorusCacheSyncError;
            }
        }
        return null;
    }

    public static ChorusCacheSyncError valueOf(String str) {
        return (ChorusCacheSyncError) C08FF.LIZ(ChorusCacheSyncError.class, str);
    }

    ChorusCacheSyncError(int i) {
        this.value = i;
    }
}
