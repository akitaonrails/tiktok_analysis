package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C285380BGm;
import X.C292401Bi;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveOptFluencyRecoExp {
    public static final boolean DEFAULT = true;
    public static final LiveOptFluencyRecoExp INSTANCE = new LiveOptFluencyRecoExp();
    public static final C01GW config$delegate = C292401Bi.LIZ(new C285380BGm());

    public static final boolean isDisable() {
        return !INSTANCE.getConfig();
    }

    public static final boolean isEnable() {
        return INSTANCE.getConfig();
    }

    public final boolean getConfig() {
        return ((Boolean) config$delegate.getValue()).booleanValue();
    }
}
