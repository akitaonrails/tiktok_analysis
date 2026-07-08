package com.ss.android.ugc.effectmanager.effect.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class AssetFrom {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AssetFrom[] $VALUES;
    public final int value;
    public static final AssetFrom OTHERS = new AssetFrom("OTHERS", 0, 0);
    public static final AssetFrom RECOMMEND = new AssetFrom("RECOMMEND", 1, 1);
    public static final AssetFrom OPERATIONAL_INSERT = new AssetFrom("OPERATIONAL_INSERT", 2, 2);
    public static final AssetFrom CLIENT_INSERT = new AssetFrom("CLIENT_INSERT", 3, 3);

    public static final /* synthetic */ AssetFrom[] $values() {
        return new AssetFrom[]{OTHERS, RECOMMEND, OPERATIONAL_INSERT, CLIENT_INSERT};
    }

    public static InterfaceC2044707zh<AssetFrom> getEntries() {
        return $ENTRIES;
    }

    static {
        AssetFrom[] assetFromArr$values = $values();
        $VALUES = assetFromArr$values;
        $ENTRIES = new C2254308sP(assetFromArr$values);
    }

    public static AssetFrom[] values() {
        return (AssetFrom[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AssetFrom valueOf(String str) {
        return (AssetFrom) C08FF.LIZ(AssetFrom.class, str);
    }

    public AssetFrom(String str, int i, int i2) {
        this.value = i2;
    }
}
