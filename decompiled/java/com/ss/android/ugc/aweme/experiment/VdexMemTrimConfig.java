package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class VdexMemTrimConfig {

    @C09CT("interval_t")
    public long intervalTime;

    @C09CT("max_count")
    public int maxCount;

    @C09CT("mem_thresh")
    public int memThreshold;

    @C09CT("min_start_t")
    public long minStartTime;

    @C09CT("percent")
    public float percentage;

    @C09CT("art")
    public boolean trimArt;

    @C09CT("heap")
    public boolean trimHeap;

    @C09CT("vdex")
    public boolean trimVdex;

    @C09CT("use_on_low_mem")
    public boolean useOnLowMemory;

    @C09CT("use_stw")
    public boolean useStw;

    public VdexMemTrimConfig() {
        this(false, 100, 180000L, 10000L, 3, 0.8f, true, true, true, false);
    }

    public final void setIntervalTime(long j) {
        this.intervalTime = j;
    }

    public final void setMaxCount(int i) {
        this.maxCount = i;
    }

    public final void setMemThreshold(int i) {
        this.memThreshold = i;
    }

    public final void setMinStartTime(long j) {
        this.minStartTime = j;
    }

    public final void setPercentage(float f) {
        this.percentage = f;
    }

    public final void setTrimArt(boolean z) {
        this.trimArt = z;
    }

    public final void setTrimHeap(boolean z) {
        this.trimHeap = z;
    }

    public final void setTrimVdex(boolean z) {
        this.trimVdex = z;
    }

    public final void setUseOnLowMemory(boolean z) {
        this.useOnLowMemory = z;
    }

    public final void setUseStw(boolean z) {
        this.useStw = z;
    }

    public VdexMemTrimConfig(boolean z, int i, long j, long j2, int i2, float f, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.useOnLowMemory = z;
        this.memThreshold = i;
        this.intervalTime = j;
        this.minStartTime = j2;
        this.maxCount = i2;
        this.percentage = f;
        this.trimVdex = z2;
        this.useStw = z3;
        this.trimArt = z4;
        this.trimHeap = z5;
    }
}
