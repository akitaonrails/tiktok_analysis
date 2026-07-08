package com.ss.android.ugc.aweme.ecommerce.memory;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMemoryOptSettingsModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("image_size")
    public final boolean enableImageSize;

    @C09CT("mall_cache")
    public final boolean enableMallCache;

    @C09CT("shop_mall_cache_opt")
    public final boolean enableShopMallCacheOpt;

    @C09CT("shop_mall_homepage_api_piper_data")
    public final boolean enableShopMallHomepageApiPiperData;

    @C09CT("memory_control")
    public final Integer memoryControl;

    @C09CT("memory_control_percent")
    public final float memoryControlPercent = 0.8f;

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getEnableImageSize() {
        return this.enableImageSize;
    }

    public final boolean getEnableMallCache() {
        return this.enableMallCache;
    }

    public final boolean getEnableShopMallCacheOpt() {
        return this.enableShopMallCacheOpt;
    }

    public final boolean getEnableShopMallHomepageApiPiperData() {
        return this.enableShopMallHomepageApiPiperData;
    }

    public final Integer getMemoryControl() {
        return this.memoryControl;
    }

    public final float getMemoryControlPercent() {
        return this.memoryControlPercent;
    }
}
