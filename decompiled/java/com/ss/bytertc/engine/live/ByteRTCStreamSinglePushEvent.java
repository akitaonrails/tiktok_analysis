package com.ss.bytertc.engine.live;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum ByteRTCStreamSinglePushEvent {
    SINGLE_STREAM_PUSH_BASE(0),
    SINGLE_STREAM_PUSH_START(1),
    SINGLE_STREAM_PUSH_SUCCESS(2),
    SINGLE_STREAM_PUSH_FAILED(3),
    SINGLE_STREAM_PUSH_STOP(4),
    SINGLE_STREAM_PUSH_TIMEOUT(5),
    SINGLE_STREAM_PUSH_PARAM_ERROR(6);

    public int value;

    public int value() {
        return this.value;
    }

    public static ByteRTCStreamSinglePushEvent fromId(int i) {
        for (ByteRTCStreamSinglePushEvent byteRTCStreamSinglePushEvent : values()) {
            if (byteRTCStreamSinglePushEvent.value() == i) {
                return byteRTCStreamSinglePushEvent;
            }
        }
        return null;
    }

    public static ByteRTCStreamSinglePushEvent valueOf(String str) {
        return (ByteRTCStreamSinglePushEvent) C08FF.LIZ(ByteRTCStreamSinglePushEvent.class, str);
    }

    ByteRTCStreamSinglePushEvent(int i) {
        this.value = i;
    }
}
