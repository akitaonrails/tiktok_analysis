package com.ss.android.ugc.aweme.ecommerce.monitor;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ECSDKMonitorConfigData {

    @C09CT("enable_track")
    public final Boolean enableTrack;

    @C09CT("get_service_rate")
    public final Float getServiceRate;

    @C09CT("max_store")
    public final Integer maxStore;

    public ECSDKMonitorConfigData(Boolean bool, Float f, Integer num) {
        this.enableTrack = bool;
        this.getServiceRate = f;
        this.maxStore = num;
    }
}
