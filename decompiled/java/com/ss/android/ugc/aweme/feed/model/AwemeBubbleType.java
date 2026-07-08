package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class AwemeBubbleType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AwemeBubbleType[] $VALUES;
    public static final AwemeBubbleType LEFT = new AwemeBubbleType("LEFT", 0, 1);
    public final int value;

    public static final /* synthetic */ AwemeBubbleType[] $values() {
        return new AwemeBubbleType[]{LEFT};
    }

    public static InterfaceC2044707zh<AwemeBubbleType> getEntries() {
        return $ENTRIES;
    }

    static {
        AwemeBubbleType[] awemeBubbleTypeArr$values = $values();
        $VALUES = awemeBubbleTypeArr$values;
        $ENTRIES = new C2254308sP(awemeBubbleTypeArr$values);
    }

    public static AwemeBubbleType[] values() {
        return (AwemeBubbleType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AwemeBubbleType valueOf(String str) {
        return (AwemeBubbleType) C08FF.LIZ(AwemeBubbleType.class, str);
    }

    public AwemeBubbleType(String str, int i, int i2) {
        this.value = i2;
    }
}
