package com.ss.solution.gear_center;

import X.C08FF;

/* JADX INFO: loaded from: classes35.dex */
public enum LyraxProbeNetworkType {
    Wifi(0),
    Mobile(1);

    public static final Companion Companion = new Object() { // from class: com.ss.solution.gear_center.LyraxProbeNetworkType.Companion
        public final LyraxProbeNetworkType fromValue(int i) {
            for (LyraxProbeNetworkType lyraxProbeNetworkType : LyraxProbeNetworkType.values()) {
                if (lyraxProbeNetworkType.getValue() == i) {
                    return lyraxProbeNetworkType;
                }
            }
            return LyraxProbeNetworkType.Wifi;
        }
    };
    public final int value;

    public static LyraxProbeNetworkType valueOf(String str) {
        return (LyraxProbeNetworkType) C08FF.LIZ(LyraxProbeNetworkType.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    LyraxProbeNetworkType(int i) {
        this.value = i;
    }
}
