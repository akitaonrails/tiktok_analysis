package com.bytedance.router.fragment;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes31.dex */
public final class PushType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PushType[] $VALUES;
    public static final PushType ADD = new PushType("ADD", 0);
    public static final PushType REPLACE = new PushType("REPLACE", 1);

    public static final /* synthetic */ PushType[] $values() {
        return new PushType[]{ADD, REPLACE};
    }

    public static InterfaceC2044707zh<PushType> getEntries() {
        return $ENTRIES;
    }

    static {
        PushType[] pushTypeArr$values = $values();
        $VALUES = pushTypeArr$values;
        $ENTRIES = new C2254308sP(pushTypeArr$values);
    }

    public static PushType[] values() {
        return (PushType[]) $VALUES.clone();
    }

    public static PushType valueOf(String str) {
        return (PushType) C08FF.LIZ(PushType.class, str);
    }

    public PushType(String str, int i) {
    }
}
