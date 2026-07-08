package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum VideoRotation {
    VIDEO_ROTATION_0(0),
    VIDEO_ROTATION_90(90),
    VIDEO_ROTATION_180(180),
    VIDEO_ROTATION_270(270);

    public int value;

    public int value() {
        return this.value;
    }

    public static VideoRotation fromId(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        return null;
                    }
                    return VIDEO_ROTATION_270;
                }
                return VIDEO_ROTATION_180;
            }
            return VIDEO_ROTATION_90;
        }
        return VIDEO_ROTATION_0;
    }

    public static VideoRotation valueOf(String str) {
        return (VideoRotation) C08FF.LIZ(VideoRotation.class, str);
    }

    VideoRotation(int i) {
        this.value = i;
    }
}
