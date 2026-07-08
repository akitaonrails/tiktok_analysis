package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum PauseResumeControlMediaType {
    AUDIO(0),
    VIDEO(1),
    AUDIO_AND_VIDEO(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static PauseResumeControlMediaType valueOf(String str) {
        return (PauseResumeControlMediaType) C08FF.LIZ(PauseResumeControlMediaType.class, str);
    }

    PauseResumeControlMediaType(int i) {
        this.value = i;
    }
}
