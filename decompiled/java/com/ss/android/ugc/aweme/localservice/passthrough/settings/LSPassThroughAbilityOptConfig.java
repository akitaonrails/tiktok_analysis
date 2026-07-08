package com.ss.android.ugc.aweme.localservice.passthrough.settings;

import X.C01GW;
import X.C296930BkR;
import X.C452501pT;

/* JADX INFO: loaded from: classes5.dex */
public final class LSPassThroughAbilityOptConfig {
    public static final boolean defaultConfig = false;
    public static final LSPassThroughAbilityOptConfig INSTANCE = new LSPassThroughAbilityOptConfig();
    public static final C01GW enable$delegate = C452501pT.LIZIZ(new C296930BkR());

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
