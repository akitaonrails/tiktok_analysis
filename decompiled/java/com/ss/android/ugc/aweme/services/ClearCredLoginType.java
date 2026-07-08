package com.ss.android.ugc.aweme.services;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class ClearCredLoginType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ClearCredLoginType[] $VALUES;
    public final String value;
    public static final ClearCredLoginType OCL = new ClearCredLoginType("OCL", 0, "ocl");
    public static final ClearCredLoginType HL = new ClearCredLoginType("HL", 1, "hl");

    public static final /* synthetic */ ClearCredLoginType[] $values() {
        return new ClearCredLoginType[]{OCL, HL};
    }

    public static InterfaceC2044707zh<ClearCredLoginType> getEntries() {
        return $ENTRIES;
    }

    static {
        ClearCredLoginType[] clearCredLoginTypeArr$values = $values();
        $VALUES = clearCredLoginTypeArr$values;
        $ENTRIES = new C2254308sP(clearCredLoginTypeArr$values);
    }

    public static ClearCredLoginType[] values() {
        return (ClearCredLoginType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static ClearCredLoginType valueOf(String str) {
        return (ClearCredLoginType) C08FF.LIZ(ClearCredLoginType.class, str);
    }

    public ClearCredLoginType(String str, int i, String str2) {
        this.value = str2;
    }
}
