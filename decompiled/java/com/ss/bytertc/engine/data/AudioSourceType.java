package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum AudioSourceType {
    AUDIO_SOURCE_TYPE_EXTERNAL(0),
    AUDIO_SOURCE_TYPE_INTERNAL(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return this == AUDIO_SOURCE_TYPE_EXTERNAL ? "AUDIO_SOURCE_TYPE_EXTERNAL" : "AUDIO_SOURCE_TYPE_INTERNAL";
    }

    public int value() {
        return this.value;
    }

    public static AudioSourceType fromId(int i) {
        for (AudioSourceType audioSourceType : values()) {
            if (audioSourceType.value() == i) {
                return audioSourceType;
            }
        }
        return null;
    }

    public static AudioSourceType valueOf(String str) {
        return (AudioSourceType) C08FF.LIZ(AudioSourceType.class, str);
    }

    AudioSourceType(int i) {
        this.value = i;
    }
}
