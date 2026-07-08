package com.ss.bytertc.engine.live;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum ChorusCacheSyncMode {
    CHORUS_CACHE_SYNC_MODE_PRODUCER(0),
    CHORUS_CACHE_SYNC_MODE_RETRANSMITTER(1),
    CHORUS_CACHE_SYNC_MODE_CONSUMER(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static ChorusCacheSyncMode fromId(int i) {
        for (ChorusCacheSyncMode chorusCacheSyncMode : values()) {
            if (chorusCacheSyncMode.value() == i) {
                return chorusCacheSyncMode;
            }
        }
        return null;
    }

    public static ChorusCacheSyncMode valueOf(String str) {
        return (ChorusCacheSyncMode) C08FF.LIZ(ChorusCacheSyncMode.class, str);
    }

    ChorusCacheSyncMode(int i) {
        this.value = i;
    }
}
