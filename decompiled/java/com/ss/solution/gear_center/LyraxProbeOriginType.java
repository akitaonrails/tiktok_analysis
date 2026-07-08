package com.ss.solution.gear_center;

import X.C08FF;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxProbeOriginType {
    Default(-1),
    Auto(0),
    Manual(1);

    public static final Companion Companion = new Object() { // from class: com.ss.solution.gear_center.LyraxProbeOriginType.Companion
        public final LyraxProbeOriginType fromValue(int i) {
            for (LyraxProbeOriginType lyraxProbeOriginType : LyraxProbeOriginType.values()) {
                if (lyraxProbeOriginType.getValue() == i) {
                    return lyraxProbeOriginType;
                }
            }
            return LyraxProbeOriginType.Default;
        }
    };
    public final int value;

    public static LyraxProbeOriginType valueOf(String str) {
        return (LyraxProbeOriginType) C08FF.LIZ(LyraxProbeOriginType.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    LyraxProbeOriginType(int i) {
        this.value = i;
    }
}
