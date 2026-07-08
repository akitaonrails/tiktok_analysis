package com.ss.android.ugc.effectmanager.effect.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class AssetConsumerType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AssetConsumerType[] $VALUES;
    public final int value;
    public static final AssetConsumerType FILTER = new AssetConsumerType("FILTER", 0, 1);
    public static final AssetConsumerType EDIT_EFFECT = new AssetConsumerType("EDIT_EFFECT", 1, 2);
    public static final AssetConsumerType CC_TEMPLATE = new AssetConsumerType("CC_TEMPLATE", 2, 3);
    public static final AssetConsumerType SOUND_SYNC = new AssetConsumerType("SOUND_SYNC", 3, 4);
    public static final AssetConsumerType AI_TEMPLATE = new AssetConsumerType("AI_TEMPLATE", 4, 5);
    public static final AssetConsumerType AI_ALIVE_TEMPLATE = new AssetConsumerType("AI_ALIVE_TEMPLATE", 5, 6);
    public static final AssetConsumerType EOY_INSERT_TEMPLATE = new AssetConsumerType("EOY_INSERT_TEMPLATE", 6, 98);
    public static final AssetConsumerType AUTOCUT_INSERT_TEMPLATE = new AssetConsumerType("AUTOCUT_INSERT_TEMPLATE", 7, 99);
    public static final AssetConsumerType AUTOPICK_INSERT_TEMPLATE = new AssetConsumerType("AUTOPICK_INSERT_TEMPLATE", 8, 100);

    public static final /* synthetic */ AssetConsumerType[] $values() {
        return new AssetConsumerType[]{FILTER, EDIT_EFFECT, CC_TEMPLATE, SOUND_SYNC, AI_TEMPLATE, AI_ALIVE_TEMPLATE, EOY_INSERT_TEMPLATE, AUTOCUT_INSERT_TEMPLATE, AUTOPICK_INSERT_TEMPLATE};
    }

    public static InterfaceC2044707zh<AssetConsumerType> getEntries() {
        return $ENTRIES;
    }

    static {
        AssetConsumerType[] assetConsumerTypeArr$values = $values();
        $VALUES = assetConsumerTypeArr$values;
        $ENTRIES = new C2254308sP(assetConsumerTypeArr$values);
    }

    public static AssetConsumerType[] values() {
        return (AssetConsumerType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AssetConsumerType valueOf(String str) {
        return (AssetConsumerType) C08FF.LIZ(AssetConsumerType.class, str);
    }

    public AssetConsumerType(String str, int i, int i2) {
        this.value = i2;
    }
}
