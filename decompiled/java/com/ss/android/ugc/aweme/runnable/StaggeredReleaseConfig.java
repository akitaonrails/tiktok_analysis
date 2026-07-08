package com.ss.android.ugc.aweme.runnable;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes34.dex */
public final class StaggeredReleaseConfig {

    @C09CT("cpu_time_ratio_threshold")
    public final double cpuTimeRatioThreshold;

    @C09CT("critical_cpu_core_ratio")
    public final double criticalCpuCoreRatio;

    @C09CT("enable_re_lock")
    public final boolean enableReLock;

    @C09CT("enable_staggered_release")
    public final boolean enableStaggeredRelease;

    @C09CT("frame_drop_busy_threshold_ms")
    public final long frameDropBusyThresholdMs;

    @C09CT("main_thread_busy_threshold_ms")
    public final long mainThreadBusyThresholdMs;

    @C09CT("max_split_interval")
    public final long maxSplitInterval;

    @C09CT("release_batch_size")
    public final int releaseBatchSize;

    @C09CT("split_interval")
    public final long splitInterval;

    @C09CT("split_timeout")
    public final long splitTimeout;

    @C09CT("thread_cpu_growth_threshold")
    public final double threadCpuGrowthThreshold;

    public StaggeredReleaseConfig() {
        this(false, false, 0L, 0L, 0L, 0.5d, 100L, 0.8d, 3, 0.85d, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaggeredReleaseConfig)) {
            return false;
        }
        StaggeredReleaseConfig staggeredReleaseConfig = (StaggeredReleaseConfig) obj;
        return this.enableStaggeredRelease == staggeredReleaseConfig.enableStaggeredRelease && this.enableReLock == staggeredReleaseConfig.enableReLock && this.splitInterval == staggeredReleaseConfig.splitInterval && this.splitTimeout == staggeredReleaseConfig.splitTimeout && this.maxSplitInterval == staggeredReleaseConfig.maxSplitInterval && Double.compare(this.cpuTimeRatioThreshold, staggeredReleaseConfig.cpuTimeRatioThreshold) == 0 && this.mainThreadBusyThresholdMs == staggeredReleaseConfig.mainThreadBusyThresholdMs && Double.compare(this.threadCpuGrowthThreshold, staggeredReleaseConfig.threadCpuGrowthThreshold) == 0 && this.releaseBatchSize == staggeredReleaseConfig.releaseBatchSize && Double.compare(this.criticalCpuCoreRatio, staggeredReleaseConfig.criticalCpuCoreRatio) == 0 && this.frameDropBusyThresholdMs == staggeredReleaseConfig.frameDropBusyThresholdMs;
    }

    public final int hashCode() {
        return (((((((((((((((((((C786410Ut5.Z2(this.enableStaggeredRelease) * 31) + C786410Ut5.Z2(this.enableReLock)) * 31) + C786410Ut5.Y2(this.splitInterval)) * 31) + C786410Ut5.Y2(this.splitTimeout)) * 31) + C786410Ut5.Y2(this.maxSplitInterval)) * 31) + C786410Ut5.X2(this.cpuTimeRatioThreshold)) * 31) + C786410Ut5.Y2(this.mainThreadBusyThresholdMs)) * 31) + C786410Ut5.X2(this.threadCpuGrowthThreshold)) * 31) + this.releaseBatchSize) * 31) + C786410Ut5.X2(this.criticalCpuCoreRatio)) * 31) + C786410Ut5.Y2(this.frameDropBusyThresholdMs);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StaggeredReleaseConfig(enableStaggeredRelease=");
        sbLIZ.append(this.enableStaggeredRelease);
        sbLIZ.append(", enableReLock=");
        sbLIZ.append(this.enableReLock);
        sbLIZ.append(", splitInterval=");
        sbLIZ.append(this.splitInterval);
        sbLIZ.append(", splitTimeout=");
        sbLIZ.append(this.splitTimeout);
        sbLIZ.append(", maxSplitInterval=");
        sbLIZ.append(this.maxSplitInterval);
        sbLIZ.append(", cpuTimeRatioThreshold=");
        sbLIZ.append(this.cpuTimeRatioThreshold);
        sbLIZ.append(", mainThreadBusyThresholdMs=");
        sbLIZ.append(this.mainThreadBusyThresholdMs);
        sbLIZ.append(", threadCpuGrowthThreshold=");
        sbLIZ.append(this.threadCpuGrowthThreshold);
        sbLIZ.append(", releaseBatchSize=");
        sbLIZ.append(this.releaseBatchSize);
        sbLIZ.append(", criticalCpuCoreRatio=");
        sbLIZ.append(this.criticalCpuCoreRatio);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StaggeredReleaseConfig(boolean z, boolean z2, long j, long j2, long j3, double d, long j4, double d2, int i, double d3, long j5) {
        this.enableStaggeredRelease = z;
        this.enableReLock = z2;
        this.splitInterval = j;
        this.splitTimeout = j2;
        this.maxSplitInterval = j3;
        this.cpuTimeRatioThreshold = d;
        this.mainThreadBusyThresholdMs = j4;
        this.threadCpuGrowthThreshold = d2;
        this.releaseBatchSize = i;
        this.criticalCpuCoreRatio = d3;
        this.frameDropBusyThresholdMs = j5;
    }
}
