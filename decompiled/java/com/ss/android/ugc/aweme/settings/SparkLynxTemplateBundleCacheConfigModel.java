package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkLynxTemplateBundleCacheConfigModel {

    @C09CT("clearOnLowMemory")
    public final boolean clearOnLowMemory;

    @C09CT("downgradeOnLowDevice")
    public final boolean downgradeOnLowDevice;

    public SparkLynxTemplateBundleCacheConfigModel() {
        this(false, false);
    }

    public SparkLynxTemplateBundleCacheConfigModel(boolean z, boolean z2) {
        this.downgradeOnLowDevice = z;
        this.clearOnLowMemory = z2;
    }
}
