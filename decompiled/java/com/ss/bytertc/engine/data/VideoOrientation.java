package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum VideoOrientation {
    ADAPTIVE(0),
    PORTRAIT(1),
    LANDSCAPE(2);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        return i != 0 ? i != 1 ? i != 2 ? "" : "kVideoOrientationLandscape" : "kVideoOrientationPortrait" : "kVideoOrientationAdaptive";
    }

    public int value() {
        return this.value;
    }

    public static VideoOrientation fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return LANDSCAPE;
            }
            return PORTRAIT;
        }
        return ADAPTIVE;
    }

    public static VideoOrientation valueOf(String str) {
        return (VideoOrientation) C08FF.LIZ(VideoOrientation.class, str);
    }

    VideoOrientation(int i) {
        this.value = i;
    }
}
