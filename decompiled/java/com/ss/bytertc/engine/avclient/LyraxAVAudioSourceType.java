package com.ss.bytertc.engine.avclient;

import X.C08FF;

/* JADX INFO: loaded from: classes10.dex */
public enum LyraxAVAudioSourceType {
    PCM;

    public static LyraxAVAudioSourceType valueOf(String str) {
        return (LyraxAVAudioSourceType) C08FF.LIZ(LyraxAVAudioSourceType.class, str);
    }
}
