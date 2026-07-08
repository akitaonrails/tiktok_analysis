package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum VideoSourceType {
    VIDEO_SOURCE_TYPE_EXTERNAL(0),
    VIDEO_SOURCE_TYPE_INTERNAL(1),
    VIDEO_SOURCE_TYPE_ENCODED_WITH_SIMULCAST(2),
    VIDEO_SOURCE_TYPE_ENCODED_WITHOUT_SIMULCAST(3),
    VIDEO_SOURCE_TYPE_FILE(4);

    public int value;

    public int value() {
        return this.value;
    }

    public static VideoSourceType fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VIDEO_SOURCE_TYPE_FILE;
                    }
                    return VIDEO_SOURCE_TYPE_ENCODED_WITHOUT_SIMULCAST;
                }
                return VIDEO_SOURCE_TYPE_ENCODED_WITH_SIMULCAST;
            }
            return VIDEO_SOURCE_TYPE_INTERNAL;
        }
        return VIDEO_SOURCE_TYPE_EXTERNAL;
    }

    public static VideoSourceType valueOf(String str) {
        return (VideoSourceType) C08FF.LIZ(VideoSourceType.class, str);
    }

    VideoSourceType(int i) {
        this.value = i;
    }
}
