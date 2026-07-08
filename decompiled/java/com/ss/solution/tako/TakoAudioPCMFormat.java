package com.ss.solution.tako;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum TakoAudioPCMFormat {
    PCM_NONE(0),
    PCM_S16(1),
    PCM_FLOAT_PLANAR(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static TakoAudioPCMFormat fromId(int i) {
        for (TakoAudioPCMFormat takoAudioPCMFormat : values()) {
            if (takoAudioPCMFormat.value() == i) {
                return takoAudioPCMFormat;
            }
        }
        return PCM_NONE;
    }

    public static TakoAudioPCMFormat valueOf(String str) {
        return (TakoAudioPCMFormat) C08FF.LIZ(TakoAudioPCMFormat.class, str);
    }

    TakoAudioPCMFormat(int i) {
        this.value = i;
    }
}
