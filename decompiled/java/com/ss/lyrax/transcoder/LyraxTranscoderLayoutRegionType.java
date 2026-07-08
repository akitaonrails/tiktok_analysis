package com.ss.lyrax.transcoder;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxTranscoderLayoutRegionType {
    VIDEO_STREAM(0),
    IMAGE(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static LyraxTranscoderLayoutRegionType fromId(int i) {
        for (LyraxTranscoderLayoutRegionType lyraxTranscoderLayoutRegionType : values()) {
            if (lyraxTranscoderLayoutRegionType.value() == i) {
                return lyraxTranscoderLayoutRegionType;
            }
        }
        return VIDEO_STREAM;
    }

    public static LyraxTranscoderLayoutRegionType valueOf(String str) {
        return (LyraxTranscoderLayoutRegionType) C08FF.LIZ(LyraxTranscoderLayoutRegionType.class, str);
    }

    LyraxTranscoderLayoutRegionType(int i) {
        this.value = i;
    }
}
