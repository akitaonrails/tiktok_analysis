package com.ss.android.ugc.effectmanager.effect.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class AssetParentType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AssetParentType[] $VALUES;
    public final int value;
    public static final AssetParentType EFFECT = new AssetParentType("EFFECT", 0, 1);
    public static final AssetParentType TEMPLATE = new AssetParentType("TEMPLATE", 1, 2);
    public static final AssetParentType SOUNDSYNC = new AssetParentType("SOUNDSYNC", 2, 4);
    public static final AssetParentType AITEMPLATE = new AssetParentType("AITEMPLATE", 3, 5);

    public static final /* synthetic */ AssetParentType[] $values() {
        return new AssetParentType[]{EFFECT, TEMPLATE, SOUNDSYNC, AITEMPLATE};
    }

    public static InterfaceC2044707zh<AssetParentType> getEntries() {
        return $ENTRIES;
    }

    static {
        AssetParentType[] assetParentTypeArr$values = $values();
        $VALUES = assetParentTypeArr$values;
        $ENTRIES = new C2254308sP(assetParentTypeArr$values);
    }

    public static AssetParentType[] values() {
        return (AssetParentType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AssetParentType valueOf(String str) {
        return (AssetParentType) C08FF.LIZ(AssetParentType.class, str);
    }

    public AssetParentType(String str, int i, int i2) {
        this.value = i2;
    }
}
