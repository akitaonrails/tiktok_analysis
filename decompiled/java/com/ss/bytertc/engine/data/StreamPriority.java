package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum StreamPriority {
    STREAM_PRIORITY_LOW(0),
    STREAM_PRIORITY_MEDIAM(1),
    STREAM_PRIORITY_HIGH(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static StreamPriority fromId(int i) {
        for (StreamPriority streamPriority : values()) {
            if (streamPriority.value() == i) {
                return streamPriority;
            }
        }
        return null;
    }

    public static StreamPriority valueOf(String str) {
        return (StreamPriority) C08FF.LIZ(StreamPriority.class, str);
    }

    StreamPriority(int i) {
        this.value = i;
    }
}
