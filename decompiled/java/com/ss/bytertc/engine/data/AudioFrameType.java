package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum AudioFrameType {
    FRAME_TYPE_PCM16(0);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return this == FRAME_TYPE_PCM16 ? "kFrameTypePCM16" : "kFrameTypeUnknown";
    }

    public int value() {
        return this.value;
    }

    public static AudioFrameType fromId(int i) {
        for (AudioFrameType audioFrameType : values()) {
            if (audioFrameType.value() == i) {
                return audioFrameType;
            }
        }
        return null;
    }

    public static AudioFrameType valueOf(String str) {
        return (AudioFrameType) C08FF.LIZ(AudioFrameType.class, str);
    }

    AudioFrameType(int i) {
        this.value = i;
    }
}
