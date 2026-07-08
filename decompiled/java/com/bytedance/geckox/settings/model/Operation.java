package com.bytedance.geckox.settings.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class Operation {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ Operation[] $VALUES;

    @C09CT("p")
    public static final Operation PULL = new Operation("PULL", 0);

    @C09CT("c")
    public static final Operation CLEAN = new Operation("CLEAN", 1);

    public static final /* synthetic */ Operation[] $values() {
        return new Operation[]{PULL, CLEAN};
    }

    public static InterfaceC2044707zh<Operation> getEntries() {
        return $ENTRIES;
    }

    static {
        Operation[] operationArr$values = $values();
        $VALUES = operationArr$values;
        $ENTRIES = new C2254308sP(operationArr$values);
    }

    public static Operation[] values() {
        return (Operation[]) $VALUES.clone();
    }

    public static Operation valueOf(String str) {
        return (Operation) C08FF.LIZ(Operation.class, str);
    }

    public Operation(String str, int i) {
    }
}
