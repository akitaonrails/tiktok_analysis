package com.ss.bytertc.engine.livepusher;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum LiveProbeLevel {
    LIVE_PROBER_LEVEL_480P(1),
    LIVE_PROBER_LEVEL_540P(2),
    LIVE_PROBER_LEVEL_720P(3),
    LIVE_PROBER_LEVEL_1080P(4);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LiveProbeLevel fromId(int i) {
        for (LiveProbeLevel liveProbeLevel : values()) {
            if (liveProbeLevel.value() == i) {
                return liveProbeLevel;
            }
        }
        return null;
    }

    public static LiveProbeLevel valueOf(String str) {
        return (LiveProbeLevel) C08FF.LIZ(LiveProbeLevel.class, str);
    }

    LiveProbeLevel(int i) {
        this.value = i;
    }
}
