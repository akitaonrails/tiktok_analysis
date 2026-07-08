package com.ss.bytertc.engine;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum GLESVersion {
    GLES_VERSION_UNKNOWN(0),
    GLES_VERSION_2(2),
    GLES_VERSION_3(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static GLESVersion fromId(int i) {
        for (GLESVersion gLESVersion : values()) {
            if (gLESVersion.value() == i) {
                return gLESVersion;
            }
        }
        return GLES_VERSION_UNKNOWN;
    }

    public static GLESVersion valueOf(String str) {
        return (GLESVersion) C08FF.LIZ(GLESVersion.class, str);
    }

    GLESVersion(int i) {
        this.value = i;
    }
}
