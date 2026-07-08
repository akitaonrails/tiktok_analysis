package com.ss.lyrax.video;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxVideoSubSource {
    CAMERA(0),
    SCREEN(1),
    EXTERNAL_FRAME(2);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LyraxVideoSubSource valueOf(String str) {
        return (LyraxVideoSubSource) C08FF.LIZ(LyraxVideoSubSource.class, str);
    }

    LyraxVideoSubSource(int i) {
        this.value = i;
    }
}
