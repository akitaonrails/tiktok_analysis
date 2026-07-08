package com.ss.android.ugc.aweme.experiment.diagnosis;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class MainThreadTraceConfig {

    @C09CT("dump_interval")
    public final long dumpInterval;

    @C09CT("measure_time")
    public final long measureTime;

    @C09CT("open")
    public final boolean open;

    @C09CT("open_sampling")
    public final float openSampling;

    @C09CT("report_pool_size")
    public final int reportPoolSize;

    @C09CT("sample_interval")
    public final long sampleInterval;

    public MainThreadTraceConfig() {
        this(false, 0.05f, 300L, 30L, 30000L, 5);
    }

    public MainThreadTraceConfig(boolean z, float f, long j, long j2, long j3, int i) {
        this.open = z;
        this.openSampling = f;
        this.measureTime = j;
        this.dumpInterval = j2;
        this.sampleInterval = j3;
        this.reportPoolSize = i;
    }
}
