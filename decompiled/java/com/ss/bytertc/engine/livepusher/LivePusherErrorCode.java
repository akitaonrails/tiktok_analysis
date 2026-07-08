package com.ss.bytertc.engine.livepusher;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum LivePusherErrorCode {
    Live_Pusher_Transport_Error(-7),
    LIVE_PUSHER_FALLBACK(-100),
    LIVE_PUSHER_OPEN_API_FORBIDDEN(-101),
    LIVE_PUSHER_RTMP_FORBIDDEN(-102),
    LIVE_PUSHER_RTMP_AUTHENTICATION_FAILED(-103),
    LIVE_PUSHER_RTMP_DUPLICATE_STREAM(-104);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LivePusherErrorCode fromId(int i) {
        for (LivePusherErrorCode livePusherErrorCode : values()) {
            if (livePusherErrorCode.value() == i) {
                return livePusherErrorCode;
            }
        }
        return null;
    }

    public static LivePusherErrorCode valueOf(String str) {
        return (LivePusherErrorCode) C08FF.LIZ(LivePusherErrorCode.class, str);
    }

    LivePusherErrorCode(int i) {
        this.value = i;
    }
}
