package com.ss.android.ugc.aweme.task.gc;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class GCCheckConfig {

    @C09CT("detail_alloc_sample")
    public int detailAllocSample;

    @C09CT("min_interval")
    public int minInterval = 30000;

    @C09CT("sample")
    public int sample;

    @C09CT("scene_sample")
    public int sceneSample;

    public final int getDetailAllocSample() {
        return this.detailAllocSample;
    }

    public final int getMinInterval() {
        return this.minInterval;
    }

    public final int getSample() {
        return this.sample;
    }

    public final int getSceneSample() {
        return this.sceneSample;
    }

    public final void setDetailAllocSample(int i) {
        this.detailAllocSample = i;
    }

    public final void setMinInterval(int i) {
        this.minInterval = i;
    }

    public final void setSample(int i) {
        this.sample = i;
    }

    public final void setSceneSample(int i) {
        this.sceneSample = i;
    }
}
