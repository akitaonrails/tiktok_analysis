package com.ss.lyrax.video;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum PauseStrategy {
    STATIC(0),
    GAUSSIAN(1),
    BLACK(2);

    public final int value;

    public int value() {
        return this.value;
    }

    public static PauseStrategy valueOf(String str) {
        return (PauseStrategy) C08FF.LIZ(PauseStrategy.class, str);
    }

    PauseStrategy(int i) {
        this.value = i;
    }
}
