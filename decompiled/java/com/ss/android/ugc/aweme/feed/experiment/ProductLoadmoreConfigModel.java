package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class ProductLoadmoreConfigModel {

    @C09CT("beta")
    public final float beta;

    @C09CT("bias")
    public final int bias;

    @C09CT("default_time_each_video")
    public final float defaultTimeEachVideo;

    @C09CT("max_trigger_count")
    public final int maxTriggerCount;

    @C09CT("min_force_trigger_count")
    public final int minForceTriggerCount;

    public ProductLoadmoreConfigModel() {
        this(3, 0.8f, 3.0f, 8, 2);
    }

    public ProductLoadmoreConfigModel(int i, float f, float f2, int i2, int i3) {
        this.bias = i;
        this.beta = f;
        this.defaultTimeEachVideo = f2;
        this.maxTriggerCount = i2;
        this.minForceTriggerCount = i3;
    }
}
