package com.ss.android.ugc.aweme.explore.experiment.performance;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes21.dex */
public final class ExploreImageCacheStrategyConfig {

    @C09CT("boost_preload_priority")
    public final boolean boostPreloadPriority;

    @C09CT("custom_cache_size")
    public final int customCacheSize;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_custom_cache")
    public final boolean enableCustomCache;

    @C09CT("fallback_to_photo_mode_cache")
    public final boolean fallbackToPhotoModeCache;

    @C09CT("low_storage_cache_size")
    public final int lowStorageCacheSize;

    public ExploreImageCacheStrategyConfig() {
        this(false, false, true, false, 30, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreImageCacheStrategyConfig)) {
            return false;
        }
        ExploreImageCacheStrategyConfig exploreImageCacheStrategyConfig = (ExploreImageCacheStrategyConfig) obj;
        return this.enable == exploreImageCacheStrategyConfig.enable && this.enableCustomCache == exploreImageCacheStrategyConfig.enableCustomCache && this.fallbackToPhotoModeCache == exploreImageCacheStrategyConfig.fallbackToPhotoModeCache && this.boostPreloadPriority == exploreImageCacheStrategyConfig.boostPreloadPriority && this.customCacheSize == exploreImageCacheStrategyConfig.customCacheSize && this.lowStorageCacheSize == exploreImageCacheStrategyConfig.lowStorageCacheSize;
    }

    public int hashCode() {
        return (((((((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.enableCustomCache)) * 31) + C786410Ut5.Z2(this.fallbackToPhotoModeCache)) * 31) + C786410Ut5.Z2(this.boostPreloadPriority)) * 31) + this.customCacheSize) * 31) + this.lowStorageCacheSize;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreImageCacheStrategyConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", enableCustomCache=");
        sbLIZ.append(this.enableCustomCache);
        sbLIZ.append(", fallbackToPhotoModeCache=");
        sbLIZ.append(this.fallbackToPhotoModeCache);
        sbLIZ.append(", boostPreloadPriority=");
        sbLIZ.append(this.boostPreloadPriority);
        sbLIZ.append(", customCacheSize=");
        sbLIZ.append(this.customCacheSize);
        sbLIZ.append(", lowStorageCacheSize=");
        sbLIZ.append(this.lowStorageCacheSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreImageCacheStrategyConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        this.enable = z;
        this.enableCustomCache = z2;
        this.fallbackToPhotoModeCache = z3;
        this.boostPreloadPriority = z4;
        this.customCacheSize = i;
        this.lowStorageCacheSize = i2;
    }
}
