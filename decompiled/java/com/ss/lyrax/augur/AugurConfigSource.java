package com.ss.lyrax.augur;

import X.C08FF;

/* JADX INFO: loaded from: classes10.dex */
public enum AugurConfigSource {
    ENGINE_CONFIG(0),
    STREAM_CONFIG(1),
    SETTINGS_CONFIG(2),
    ROOM_CREATE_CONFIG(3),
    UNKNOWN(2);

    public final int value;

    public int value() {
        return this.value;
    }

    public static AugurConfigSource fromId(int i) {
        for (AugurConfigSource augurConfigSource : values()) {
            if (augurConfigSource.value() == i) {
                return augurConfigSource;
            }
        }
        return UNKNOWN;
    }

    public static AugurConfigSource valueOf(String str) {
        return (AugurConfigSource) C08FF.LIZ(AugurConfigSource.class, str);
    }

    AugurConfigSource(int i) {
        this.value = i;
    }
}
