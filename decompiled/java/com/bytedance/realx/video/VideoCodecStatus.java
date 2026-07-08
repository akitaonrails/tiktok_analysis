package com.bytedance.realx.video;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum VideoCodecStatus {
    OK(0),
    ERR_PARAMETER(3001),
    ERR_SIZE(3001),
    LEVEL_EXCEEDED(3001),
    UNINITIALIZED(4002),
    MEMORY(4003),
    ERROR(4003),
    TIMEOUT(4007),
    NO_OUTPUT(2002),
    FALLBACK_SOFTWARE(4009),
    MEDIACODEC_EXCEPTION(2006),
    USING_INTERNAL_SURFACE(2007),
    OVERLOAD(4005),
    MEDIACODEC_OUT_OF_RESOLUTION(2008),
    DROP_DECODED_FRAME(2002);

    public final int number;

    public int getNumber() {
        return this.number;
    }

    public static VideoCodecStatus valueOf(String str) {
        return (VideoCodecStatus) C08FF.LIZ(VideoCodecStatus.class, str);
    }

    VideoCodecStatus(int i) {
        this.number = i;
    }
}
