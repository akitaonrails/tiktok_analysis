package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum SubscribeFallbackOptions {
    SUBSCRIBE_FALLBACK_OPTIONS_DISABLED(0),
    SUBSCRIBE_FALLBACK_OPTIONS_STREAM_LOW(1),
    SUBSCRIBE_FALLBACK_OPTIONS_AUDIO_ONLY(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static SubscribeFallbackOptions fromId(int i) {
        for (SubscribeFallbackOptions subscribeFallbackOptions : values()) {
            if (subscribeFallbackOptions.value() == i) {
                return subscribeFallbackOptions;
            }
        }
        return null;
    }

    public static SubscribeFallbackOptions valueOf(String str) {
        return (SubscribeFallbackOptions) C08FF.LIZ(SubscribeFallbackOptions.class, str);
    }

    SubscribeFallbackOptions(int i) {
        this.value = i;
    }
}
