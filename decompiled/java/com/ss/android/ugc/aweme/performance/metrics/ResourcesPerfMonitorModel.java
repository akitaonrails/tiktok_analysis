package com.ss.android.ugc.aweme.performance.metrics;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class ResourcesPerfMonitorModel {

    @C09CT("enable_cpu_monitor")
    public final int enableCpuMonitor;

    @C09CT("enable_memory_monitor")
    public final int enableMemoryMonitor;

    @C09CT("sample_rate")
    public final float sampleRate;

    public ResourcesPerfMonitorModel() {
        this(1, 1, 0.0f);
    }

    public ResourcesPerfMonitorModel(int i, int i2, float f) {
        this.enableMemoryMonitor = i;
        this.enableCpuMonitor = i2;
        this.sampleRate = f;
    }
}
