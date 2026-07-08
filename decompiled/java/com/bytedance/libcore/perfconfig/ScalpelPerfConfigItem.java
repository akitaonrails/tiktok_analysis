package com.bytedance.libcore.perfconfig;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ScalpelPerfConfigItem {

    @C09CT("min_cpu_time")
    public long minCpuTime;

    @C09CT("min_wall_time")
    public long minWallTime;

    public ScalpelPerfConfigItem() {
        this(Long.MAX_VALUE, Long.MAX_VALUE);
    }

    public final long getMinCpuTime() {
        return this.minCpuTime;
    }

    public final long getMinWallTime() {
        return this.minWallTime;
    }

    public final void setMinCpuTime(long j) {
        this.minCpuTime = j;
    }

    public final void setMinWallTime(long j) {
        this.minWallTime = j;
    }

    public ScalpelPerfConfigItem(long j, long j2) {
        this.minWallTime = j;
        this.minCpuTime = j2;
    }
}
