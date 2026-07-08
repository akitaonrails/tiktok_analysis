package com.ss.android.ugc.aweme.story.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class MineStoryDiskCacheConfig {

    @C09CT("async_full")
    public final boolean asyncFull;

    @C09CT("async_light")
    public final boolean asyncLight;

    @C09CT("disk_cache_ttl_in_ms")
    public final long diskCacheTtlInMs;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_full")
    public final boolean enableFull;

    @C09CT("enable_light")
    public final boolean enableLight;

    @C09CT("flush_throttle_ms")
    public final long flushThrottleMs;

    public MineStoryDiskCacheConfig() {
        this(false, true, true, 0L, 1000L, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MineStoryDiskCacheConfig)) {
            return false;
        }
        MineStoryDiskCacheConfig mineStoryDiskCacheConfig = (MineStoryDiskCacheConfig) obj;
        return this.enable == mineStoryDiskCacheConfig.enable && this.enableLight == mineStoryDiskCacheConfig.enableLight && this.enableFull == mineStoryDiskCacheConfig.enableFull && this.diskCacheTtlInMs == mineStoryDiskCacheConfig.diskCacheTtlInMs && this.flushThrottleMs == mineStoryDiskCacheConfig.flushThrottleMs && this.asyncLight == mineStoryDiskCacheConfig.asyncLight && this.asyncFull == mineStoryDiskCacheConfig.asyncFull;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.enableLight)) * 31) + C786410Ut5.Z2(this.enableFull)) * 31) + C786410Ut5.Y2(this.diskCacheTtlInMs)) * 31) + C786410Ut5.Y2(this.flushThrottleMs)) * 31) + C786410Ut5.Z2(this.asyncLight)) * 31) + C786410Ut5.Z2(this.asyncFull);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MineStoryDiskCacheConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", enableLight=");
        sbLIZ.append(this.enableLight);
        sbLIZ.append(", enableFull=");
        sbLIZ.append(this.enableFull);
        sbLIZ.append(", diskCacheTtlInMs=");
        sbLIZ.append(this.diskCacheTtlInMs);
        sbLIZ.append(", flushThrottleMs=");
        sbLIZ.append(this.flushThrottleMs);
        sbLIZ.append(", asyncLight=");
        sbLIZ.append(this.asyncLight);
        sbLIZ.append(", asyncFull=");
        sbLIZ.append(this.asyncFull);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MineStoryDiskCacheConfig(boolean z, boolean z2, boolean z3, long j, long j2, boolean z4, boolean z5) {
        this.enable = z;
        this.enableLight = z2;
        this.enableFull = z3;
        this.diskCacheTtlInMs = j;
        this.flushThrottleMs = j2;
        this.asyncLight = z4;
        this.asyncFull = z5;
    }
}
