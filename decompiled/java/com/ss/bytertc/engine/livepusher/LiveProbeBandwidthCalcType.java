package com.ss.bytertc.engine.livepusher;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum LiveProbeBandwidthCalcType {
    LIVE_PROBER_BANDWIDTH_CALC_TYPE_NEWEST(0),
    LIVE_PROBER_BANDWIDTH_CALC_TYPE_MAXAVG(1),
    LIVE_PROBER_BANDWIDTH_CALC_TYPE_FOF(2);

    public final int value;

    public int value() {
        return this.value;
    }

    public static LiveProbeBandwidthCalcType fromId(int i) {
        for (LiveProbeBandwidthCalcType liveProbeBandwidthCalcType : values()) {
            if (liveProbeBandwidthCalcType.value() == i) {
                return liveProbeBandwidthCalcType;
            }
        }
        return null;
    }

    public static LiveProbeBandwidthCalcType valueOf(String str) {
        return (LiveProbeBandwidthCalcType) C08FF.LIZ(LiveProbeBandwidthCalcType.class, str);
    }

    LiveProbeBandwidthCalcType(int i) {
        this.value = i;
    }
}
