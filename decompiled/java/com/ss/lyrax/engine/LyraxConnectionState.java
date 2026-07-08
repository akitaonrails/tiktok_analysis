package com.ss.lyrax.engine;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxConnectionState {
    DISCONNECTED(1),
    CONNECTING(2),
    CONNECTED(3),
    RECONNECTING(4),
    RECONNECTED(5),
    LOST(6),
    FAILED(7);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LyraxConnectionState fromId(int i) {
        for (LyraxConnectionState lyraxConnectionState : values()) {
            if (lyraxConnectionState.value() == i) {
                return lyraxConnectionState;
            }
        }
        return DISCONNECTED;
    }

    public static LyraxConnectionState valueOf(String str) {
        return (LyraxConnectionState) C08FF.LIZ(LyraxConnectionState.class, str);
    }

    LyraxConnectionState(int i) {
        this.value = i;
    }
}
