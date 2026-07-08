package com.ss.lyrax.transcoder;

import X.C08FF;

/* JADX INFO: loaded from: classes13.dex */
public enum LyraxTranscoderMediaType {
    AUDIO_AND_VIDEO(0),
    AUDIO_ONLY(1),
    VIDEO_ONLY(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static LyraxTranscoderMediaType fromId(int i) {
        for (LyraxTranscoderMediaType lyraxTranscoderMediaType : values()) {
            if (lyraxTranscoderMediaType.value() == i) {
                return lyraxTranscoderMediaType;
            }
        }
        return AUDIO_AND_VIDEO;
    }

    public static LyraxTranscoderMediaType valueOf(String str) {
        return (LyraxTranscoderMediaType) C08FF.LIZ(LyraxTranscoderMediaType.class, str);
    }

    LyraxTranscoderMediaType(int i) {
        this.value = i;
    }
}
