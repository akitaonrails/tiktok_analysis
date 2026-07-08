package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class HybridKitConfigTaskOptimizationConfigModel {

    @C09CT("boot_finish")
    public boolean bootFinish;

    @C09CT("sub_thread")
    public boolean subThread;

    public HybridKitConfigTaskOptimizationConfigModel() {
        this(false, false);
    }

    public HybridKitConfigTaskOptimizationConfigModel(boolean z, boolean z2) {
        this.bootFinish = z;
        this.subThread = z2;
    }
}
