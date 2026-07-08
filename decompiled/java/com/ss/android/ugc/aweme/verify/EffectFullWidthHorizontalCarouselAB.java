package com.ss.android.ugc.aweme.verify;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class EffectFullWidthHorizontalCarouselAB {
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final EffectFullWidthHorizontalCarouselAB INSTANCE = new EffectFullWidthHorizontalCarouselAB();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(709));

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public static final boolean isEnabled() {
        return INSTANCE.getValue();
    }
}
