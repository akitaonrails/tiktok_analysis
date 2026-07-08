package com.bytedance.realx.video;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum RXVideoRotation {
    VIDEO_ROTATION_0(0),
    VIDEO_ROTATION_90(90),
    VIDEO_ROTATION_180(180),
    VIDEO_ROTATION_270(270);

    public int value;

    public int value() {
        return this.value;
    }

    public static RXVideoRotation fromId(int i) {
        if (RXEnumConfig.enableEnumOptimizationStrategy) {
            if (i != 0) {
                if (i != 90) {
                    if (i != 180) {
                        if (i == 270) {
                            return VIDEO_ROTATION_270;
                        }
                        return null;
                    }
                    return VIDEO_ROTATION_180;
                }
                return VIDEO_ROTATION_90;
            }
            return VIDEO_ROTATION_0;
        }
        for (RXVideoRotation rXVideoRotation : values()) {
            if (rXVideoRotation.value() == i) {
                return rXVideoRotation;
            }
        }
        return null;
    }

    public static RXVideoRotation valueOf(String str) {
        return (RXVideoRotation) C08FF.LIZ(RXVideoRotation.class, str);
    }

    RXVideoRotation(int i) {
        this.value = i;
    }
}
