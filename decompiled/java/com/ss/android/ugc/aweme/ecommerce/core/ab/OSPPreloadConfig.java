package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OSPPreloadConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("max_device_score")
    public final Float maxDeviceScore;

    @C09CT("min_device_score")
    public final Float minDeviceScore;

    @C09CT("multi_sku_delay_time")
    public final Integer multiSkuDelayTime;

    @C09CT("preload_type")
    public final Integer preloadType;

    public OSPPreloadConfig() {
        this(false, null, 0, Float.valueOf(0.0f), Float.valueOf(0.0f));
    }

    public OSPPreloadConfig(boolean z, Integer num, Integer num2, Float f, Float f2) {
        this.enable = z;
        this.preloadType = num;
        this.multiSkuDelayTime = num2;
        this.minDeviceScore = f;
        this.maxDeviceScore = f2;
    }
}
