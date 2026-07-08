package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum VideoContentType {
    NORMAL_FRAME(0),
    BLACK_FRAME(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return this == NORMAL_FRAME ? "kVideoContentTypeNormalFrame" : "kVideoContentTypeBlackFrame";
    }

    public int value() {
        return this.value;
    }

    public static VideoContentType fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BLACK_FRAME;
        }
        return NORMAL_FRAME;
    }

    public static VideoContentType valueOf(String str) {
        return (VideoContentType) C08FF.LIZ(VideoContentType.class, str);
    }

    VideoContentType(int i) {
        this.value = i;
    }
}
