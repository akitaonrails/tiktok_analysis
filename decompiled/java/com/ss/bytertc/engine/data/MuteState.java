package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum MuteState {
    MUTE_STATE_OFF(0),
    MUTE_STATE_ON(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return this == MUTE_STATE_ON ? "kMuteStateOn" : "kMuteStateOff";
    }

    public int value() {
        return this.value;
    }

    public static MuteState fromId(int i) {
        for (MuteState muteState : values()) {
            if (muteState.value() == i) {
                return muteState;
            }
        }
        return null;
    }

    public static MuteState valueOf(String str) {
        return (MuteState) C08FF.LIZ(MuteState.class, str);
    }

    MuteState(int i) {
        this.value = i;
    }
}
