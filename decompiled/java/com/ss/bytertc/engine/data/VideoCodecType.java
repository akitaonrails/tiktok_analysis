package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum VideoCodecType {
    VIDEO_CODEC_TYPE_UNKNOWN(0),
    VIDEO_CODEC_TYPE_H264(1),
    VIDEO_CODEC_TYPE_BYTEVC1(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static VideoCodecType fromId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VIDEO_CODEC_TYPE_BYTEVC1;
            }
            return VIDEO_CODEC_TYPE_H264;
        }
        return VIDEO_CODEC_TYPE_UNKNOWN;
    }

    public static VideoCodecType valueOf(String str) {
        return (VideoCodecType) C08FF.LIZ(VideoCodecType.class, str);
    }

    VideoCodecType(int i) {
        this.value = i;
    }
}
