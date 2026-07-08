package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OSPPreloadSettingConfig {

    @C09CT("cache_expired_time")
    public final Integer cacheExpiredTime;

    @C09CT("enable_jsb_preload")
    public final Boolean enableJsbPreload;

    @C09CT("multi_sku")
    public final Integer multiSkuDelayTime;

    @C09CT("opt_cache_first_render_data")
    public final Boolean optCacheFirstRenderData;

    @C09CT("should_cache_first_render_data")
    public final Boolean shouldCacheFirstRenderData;

    @C09CT("single_sku")
    public final Integer singleSkuDelayTime;

    public OSPPreloadSettingConfig() {
        this(3, 0, 10, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);
    }

    public OSPPreloadSettingConfig(Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.singleSkuDelayTime = num;
        this.multiSkuDelayTime = num2;
        this.cacheExpiredTime = num3;
        this.shouldCacheFirstRenderData = bool;
        this.enableJsbPreload = bool2;
        this.optCacheFirstRenderData = bool3;
    }
}
