package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum MirrorMode {
    MIRROR_MODE_OFF(0),
    MIRROR_MODE_ON(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return this == MIRROR_MODE_ON ? "kMirrorModeOn" : "kMirrorModeOff";
    }

    public int value() {
        return this.value;
    }

    public static MirrorMode fromId(int i) {
        for (MirrorMode mirrorMode : values()) {
            if (mirrorMode.value() == i) {
                return mirrorMode;
            }
        }
        return null;
    }

    public static MirrorMode valueOf(String str) {
        return (MirrorMode) C08FF.LIZ(MirrorMode.class, str);
    }

    MirrorMode(int i) {
        this.value = i;
    }
}
