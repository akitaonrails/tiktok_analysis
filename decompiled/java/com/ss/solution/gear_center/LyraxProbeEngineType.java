package com.ss.solution.gear_center;

import X.C08FF;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxProbeEngineType {
    Default(-1),
    Lyrax(0);

    public static final Companion Companion = new Object() { // from class: com.ss.solution.gear_center.LyraxProbeEngineType.Companion
        public final LyraxProbeEngineType fromValue(int i) {
            for (LyraxProbeEngineType lyraxProbeEngineType : LyraxProbeEngineType.values()) {
                if (lyraxProbeEngineType.getValue() == i) {
                    return lyraxProbeEngineType;
                }
            }
            return LyraxProbeEngineType.Default;
        }
    };
    public final int value;

    public static LyraxProbeEngineType valueOf(String str) {
        return (LyraxProbeEngineType) C08FF.LIZ(LyraxProbeEngineType.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    LyraxProbeEngineType(int i) {
        this.value = i;
    }
}
