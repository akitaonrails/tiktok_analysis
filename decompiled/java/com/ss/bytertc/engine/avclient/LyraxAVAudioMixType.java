package com.ss.bytertc.engine.avclient;

import X.C08FF;

/* JADX INFO: loaded from: classes10.dex */
public enum LyraxAVAudioMixType {
    PlayOnly,
    ProcessOnly;

    public static LyraxAVAudioMixType valueOf(String str) {
        return (LyraxAVAudioMixType) C08FF.LIZ(LyraxAVAudioMixType.class, str);
    }
}
