package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum NetworkDetectionStopReason {
    USER(0),
    TIMEOUT(1),
    CONNECTION_LOST(2),
    STREAMING(3),
    INNER_ERR(4);

    public int value;

    public int value() {
        return this.value;
    }

    public static NetworkDetectionStopReason fromId(int i) {
        for (NetworkDetectionStopReason networkDetectionStopReason : values()) {
            if (networkDetectionStopReason.value() == i) {
                return networkDetectionStopReason;
            }
        }
        return USER;
    }

    public static NetworkDetectionStopReason valueOf(String str) {
        return (NetworkDetectionStopReason) C08FF.LIZ(NetworkDetectionStopReason.class, str);
    }

    NetworkDetectionStopReason(int i) {
        this.value = i;
    }
}
