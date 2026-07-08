package com.ss.solution.gear_center;

import X.C08FF;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxGearStrategyScene {
    Recommend(0),
    Final(1);

    public static final Companion Companion = new Object() { // from class: com.ss.solution.gear_center.LyraxGearStrategyScene.Companion
        public final LyraxGearStrategyScene fromValue(int i) {
            for (LyraxGearStrategyScene lyraxGearStrategyScene : LyraxGearStrategyScene.values()) {
                if (lyraxGearStrategyScene.getValue() == i) {
                    return lyraxGearStrategyScene;
                }
            }
            return LyraxGearStrategyScene.Recommend;
        }
    };
    public final int value;

    public static LyraxGearStrategyScene valueOf(String str) {
        return (LyraxGearStrategyScene) C08FF.LIZ(LyraxGearStrategyScene.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    LyraxGearStrategyScene(int i) {
        this.value = i;
    }
}
