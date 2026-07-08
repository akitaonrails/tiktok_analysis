package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum PublishFallbackOption {
    DISABLE(0),
    SIMULCAST_SMALL_VIDEO_ONLY(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static PublishFallbackOption fromId(int i) {
        for (PublishFallbackOption publishFallbackOption : values()) {
            if (publishFallbackOption.value() == i) {
                return publishFallbackOption;
            }
        }
        return null;
    }

    public static PublishFallbackOption valueOf(String str) {
        return (PublishFallbackOption) C08FF.LIZ(PublishFallbackOption.class, str);
    }

    PublishFallbackOption(int i) {
        this.value = i;
    }
}
