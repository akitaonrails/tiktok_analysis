package com.ss.bytertc.engine.livepusher;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum LiveProbeFailReason {
    LIVE_PROBER_FAIL_REASON_NOT_CONNECTED(1),
    LIVE_PROBER_FAIL_REASON_PROBE_ERROR(2),
    LIVE_PROBER_FAIL_REASON_PACKET_SEND_TIME_TOO_SHORT(3);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LiveProbeFailReason fromId(int i) {
        for (LiveProbeFailReason liveProbeFailReason : values()) {
            if (liveProbeFailReason.value() == i) {
                return liveProbeFailReason;
            }
        }
        return null;
    }

    public static LiveProbeFailReason valueOf(String str) {
        return (LiveProbeFailReason) C08FF.LIZ(LiveProbeFailReason.class, str);
    }

    LiveProbeFailReason(int i) {
        this.value = i;
    }
}
