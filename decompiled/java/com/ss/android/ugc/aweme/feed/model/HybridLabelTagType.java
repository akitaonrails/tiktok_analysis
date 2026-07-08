package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class HybridLabelTagType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ HybridLabelTagType[] $VALUES;
    public final int value;
    public static final HybridLabelTagType UNKNOWN = new HybridLabelTagType("UNKNOWN", 0, 0);
    public static final HybridLabelTagType PRIVACY = new HybridLabelTagType("PRIVACY", 1, 1);
    public static final HybridLabelTagType FRIEND = new HybridLabelTagType("FRIEND", 2, 2);
    public static final HybridLabelTagType FOLLOWING = new HybridLabelTagType("FOLLOWING", 3, 3);
    public static final HybridLabelTagType MAF = new HybridLabelTagType("MAF", 4, 4);

    public static final /* synthetic */ HybridLabelTagType[] $values() {
        return new HybridLabelTagType[]{UNKNOWN, PRIVACY, FRIEND, FOLLOWING, MAF};
    }

    public static InterfaceC2044707zh<HybridLabelTagType> getEntries() {
        return $ENTRIES;
    }

    static {
        HybridLabelTagType[] hybridLabelTagTypeArr$values = $values();
        $VALUES = hybridLabelTagTypeArr$values;
        $ENTRIES = new C2254308sP(hybridLabelTagTypeArr$values);
    }

    public static HybridLabelTagType[] values() {
        return (HybridLabelTagType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static HybridLabelTagType valueOf(String str) {
        return (HybridLabelTagType) C08FF.LIZ(HybridLabelTagType.class, str);
    }

    public HybridLabelTagType(String str, int i, int i2) {
        this.value = i2;
    }
}
