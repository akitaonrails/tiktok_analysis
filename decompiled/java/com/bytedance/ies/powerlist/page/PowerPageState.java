package com.bytedance.ies.powerlist.page;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes32.dex */
public final class PowerPageState {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PowerPageState[] $VALUES;
    public final int value;
    public static final PowerPageState Reset = new PowerPageState("Reset", 0, 0);
    public static final PowerPageState Loading = new PowerPageState("Loading", 1, 1);
    public static final PowerPageState Loaded = new PowerPageState("Loaded", 2, 2);
    public static final PowerPageState Error = new PowerPageState("Error", 3, 3);
    public static final PowerPageState End = new PowerPageState("End", 4, 4);

    public static final /* synthetic */ PowerPageState[] $values() {
        return new PowerPageState[]{Reset, Loading, Loaded, Error, End};
    }

    public static InterfaceC2044707zh<PowerPageState> getEntries() {
        return $ENTRIES;
    }

    static {
        PowerPageState[] powerPageStateArr$values = $values();
        $VALUES = powerPageStateArr$values;
        $ENTRIES = new C2254308sP(powerPageStateArr$values);
    }

    public static PowerPageState[] values() {
        return (PowerPageState[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static PowerPageState valueOf(String str) {
        return (PowerPageState) C08FF.LIZ(PowerPageState.class, str);
    }

    public PowerPageState(String str, int i, int i2) {
        this.value = i2;
    }
}
