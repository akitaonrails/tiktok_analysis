package com.ss.lyrax.video;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoSourceState {
    CREATED(0),
    STARTED(1),
    STOPPED(2);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LyraxVideoSourceState fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return CREATED;
                }
                return STOPPED;
            }
            return STARTED;
        }
        return CREATED;
    }

    public static LyraxVideoSourceState valueOf(String str) {
        return (LyraxVideoSourceState) C08FF.LIZ(LyraxVideoSourceState.class, str);
    }

    LyraxVideoSourceState(int i) {
        this.value = i;
    }
}
