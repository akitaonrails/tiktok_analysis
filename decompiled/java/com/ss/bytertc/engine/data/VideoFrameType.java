package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum VideoFrameType {
    UNKNOWN(0),
    RAW_MEMORY(1),
    GL_TEXTURE(3);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }

    public int value() {
        return this.value;
    }

    public static VideoFrameType fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return null;
                }
                return GL_TEXTURE;
            }
            return RAW_MEMORY;
        }
        return UNKNOWN;
    }

    public static VideoFrameType valueOf(String str) {
        return (VideoFrameType) C08FF.LIZ(VideoFrameType.class, str);
    }

    VideoFrameType(int i) {
        this.value = i;
    }
}
