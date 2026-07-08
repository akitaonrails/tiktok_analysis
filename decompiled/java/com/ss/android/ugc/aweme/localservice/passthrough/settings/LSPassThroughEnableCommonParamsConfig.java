package com.ss.android.ugc.aweme.localservice.passthrough.settings;

import X.C01GW;
import X.C296940BkS;
import X.C452501pT;

/* JADX INFO: loaded from: classes5.dex */
public final class LSPassThroughEnableCommonParamsConfig {
    public static final LSPassThroughEnableCommonParamsConfig INSTANCE = new LSPassThroughEnableCommonParamsConfig();
    public static final boolean defaultConfig = true;
    public static final C01GW enable$delegate = C452501pT.LIZIZ(new C296940BkS());

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
