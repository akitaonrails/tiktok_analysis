package com.ss.android.ugc.aweme.feed.model.live;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class Benefit {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ Benefit[] $VALUES;
    public final int value;
    public static final Benefit UNKNOWN = new Benefit("UNKNOWN", 0, 0);
    public static final Benefit PREVIEW_PROMOTION = new Benefit("PREVIEW_PROMOTION", 1, 1);
    public static final Benefit GIVE_AWAY = new Benefit("GIVE_AWAY", 2, 2);
    public static final Benefit BRAND = new Benefit("BRAND", 3, 3);
    public static final Benefit CATEGORY = new Benefit("CATEGORY", 4, 4);

    public static final /* synthetic */ Benefit[] $values() {
        return new Benefit[]{UNKNOWN, PREVIEW_PROMOTION, GIVE_AWAY, BRAND, CATEGORY};
    }

    public static InterfaceC2044707zh<Benefit> getEntries() {
        return $ENTRIES;
    }

    static {
        Benefit[] benefitArr$values = $values();
        $VALUES = benefitArr$values;
        $ENTRIES = new C2254308sP(benefitArr$values);
    }

    public static Benefit[] values() {
        return (Benefit[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static Benefit valueOf(String str) {
        return (Benefit) C08FF.LIZ(Benefit.class, str);
    }

    public Benefit(String str, int i, int i2) {
        this.value = i2;
    }
}
