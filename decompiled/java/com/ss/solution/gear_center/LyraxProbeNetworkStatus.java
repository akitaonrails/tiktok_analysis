package com.ss.solution.gear_center;

import X.C08FF;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxProbeNetworkStatus {
    Ok(0),
    NotReachable(1);

    public static final Companion Companion = new Object() { // from class: com.ss.solution.gear_center.LyraxProbeNetworkStatus.Companion
        public final LyraxProbeNetworkStatus fromValue(int i) {
            for (LyraxProbeNetworkStatus lyraxProbeNetworkStatus : LyraxProbeNetworkStatus.values()) {
                if (lyraxProbeNetworkStatus.getValue() == i) {
                    return lyraxProbeNetworkStatus;
                }
            }
            return LyraxProbeNetworkStatus.Ok;
        }
    };
    public final int value;

    public static LyraxProbeNetworkStatus valueOf(String str) {
        return (LyraxProbeNetworkStatus) C08FF.LIZ(LyraxProbeNetworkStatus.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    LyraxProbeNetworkStatus(int i) {
        this.value = i;
    }
}
