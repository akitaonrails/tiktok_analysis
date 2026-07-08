package com.ss.lyrax.transcoder;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxTranscoderRenderMode {
    HIDDEN(1),
    FIT(2),
    ADAPTIVE(3),
    BOTTOM_CROP(4);

    public int value;

    public int value() {
        return this.value;
    }

    public static LyraxTranscoderRenderMode fromId(int i) {
        for (LyraxTranscoderRenderMode lyraxTranscoderRenderMode : values()) {
            if (lyraxTranscoderRenderMode.value() == i) {
                return lyraxTranscoderRenderMode;
            }
        }
        return HIDDEN;
    }

    public static LyraxTranscoderRenderMode valueOf(String str) {
        return (LyraxTranscoderRenderMode) C08FF.LIZ(LyraxTranscoderRenderMode.class, str);
    }

    LyraxTranscoderRenderMode(int i) {
        this.value = i;
    }
}
