package com.ss.solution.gear_center;

import X.C08FF;

/* JADX INFO: loaded from: classes35.dex */
public enum LyraxProbeNetworkGrade {
    Default(-1),
    Poor(0),
    Normal(1),
    Good(2);

    public static final Companion Companion = new Object() { // from class: com.ss.solution.gear_center.LyraxProbeNetworkGrade.Companion
        public final LyraxProbeNetworkGrade fromValue(int i) {
            for (LyraxProbeNetworkGrade lyraxProbeNetworkGrade : LyraxProbeNetworkGrade.values()) {
                if (lyraxProbeNetworkGrade.getValue() == i) {
                    return lyraxProbeNetworkGrade;
                }
            }
            return LyraxProbeNetworkGrade.Default;
        }
    };
    public final int value;

    public static LyraxProbeNetworkGrade valueOf(String str) {
        return (LyraxProbeNetworkGrade) C08FF.LIZ(LyraxProbeNetworkGrade.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    LyraxProbeNetworkGrade(int i) {
        this.value = i;
    }
}
