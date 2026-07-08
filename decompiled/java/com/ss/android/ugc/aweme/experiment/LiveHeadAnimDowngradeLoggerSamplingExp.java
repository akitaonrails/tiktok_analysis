package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveHeadAnimDowngradeLoggerSamplingExp {
    public static final float DEFAULT = 0.0f;
    public static final LiveHeadAnimDowngradeLoggerSamplingExp INSTANCE = new LiveHeadAnimDowngradeLoggerSamplingExp();
    public static final C01GW samplingValue$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1002));
    public static final C01GW isLoggerEnable$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1001));

    public final float getSamplingValue() {
        return ((Number) samplingValue$delegate.getValue()).floatValue();
    }

    public final boolean isLoggerEnable() {
        return ((Boolean) isLoggerEnable$delegate.getValue()).booleanValue();
    }

    public final float getDEFAULT() {
        return DEFAULT;
    }
}
