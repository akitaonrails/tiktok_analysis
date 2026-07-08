package com.ss.android.ugc.aweme.utils.gecko;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoExperimentsType {

    @C09CT("use_gecko_settings")
    public final boolean useGeckoSettings = true;

    @C09CT("available_storage_full")
    public final int availableStorageFull = 150;

    @C09CT("available_storage_patch")
    public final int availableStoragePatch = 100;

    @C09CT("enable_cdn_statistic")
    public final boolean enableCDNStatistic = true;

    public final int getAvailableStorageFull() {
        return this.availableStorageFull;
    }

    public final int getAvailableStoragePatch() {
        return this.availableStoragePatch;
    }

    public final boolean getEnableCDNStatistic() {
        return this.enableCDNStatistic;
    }

    public final boolean getUseGeckoSettings() {
        return this.useGeckoSettings;
    }
}
