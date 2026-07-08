package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSmartAheadPrefetchOptConfig extends SmartSceneConfig {

    @C09CT("clear_cache_delay_time")
    public final long clearCacheDelayTime;

    @C09CT("enable_platform")
    public final boolean enablePlatform;

    @C09CT("enable_model_preload")
    public final boolean enableServiceModelPreload;

    @C09CT("enable_smart_ahead_prefetch")
    public final boolean enableSmartAheadPrefetch;

    @C09CT("prefetch_delay_time")
    public final long prefetchDelayTime;

    @C09CT("score_threshold")
    public final float scoreThreshold;

    public SearchSmartAheadPrefetchOptConfig() {
        this(false, 0.5f, 0L, 13000L, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSmartAheadPrefetchOptConfig)) {
            return false;
        }
        SearchSmartAheadPrefetchOptConfig searchSmartAheadPrefetchOptConfig = (SearchSmartAheadPrefetchOptConfig) obj;
        return this.enableSmartAheadPrefetch == searchSmartAheadPrefetchOptConfig.enableSmartAheadPrefetch && Float.compare(this.scoreThreshold, searchSmartAheadPrefetchOptConfig.scoreThreshold) == 0 && this.prefetchDelayTime == searchSmartAheadPrefetchOptConfig.prefetchDelayTime && this.clearCacheDelayTime == searchSmartAheadPrefetchOptConfig.clearCacheDelayTime && this.enableServiceModelPreload == searchSmartAheadPrefetchOptConfig.enableServiceModelPreload && this.enablePlatform == searchSmartAheadPrefetchOptConfig.enablePlatform;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSmartAheadPrefetchOptConfig(enableSmartAheadPrefetch=");
        sbLIZ.append(this.enableSmartAheadPrefetch);
        sbLIZ.append(", scoreThreshold=");
        sbLIZ.append(this.scoreThreshold);
        sbLIZ.append(", prefetchDelayTime=");
        sbLIZ.append(this.prefetchDelayTime);
        sbLIZ.append(", clearCacheDelayTime=");
        sbLIZ.append(this.clearCacheDelayTime);
        sbLIZ.append(", enableServiceModelPreload=");
        sbLIZ.append(this.enableServiceModelPreload);
        sbLIZ.append(", enablePlatform=");
        sbLIZ.append(this.enablePlatform);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.enableSmartAheadPrefetch) * 31) + Float.floatToIntBits(this.scoreThreshold)) * 31) + C786410Ut5.Y2(this.prefetchDelayTime)) * 31) + C786410Ut5.Y2(this.clearCacheDelayTime)) * 31) + C786410Ut5.Z2(this.enableServiceModelPreload)) * 31) + C786410Ut5.Z2(this.enablePlatform);
    }

    public SearchSmartAheadPrefetchOptConfig(boolean z, float f, long j, long j2, boolean z2, boolean z3) {
        this.enableSmartAheadPrefetch = z;
        this.scoreThreshold = f;
        this.prefetchDelayTime = j;
        this.clearCacheDelayTime = j2;
        this.enableServiceModelPreload = z2;
        this.enablePlatform = z3;
        setScene("search_smart_ahead_prefetch");
    }
}
