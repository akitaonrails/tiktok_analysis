package com.ss.android.ugc.aweme.benchmark;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class BTCHMode {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ BTCHMode[] $VALUES;
    public final String value;
    public static final BTCHMode NORMAL = new BTCHMode("NORMAL", 0, "normal");
    public static final BTCHMode NOT_LOGIN = new BTCHMode("NOT_LOGIN", 1, "notlogin");
    public static final BTCHMode KIDS = new BTCHMode("KIDS", 2, "kids");

    public static final /* synthetic */ BTCHMode[] $values() {
        return new BTCHMode[]{NORMAL, NOT_LOGIN, KIDS};
    }

    public static InterfaceC2044707zh<BTCHMode> getEntries() {
        return $ENTRIES;
    }

    static {
        BTCHMode[] bTCHModeArr$values = $values();
        $VALUES = bTCHModeArr$values;
        $ENTRIES = new C2254308sP(bTCHModeArr$values);
    }

    public static BTCHMode[] values() {
        return (BTCHMode[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static BTCHMode valueOf(String str) {
        return (BTCHMode) C08FF.LIZ(BTCHMode.class, str);
    }

    public BTCHMode(String str, int i, String str2) {
        this.value = str2;
    }
}
