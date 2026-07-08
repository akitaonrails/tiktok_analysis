package com.ss.solution.gear_center;

import X.C08FF;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxGearStrategyResultSource {
    Default(-1),
    Manual(0),
    Network(1),
    Performance(2),
    Recommend(3);

    public static final Companion Companion = new Object() { // from class: com.ss.solution.gear_center.LyraxGearStrategyResultSource.Companion
        public final LyraxGearStrategyResultSource fromValue(int i) {
            for (LyraxGearStrategyResultSource lyraxGearStrategyResultSource : LyraxGearStrategyResultSource.values()) {
                if (lyraxGearStrategyResultSource.getValue() == i) {
                    return lyraxGearStrategyResultSource;
                }
            }
            return LyraxGearStrategyResultSource.Default;
        }
    };
    public final int value;

    public static LyraxGearStrategyResultSource valueOf(String str) {
        return (LyraxGearStrategyResultSource) C08FF.LIZ(LyraxGearStrategyResultSource.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    LyraxGearStrategyResultSource(int i) {
        this.value = i;
    }
}
