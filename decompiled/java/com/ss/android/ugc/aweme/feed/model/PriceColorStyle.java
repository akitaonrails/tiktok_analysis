package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class PriceColorStyle {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PriceColorStyle[] $VALUES;
    public static final PriceColorStyle BLACK = new PriceColorStyle("BLACK", 0, 0);
    public static final PriceColorStyle RED = new PriceColorStyle("RED", 1, 1);
    public final int value;

    public static final /* synthetic */ PriceColorStyle[] $values() {
        return new PriceColorStyle[]{BLACK, RED};
    }

    public static InterfaceC2044707zh<PriceColorStyle> getEntries() {
        return $ENTRIES;
    }

    static {
        PriceColorStyle[] priceColorStyleArr$values = $values();
        $VALUES = priceColorStyleArr$values;
        $ENTRIES = new C2254308sP(priceColorStyleArr$values);
    }

    public static PriceColorStyle[] values() {
        return (PriceColorStyle[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static PriceColorStyle valueOf(String str) {
        return (PriceColorStyle) C08FF.LIZ(PriceColorStyle.class, str);
    }

    public PriceColorStyle(String str, int i, int i2) {
        this.value = i2;
    }
}
