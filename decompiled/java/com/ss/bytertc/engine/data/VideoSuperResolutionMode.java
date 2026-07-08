package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum VideoSuperResolutionMode {
    VIDEO_SUPER_RESOLUTION_MODE_OFF(0),
    VIDEO_SUPER_RESOLUTION_MODE_ON(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        return i != 0 ? i != 1 ? "" : "kVideoSuperResolutionModeOn" : "kVideoSuperResolutionModeOff";
    }

    public int value() {
        return this.value;
    }

    public static VideoSuperResolutionMode fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VIDEO_SUPER_RESOLUTION_MODE_ON;
        }
        return VIDEO_SUPER_RESOLUTION_MODE_OFF;
    }

    public static VideoSuperResolutionMode valueOf(String str) {
        return (VideoSuperResolutionMode) C08FF.LIZ(VideoSuperResolutionMode.class, str);
    }

    VideoSuperResolutionMode(int i) {
        this.value = i;
    }
}
