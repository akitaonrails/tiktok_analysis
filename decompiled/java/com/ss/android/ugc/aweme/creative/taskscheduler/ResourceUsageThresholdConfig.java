package com.ss.android.ugc.aweme.creative.taskscheduler;

/* JADX INFO: loaded from: classes33.dex */
public final class ResourceUsageThresholdConfig {
    public final float cpuThreshold;
    public final long executionIntervalMs;
    public final float networkThreshold;
    public final int threadPoolSize;
    public final long timeout;

    public ResourceUsageThresholdConfig() {
        this(0.7f, 0.9f, -1, 30000L, 0L);
    }

    public final float getCpuThreshold() {
        return this.cpuThreshold;
    }

    public final long getExecutionIntervalMs() {
        return this.executionIntervalMs;
    }

    public final float getNetworkThreshold() {
        return this.networkThreshold;
    }

    public final int getThreadPoolSize() {
        return this.threadPoolSize;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public ResourceUsageThresholdConfig(float f, float f2, int i, long j, long j2) {
        this.cpuThreshold = f;
        this.networkThreshold = f2;
        this.threadPoolSize = i;
        this.timeout = j;
        this.executionIntervalMs = j2;
    }
}
