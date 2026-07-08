package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes14.dex */
public enum VideoDeviceFacing {
    FRONT(0),
    BACK(1),
    UNKNOWN(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static VideoDeviceFacing fromId(int i) {
        for (VideoDeviceFacing videoDeviceFacing : values()) {
            if (videoDeviceFacing.value() == i) {
                return videoDeviceFacing;
            }
        }
        return null;
    }

    public static VideoDeviceFacing valueOf(String str) {
        return (VideoDeviceFacing) C08FF.LIZ(VideoDeviceFacing.class, str);
    }

    VideoDeviceFacing(int i) {
        this.value = i;
    }
}
