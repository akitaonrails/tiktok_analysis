package com.ss.android.ugc.aweme.tako.performance.mob.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImgPreloadConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("keyframe_prefetch_strategy")
    public final int keyframePrefetchStrategy;

    @C09CT("max_prefetch_per_patch")
    public final int maxPrefetchPerPatch;

    @C09CT("prefetch_priority")
    public final int prefetchPriority;

    @C09CT("use_custom_disk_cache")
    public final boolean useCustomDiskCache;

    public TakoImgPreloadConfig() {
        this(false, 3, 1, false, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoImgPreloadConfig)) {
            return false;
        }
        TakoImgPreloadConfig takoImgPreloadConfig = (TakoImgPreloadConfig) obj;
        return this.enable == takoImgPreloadConfig.enable && this.maxPrefetchPerPatch == takoImgPreloadConfig.maxPrefetchPerPatch && this.prefetchPriority == takoImgPreloadConfig.prefetchPriority && this.useCustomDiskCache == takoImgPreloadConfig.useCustomDiskCache && this.keyframePrefetchStrategy == takoImgPreloadConfig.keyframePrefetchStrategy;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.enable) * 31) + this.maxPrefetchPerPatch) * 31) + this.prefetchPriority) * 31) + C786410Ut5.Z2(this.useCustomDiskCache)) * 31) + this.keyframePrefetchStrategy;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImgPreloadConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", maxPrefetchPerPatch=");
        sbLIZ.append(this.maxPrefetchPerPatch);
        sbLIZ.append(", prefetchPriority=");
        sbLIZ.append(this.prefetchPriority);
        sbLIZ.append(", useCustomDiskCache=");
        sbLIZ.append(this.useCustomDiskCache);
        sbLIZ.append(", keyframePrefetchStrategy=");
        sbLIZ.append(this.keyframePrefetchStrategy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoImgPreloadConfig(boolean z, int i, int i2, boolean z2, int i3) {
        this.enable = z;
        this.maxPrefetchPerPatch = i;
        this.prefetchPriority = i2;
        this.useCustomDiskCache = z2;
        this.keyframePrefetchStrategy = i3;
    }
}
