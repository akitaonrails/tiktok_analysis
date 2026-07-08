package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum AudioRenderType {
    AUDIO_RENDER_TYPE_EXTERNAL(0),
    AUDIO_RENDER_TYPE_INTERNAL(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return this == AUDIO_RENDER_TYPE_EXTERNAL ? "AUDIO_RENDER_TYPE_EXTERNAL" : "AUDIO_RENDER_TYPE_INTERNAL";
    }

    public int value() {
        return this.value;
    }

    public static AudioRenderType fromId(int i) {
        for (AudioRenderType audioRenderType : values()) {
            if (audioRenderType.value() == i) {
                return audioRenderType;
            }
        }
        return null;
    }

    public static AudioRenderType valueOf(String str) {
        return (AudioRenderType) C08FF.LIZ(AudioRenderType.class, str);
    }

    AudioRenderType(int i) {
        this.value = i;
    }
}
