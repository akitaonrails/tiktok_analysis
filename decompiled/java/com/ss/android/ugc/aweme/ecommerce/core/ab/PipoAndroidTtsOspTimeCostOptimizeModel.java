package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoAndroidTtsOspTimeCostOptimizeModel {

    @C09CT("enable_is_app_install_opt")
    public final boolean enableIsAppInstallOptimize;

    @C09CT("enable_log_opt")
    public final boolean enableLogOptimize;

    @C09CT("enable_opt")
    public final boolean enableOptimize;

    public PipoAndroidTtsOspTimeCostOptimizeModel() {
        this(false, false, false);
    }

    public PipoAndroidTtsOspTimeCostOptimizeModel(boolean z, boolean z2, boolean z3) {
        this.enableLogOptimize = z;
        this.enableOptimize = z2;
        this.enableIsAppInstallOptimize = z3;
    }
}
