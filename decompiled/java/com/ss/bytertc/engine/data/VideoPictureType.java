package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum VideoPictureType {
    VIDEO_PICTURE_TYPE_UNKNOWN(0),
    VIDEO_PICTURE_TYPE_I(1),
    VIDEO_PICTURE_TYPE_P(2),
    VIDEO_PICTURE_TYPE_B(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static VideoPictureType fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return VIDEO_PICTURE_TYPE_B;
                }
                return VIDEO_PICTURE_TYPE_P;
            }
            return VIDEO_PICTURE_TYPE_I;
        }
        return VIDEO_PICTURE_TYPE_UNKNOWN;
    }

    public static VideoPictureType valueOf(String str) {
        return (VideoPictureType) C08FF.LIZ(VideoPictureType.class, str);
    }

    VideoPictureType(int i) {
        this.value = i;
    }
}
