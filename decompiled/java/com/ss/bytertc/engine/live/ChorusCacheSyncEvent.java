package com.ss.bytertc.engine.live;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum ChorusCacheSyncEvent {
    CHORUS_CACHE_SYNC_EVENT_START_SUCCESS(0),
    CHORUS_CACHE_SYNC_EVENT_START_FAILED(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static ChorusCacheSyncEvent fromId(int i) {
        for (ChorusCacheSyncEvent chorusCacheSyncEvent : values()) {
            if (chorusCacheSyncEvent.value() == i) {
                return chorusCacheSyncEvent;
            }
        }
        return null;
    }

    public static ChorusCacheSyncEvent valueOf(String str) {
        return (ChorusCacheSyncEvent) C08FF.LIZ(ChorusCacheSyncEvent.class, str);
    }

    ChorusCacheSyncEvent(int i) {
        this.value = i;
    }
}
