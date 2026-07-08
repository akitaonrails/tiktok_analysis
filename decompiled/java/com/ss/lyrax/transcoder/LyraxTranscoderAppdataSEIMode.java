package com.ss.lyrax.transcoder;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum LyraxTranscoderAppdataSEIMode {
    ASYNC_MODE(0),
    SYNC_MODE(1);

    public int appdataSEISyncMode;

    public int getValue() {
        return this.appdataSEISyncMode;
    }

    public static LyraxTranscoderAppdataSEIMode valueOf(String str) {
        return (LyraxTranscoderAppdataSEIMode) C08FF.LIZ(LyraxTranscoderAppdataSEIMode.class, str);
    }

    LyraxTranscoderAppdataSEIMode(int i) {
        this.appdataSEISyncMode = i;
    }
}
