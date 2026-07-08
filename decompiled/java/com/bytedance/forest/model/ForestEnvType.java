package com.bytedance.forest.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ForestEnvType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ForestEnvType[] $VALUES;
    public static final ForestEnvType PPE = new ForestEnvType("PPE", 0);
    public static final ForestEnvType BOE = new ForestEnvType("BOE", 1);

    public static final /* synthetic */ ForestEnvType[] $values() {
        return new ForestEnvType[]{PPE, BOE};
    }

    public static InterfaceC2044707zh<ForestEnvType> getEntries() {
        return $ENTRIES;
    }

    static {
        ForestEnvType[] forestEnvTypeArr$values = $values();
        $VALUES = forestEnvTypeArr$values;
        $ENTRIES = new C2254308sP(forestEnvTypeArr$values);
    }

    public static ForestEnvType[] values() {
        return (ForestEnvType[]) $VALUES.clone();
    }

    public static ForestEnvType valueOf(String str) {
        return (ForestEnvType) C08FF.LIZ(ForestEnvType.class, str);
    }

    public ForestEnvType(String str, int i) {
    }
}
