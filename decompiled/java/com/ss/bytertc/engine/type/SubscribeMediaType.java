package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes13.dex */
public enum SubscribeMediaType {
    NONE(0),
    AUDIO_ONLY(1),
    VIDEO_ONLY(2),
    AUDIO_AND_VIDEO(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static SubscribeMediaType valueOf(String str) {
        return (SubscribeMediaType) C08FF.LIZ(SubscribeMediaType.class, str);
    }

    SubscribeMediaType(int i) {
        this.value = i;
    }
}
