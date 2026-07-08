package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum VideoRotationMode {
    FOLLOW_APP(0),
    FOLLOW_GSENSOR(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return this == FOLLOW_GSENSOR ? "kVideoRotationModeFollowGSensor" : "kVideoRotationModeFollowApp";
    }

    public int value() {
        return this.value;
    }

    public static VideoRotationMode fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return FOLLOW_GSENSOR;
        }
        return FOLLOW_APP;
    }

    public static VideoRotationMode valueOf(String str) {
        return (VideoRotationMode) C08FF.LIZ(VideoRotationMode.class, str);
    }

    VideoRotationMode(int i) {
        this.value = i;
    }
}
