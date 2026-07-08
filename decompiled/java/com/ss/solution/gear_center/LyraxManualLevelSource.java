package com.ss.solution.gear_center;

import X.C08FF;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxManualLevelSource {
    Default(-1),
    Selected(0),
    ManualProbe(1);

    public static final Companion Companion = new Object() { // from class: com.ss.solution.gear_center.LyraxManualLevelSource.Companion
        public final LyraxManualLevelSource fromValue(int i) {
            for (LyraxManualLevelSource lyraxManualLevelSource : LyraxManualLevelSource.values()) {
                if (lyraxManualLevelSource.getValue() == i) {
                    return lyraxManualLevelSource;
                }
            }
            return LyraxManualLevelSource.Default;
        }
    };
    public final int value;

    public static LyraxManualLevelSource valueOf(String str) {
        return (LyraxManualLevelSource) C08FF.LIZ(LyraxManualLevelSource.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    LyraxManualLevelSource(int i) {
        this.value = i;
    }
}
