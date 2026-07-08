package com.ss.android.ugc.aweme.localservice.passthrough.settings;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class LSPassThroughInitTechTrackRateConfig {
    public static final LSPassThroughInitTechTrackRateConfig INSTANCE = new LSPassThroughInitTechTrackRateConfig();
    public static final float defaultRate = 0.001f;
    public static final C01GW rate$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(508));

    private final float getRate() {
        return ((Number) rate$delegate.getValue()).floatValue();
    }

    public final float rate() {
        return getRate();
    }

    public final float getDefaultRate() {
        return defaultRate;
    }
}
