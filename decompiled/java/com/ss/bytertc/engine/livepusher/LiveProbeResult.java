package com.ss.bytertc.engine.livepusher;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LiveProbeResult {
    LIVE_PROBER_SUCCESS(1),
    LIVE_PROBER_FAILED(2),
    LIVE_PROBER_STOP_MANUALLY(3);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LiveProbeResult fromId(int i) {
        for (LiveProbeResult liveProbeResult : values()) {
            if (liveProbeResult.value() == i) {
                return liveProbeResult;
            }
        }
        return null;
    }

    public static LiveProbeResult valueOf(String str) {
        return (LiveProbeResult) C08FF.LIZ(LiveProbeResult.class, str);
    }

    LiveProbeResult(int i) {
        this.value = i;
    }
}
