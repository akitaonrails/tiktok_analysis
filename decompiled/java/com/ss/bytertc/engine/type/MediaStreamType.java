package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum MediaStreamType {
    RTC_MEDIA_STREAM_TYPE_AUDIO(1),
    RTC_MEDIA_STREAM_TYPE_VIDEO(2),
    RTC_MEDIA_STREAM_TYPE_BOTH(3);

    public final int value;

    public static MediaStreamType valueOf(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return RTC_MEDIA_STREAM_TYPE_BOTH;
                }
                return RTC_MEDIA_STREAM_TYPE_BOTH;
            }
            return RTC_MEDIA_STREAM_TYPE_VIDEO;
        }
        return RTC_MEDIA_STREAM_TYPE_AUDIO;
    }

    public static MediaStreamType valueOf(String str) {
        return (MediaStreamType) C08FF.LIZ(MediaStreamType.class, str);
    }

    MediaStreamType(int i) {
        this.value = i;
    }
}
