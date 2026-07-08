package com.ss.android.ugc.aweme.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes34.dex */
public final class Live5vvOptExp {
    public static final Live5vvOptExp INSTANCE = new Live5vvOptExp();
    public static final VVConfig DEFAULT = new VVConfig(false, 5);

    public static final int vvIndex() {
        return INSTANCE.value().vvIndex;
    }

    private final VVConfig value() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        VVConfig vVConfig = DEFAULT;
        VVConfig vVConfig2 = (VVConfig) c0c64LJIILLIIL.LJJII(VVConfig.class, vVConfig, "live_5vv_opt_exp", true);
        return vVConfig2 != null ? vVConfig2 : vVConfig;
    }

    public final boolean disable() {
        return !value().isEnable;
    }
}
