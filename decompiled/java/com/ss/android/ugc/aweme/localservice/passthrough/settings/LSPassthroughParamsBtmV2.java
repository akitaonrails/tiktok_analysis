package com.ss.android.ugc.aweme.localservice.passthrough.settings;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class LSPassthroughParamsBtmV2 {
    public static final LSPassthroughParamsBtmV2 INSTANCE = new LSPassthroughParamsBtmV2();
    public static final boolean defaultConfig = true;
    public static final C01GW enable$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1737));

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getEnable();
    }

    public final boolean getDefaultConfig() {
        return defaultConfig;
    }
}
