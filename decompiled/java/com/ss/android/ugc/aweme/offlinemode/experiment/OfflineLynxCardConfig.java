package com.ss.android.ugc.aweme.offlinemode.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineLynxCardConfig {

    @C09CT("clear_cache_day")
    public final int clearCacheDay;

    @C09CT("low_net_request_ratio")
    public final float lowNetRatio;

    @C09CT("min_request_day")
    public final int minRequestDay;

    @C09CT("non_low_net_request_ratio")
    public final float nonLowNetRatio;

    @C09CT("non_wifi_request_ratio")
    public final float nonWifiRatio;

    @C09CT("wifi_request_ratio")
    public final float wifiRatio;

    public OfflineLynxCardConfig() {
        this(1.1f, 1.1f, 1.1f, 1.1f, 3, 90);
    }

    public OfflineLynxCardConfig(float f, float f2, float f3, float f4, int i, int i2) {
        this.lowNetRatio = f;
        this.nonLowNetRatio = f2;
        this.nonWifiRatio = f3;
        this.wifiRatio = f4;
        this.minRequestDay = i;
        this.clearCacheDay = i2;
    }
}
