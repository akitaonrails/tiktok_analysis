package com.ss.solution.gear_center;

import X.C08FF;

/* JADX INFO: loaded from: classes36.dex */
public enum LyraxGearLiveType {
    Stage(0),
    Game(1);

    public static final Companion Companion = new Object() { // from class: com.ss.solution.gear_center.LyraxGearLiveType.Companion
        public final LyraxGearLiveType fromValue(int i) {
            for (LyraxGearLiveType lyraxGearLiveType : LyraxGearLiveType.values()) {
                if (lyraxGearLiveType.getValue() == i) {
                    return lyraxGearLiveType;
                }
            }
            return LyraxGearLiveType.Stage;
        }
    };
    public final int value;

    public static LyraxGearLiveType valueOf(String str) {
        return (LyraxGearLiveType) C08FF.LIZ(LyraxGearLiveType.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    LyraxGearLiveType(int i) {
        this.value = i;
    }
}
