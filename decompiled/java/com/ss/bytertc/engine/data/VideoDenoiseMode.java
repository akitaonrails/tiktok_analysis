package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum VideoDenoiseMode {
    VIDEO_DENOISE_MODE_OFF(0),
    VIDEO_DENOISE_MODE_AUTO(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        return i != 0 ? i != 1 ? "" : "kVideoDenoiseModeAuto" : "kVideoDenoiseModeOff";
    }

    public int value() {
        return this.value;
    }

    public static VideoDenoiseMode fromId(int i) {
        for (VideoDenoiseMode videoDenoiseMode : values()) {
            if (videoDenoiseMode.value() == i) {
                return videoDenoiseMode;
            }
        }
        return null;
    }

    public static VideoDenoiseMode valueOf(String str) {
        return (VideoDenoiseMode) C08FF.LIZ(VideoDenoiseMode.class, str);
    }

    VideoDenoiseMode(int i) {
        this.value = i;
    }
}
