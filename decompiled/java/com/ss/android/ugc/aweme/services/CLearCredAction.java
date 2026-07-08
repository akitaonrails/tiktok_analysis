package com.ss.android.ugc.aweme.services;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class CLearCredAction {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CLearCredAction[] $VALUES;
    public final String value;
    public static final CLearCredAction CLEAR = new CLearCredAction("CLEAR", 0, "clear");
    public static final CLearCredAction BLOCK = new CLearCredAction("BLOCK", 1, "block");

    public static final /* synthetic */ CLearCredAction[] $values() {
        return new CLearCredAction[]{CLEAR, BLOCK};
    }

    public static InterfaceC2044707zh<CLearCredAction> getEntries() {
        return $ENTRIES;
    }

    static {
        CLearCredAction[] cLearCredActionArr$values = $values();
        $VALUES = cLearCredActionArr$values;
        $ENTRIES = new C2254308sP(cLearCredActionArr$values);
    }

    public static CLearCredAction[] values() {
        return (CLearCredAction[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static CLearCredAction valueOf(String str) {
        return (CLearCredAction) C08FF.LIZ(CLearCredAction.class, str);
    }

    public CLearCredAction(String str, int i, String str2) {
        this.value = str2;
    }
}
