package com.ss.lyrax.video;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum LyraxVideoRendererType {
    NORMAL_RENDER(0),
    STREAM_MIXER(1);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LyraxVideoRendererType fromId(int i) {
        for (LyraxVideoRendererType lyraxVideoRendererType : values()) {
            if (lyraxVideoRendererType.value == i) {
                return lyraxVideoRendererType;
            }
        }
        return NORMAL_RENDER;
    }

    public static LyraxVideoRendererType valueOf(String str) {
        return (LyraxVideoRendererType) C08FF.LIZ(LyraxVideoRendererType.class, str);
    }

    LyraxVideoRendererType(int i) {
        this.value = i;
    }
}
