package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class AwemeBubbleBusiness {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AwemeBubbleBusiness[] $VALUES;
    public static final AwemeBubbleBusiness PROMOTE = new AwemeBubbleBusiness("PROMOTE", 0, 1);
    public final int value;

    public static final /* synthetic */ AwemeBubbleBusiness[] $values() {
        return new AwemeBubbleBusiness[]{PROMOTE};
    }

    public static InterfaceC2044707zh<AwemeBubbleBusiness> getEntries() {
        return $ENTRIES;
    }

    static {
        AwemeBubbleBusiness[] awemeBubbleBusinessArr$values = $values();
        $VALUES = awemeBubbleBusinessArr$values;
        $ENTRIES = new C2254308sP(awemeBubbleBusinessArr$values);
    }

    public static AwemeBubbleBusiness[] values() {
        return (AwemeBubbleBusiness[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AwemeBubbleBusiness valueOf(String str) {
        return (AwemeBubbleBusiness) C08FF.LIZ(AwemeBubbleBusiness.class, str);
    }

    public AwemeBubbleBusiness(String str, int i, int i2) {
        this.value = i2;
    }
}
