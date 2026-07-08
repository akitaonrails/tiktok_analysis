package com.ss.android.ugc.aweme.aabplugin.core.base.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class DFTTWebViewData {

    @C09CT("optimize_activate")
    public final boolean optimizeActivate;

    @C09CT("optimize_executor")
    public final boolean optimizeExecutor;

    @C09CT("optimize_install")
    public final boolean optimizeInstall;

    public DFTTWebViewData() {
        this(false, false, false);
    }

    public DFTTWebViewData(boolean z, boolean z2, boolean z3) {
        this.optimizeActivate = z;
        this.optimizeExecutor = z2;
        this.optimizeInstall = z3;
    }
}
