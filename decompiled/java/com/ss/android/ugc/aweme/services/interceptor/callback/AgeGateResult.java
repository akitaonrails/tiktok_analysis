package com.ss.android.ugc.aweme.services.interceptor.callback;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes28.dex */
public final class AgeGateResult {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AgeGateResult[] $VALUES;
    public final int value;
    public static final AgeGateResult SUCCESS = new AgeGateResult("SUCCESS", 0, 0);
    public static final AgeGateResult UNDERAGE = new AgeGateResult("UNDERAGE", 1, 1);
    public static final AgeGateResult DEVICE_BLOCK = new AgeGateResult("DEVICE_BLOCK", 2, 2);
    public static final AgeGateResult ERROR = new AgeGateResult("ERROR", 3, 3);
    public static final AgeGateResult CANCEL = new AgeGateResult("CANCEL", 4, 4);

    public static final /* synthetic */ AgeGateResult[] $values() {
        return new AgeGateResult[]{SUCCESS, UNDERAGE, DEVICE_BLOCK, ERROR, CANCEL};
    }

    public static InterfaceC2044707zh<AgeGateResult> getEntries() {
        return $ENTRIES;
    }

    static {
        AgeGateResult[] ageGateResultArr$values = $values();
        $VALUES = ageGateResultArr$values;
        $ENTRIES = new C2254308sP(ageGateResultArr$values);
    }

    public static AgeGateResult[] values() {
        return (AgeGateResult[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AgeGateResult valueOf(String str) {
        return (AgeGateResult) C08FF.LIZ(AgeGateResult.class, str);
    }

    public AgeGateResult(String str, int i, int i2) {
        this.value = i2;
    }
}
