package com.ss.lyrax.room;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxForwardStreamState {
    IDLE(0),
    SUCCESS(1),
    FAILURE(2);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxForwardStreamState fromId(int i) {
        for (LyraxForwardStreamState lyraxForwardStreamState : values()) {
            if (lyraxForwardStreamState.value() == i) {
                return lyraxForwardStreamState;
            }
        }
        return FAILURE;
    }

    public static LyraxForwardStreamState valueOf(String str) {
        return (LyraxForwardStreamState) C08FF.LIZ(LyraxForwardStreamState.class, str);
    }

    LyraxForwardStreamState(int i) {
        this.val = i;
    }
}
