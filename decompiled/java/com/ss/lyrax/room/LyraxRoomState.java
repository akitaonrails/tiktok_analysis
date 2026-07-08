package com.ss.lyrax.room;

import X.C08FF;

/* JADX INFO: loaded from: classes16.dex */
public enum LyraxRoomState {
    INITIALIZE(0),
    PREPARE(1),
    JOINING(2),
    JOINED(3),
    OFFLINE(4),
    ERROR(5),
    LEAVE(6),
    DESTROY(7);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxRoomState fromId(int i) {
        for (LyraxRoomState lyraxRoomState : values()) {
            if (lyraxRoomState.value() == i) {
                return lyraxRoomState;
            }
        }
        return INITIALIZE;
    }

    public static LyraxRoomState valueOf(String str) {
        return (LyraxRoomState) C08FF.LIZ(LyraxRoomState.class, str);
    }

    LyraxRoomState(int i) {
        this.val = i;
    }
}
