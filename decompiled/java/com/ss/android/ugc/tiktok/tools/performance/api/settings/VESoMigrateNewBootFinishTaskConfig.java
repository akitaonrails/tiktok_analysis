package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class VESoMigrateNewBootFinishTaskConfig {

    @C09CT("is_open")
    public final boolean isOpen;

    @C09CT("threshold_count")
    public final int thresholdCount;

    public VESoMigrateNewBootFinishTaskConfig() {
        this(false, 0);
    }

    public VESoMigrateNewBootFinishTaskConfig(boolean z, int i) {
        this.isOpen = z;
        this.thresholdCount = i;
    }
}
