package com.ss.android.ugc.aweme.services.effect;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes31.dex */
public final class EffectType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EffectType[] $VALUES;
    public static final EffectType NORMAL = new EffectType("NORMAL", 0);
    public static final EffectType FONT = new EffectType("FONT", 1);

    public static final /* synthetic */ EffectType[] $values() {
        return new EffectType[]{NORMAL, FONT};
    }

    public static InterfaceC2044707zh<EffectType> getEntries() {
        return $ENTRIES;
    }

    static {
        EffectType[] effectTypeArr$values = $values();
        $VALUES = effectTypeArr$values;
        $ENTRIES = new C2254308sP(effectTypeArr$values);
    }

    public static EffectType[] values() {
        return (EffectType[]) $VALUES.clone();
    }

    public static EffectType valueOf(String str) {
        return (EffectType) C08FF.LIZ(EffectType.class, str);
    }

    public EffectType(String str, int i) {
    }
}
