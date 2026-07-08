package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes36.dex */
public final class OfflineInsertConfig {

    @C09CT("cache_interval")
    public final int cacheInterval;

    @C09CT("consumed_offline_exit_count")
    public final int consumedOfflineExitCount;

    @C09CT("preload_block_duration_ms")
    public final int preloadBlockDurationMs;

    @C09CT("preload_block_ratio_pct")
    public final int preloadBlockRatioPct;

    @C09CT("preload_delta_threshold_ms")
    public final int preloadDeltaThresholdMs;

    @C09CT("stable_net_exit_streak")
    public final int stableNetExitStreak;

    @C09CT("stable_net_type_threshold")
    public final int stableNetTypeThreshold;

    @C09CT("stall_duration_ms")
    public final int stallDurationMs;

    @C09CT("startup_stall_duration_ms")
    public final int startupStallDurationMs;

    @C09CT("use_offline_cache")
    public final int useOfflineCache;

    public OfflineInsertConfig() {
        this(0, 2000, 5000, 8, 10000, 60, 2000, 2, 4, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineInsertConfig)) {
            return false;
        }
        OfflineInsertConfig offlineInsertConfig = (OfflineInsertConfig) obj;
        return this.useOfflineCache == offlineInsertConfig.useOfflineCache && this.startupStallDurationMs == offlineInsertConfig.startupStallDurationMs && this.stallDurationMs == offlineInsertConfig.stallDurationMs && this.consumedOfflineExitCount == offlineInsertConfig.consumedOfflineExitCount && this.preloadBlockDurationMs == offlineInsertConfig.preloadBlockDurationMs && this.preloadBlockRatioPct == offlineInsertConfig.preloadBlockRatioPct && this.preloadDeltaThresholdMs == offlineInsertConfig.preloadDeltaThresholdMs && this.stableNetExitStreak == offlineInsertConfig.stableNetExitStreak && this.stableNetTypeThreshold == offlineInsertConfig.stableNetTypeThreshold && this.cacheInterval == offlineInsertConfig.cacheInterval;
    }

    public final int hashCode() {
        return (((((((((((((((((this.useOfflineCache * 31) + this.startupStallDurationMs) * 31) + this.stallDurationMs) * 31) + this.consumedOfflineExitCount) * 31) + this.preloadBlockDurationMs) * 31) + this.preloadBlockRatioPct) * 31) + this.preloadDeltaThresholdMs) * 31) + this.stableNetExitStreak) * 31) + this.stableNetTypeThreshold) * 31) + this.cacheInterval;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OfflineInsertConfig(useOfflineCache=");
        sbLIZ.append(this.useOfflineCache);
        sbLIZ.append(", startupStallDurationMs=");
        sbLIZ.append(this.startupStallDurationMs);
        sbLIZ.append(", stallDurationMs=");
        sbLIZ.append(this.stallDurationMs);
        sbLIZ.append(", consumedOfflineExitCount=");
        sbLIZ.append(this.consumedOfflineExitCount);
        sbLIZ.append(", preloadBlockDurationMs=");
        sbLIZ.append(this.preloadBlockDurationMs);
        sbLIZ.append(", preloadBlockRatioPct=");
        sbLIZ.append(this.preloadBlockRatioPct);
        sbLIZ.append(", preloadDeltaThresholdMs=");
        sbLIZ.append(this.preloadDeltaThresholdMs);
        sbLIZ.append(", stableNetExitStreak=");
        sbLIZ.append(this.stableNetExitStreak);
        sbLIZ.append(", stableNetTypeThreshold=");
        sbLIZ.append(this.stableNetTypeThreshold);
        sbLIZ.append(", cacheInterval=");
        sbLIZ.append(this.cacheInterval);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OfflineInsertConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.useOfflineCache = i;
        this.startupStallDurationMs = i2;
        this.stallDurationMs = i3;
        this.consumedOfflineExitCount = i4;
        this.preloadBlockDurationMs = i5;
        this.preloadBlockRatioPct = i6;
        this.preloadDeltaThresholdMs = i7;
        this.stableNetExitStreak = i8;
        this.stableNetTypeThreshold = i9;
        this.cacheInterval = i10;
    }
}
