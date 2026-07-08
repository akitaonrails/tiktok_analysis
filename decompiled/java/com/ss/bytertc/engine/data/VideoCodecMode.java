package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum VideoCodecMode {
    VIDEO_CODEC_MODE_AUTO(0),
    VIDEO_CODEC_MODE_HARDWARE(1),
    VIDEO_CODEC_MODE_SOFTWARE(2);

    public int value;

    public int getValue() {
        return this.value;
    }

    public int value() {
        return this.value;
    }

    public static VideoCodecMode fromId(int i) {
        for (VideoCodecMode videoCodecMode : values()) {
            if (videoCodecMode.value() == i) {
                return videoCodecMode;
            }
        }
        return null;
    }

    public static VideoCodecMode valueOf(String str) {
        return (VideoCodecMode) C08FF.LIZ(VideoCodecMode.class, str);
    }

    VideoCodecMode(int i) {
        this.value = i;
    }
}
