package com.ss.android.ugc.aweme.verify;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class TTEPFixQRScanEffectApplyAB {
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final TTEPFixQRScanEffectApplyAB INSTANCE = new TTEPFixQRScanEffectApplyAB();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2129));

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public static final boolean isEnabled() {
        return INSTANCE.getValue();
    }
}
