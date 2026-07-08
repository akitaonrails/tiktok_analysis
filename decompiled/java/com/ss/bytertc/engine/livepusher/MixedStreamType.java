package com.ss.bytertc.engine.livepusher;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum MixedStreamType {
    MIXED_STREAM_TYPE_BY_SERVER(0),
    MIXED_STREAM_TYPE_BY_CLIENT(1);

    public final int value;

    public int value() {
        return this.value;
    }

    public static MixedStreamType fromId(int i) {
        for (MixedStreamType mixedStreamType : values()) {
            if (mixedStreamType.value() == i) {
                return mixedStreamType;
            }
        }
        return null;
    }

    public static MixedStreamType valueOf(String str) {
        return (MixedStreamType) C08FF.LIZ(MixedStreamType.class, str);
    }

    MixedStreamType(int i) {
        this.value = i;
    }
}
