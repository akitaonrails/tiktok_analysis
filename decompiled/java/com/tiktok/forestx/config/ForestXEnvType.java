package com.tiktok.forestx.config;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ForestXEnvType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ForestXEnvType[] $VALUES;
    public static final ForestXEnvType PPE = new ForestXEnvType("PPE", 0);
    public static final ForestXEnvType BOE = new ForestXEnvType("BOE", 1);

    public static final /* synthetic */ ForestXEnvType[] $values() {
        return new ForestXEnvType[]{PPE, BOE};
    }

    public static InterfaceC2044707zh<ForestXEnvType> getEntries() {
        return $ENTRIES;
    }

    static {
        ForestXEnvType[] forestXEnvTypeArr$values = $values();
        $VALUES = forestXEnvTypeArr$values;
        $ENTRIES = new C2254308sP(forestXEnvTypeArr$values);
    }

    public static ForestXEnvType[] values() {
        return (ForestXEnvType[]) $VALUES.clone();
    }

    public static ForestXEnvType valueOf(String str) {
        return (ForestXEnvType) C08FF.LIZ(ForestXEnvType.class, str);
    }

    public ForestXEnvType(String str, int i) {
    }
}
