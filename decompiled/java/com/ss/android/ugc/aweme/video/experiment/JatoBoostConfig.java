package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class JatoBoostConfig {

    @C09CT("cpu")
    public final long cpuBoost;

    @C09CT("gc")
    public final long gcBlock;

    @C09CT("gpu")
    public final long gpuBoost;

    public JatoBoostConfig() {
        this(0L, 0L, 0L);
    }

    public final boolean LIZ() {
        return this.cpuBoost > 0 || this.gpuBoost > 0 || this.gcBlock > 0;
    }

    public JatoBoostConfig(long j, long j2, long j3) {
        this.cpuBoost = j;
        this.gpuBoost = j2;
        this.gcBlock = j3;
    }
}
