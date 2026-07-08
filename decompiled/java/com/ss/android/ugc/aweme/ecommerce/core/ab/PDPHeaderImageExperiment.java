package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class PDPHeaderImageExperiment {
    public static final PDPHeaderImageExperiment INSTANCE = new PDPHeaderImageExperiment();
    public static final PDPImageConfig none = new PDPImageConfig(0);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(96));
    public static final int $stable = 8;

    private final PDPImageConfig getConfig() {
        return (PDPImageConfig) config$delegate.getValue();
    }

    public final boolean isProgressiveSwitch() {
        return getConfig().progressiveSwitch == 1;
    }
}
