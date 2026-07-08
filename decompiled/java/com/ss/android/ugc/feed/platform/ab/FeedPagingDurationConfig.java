package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedPagingDurationConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fast_duration")
    public final int fastDuration;

    @C09CT("fast_play_time_predict")
    public final float fastPlayTimePredict;

    @C09CT("model_type")
    public final int modelType;

    @C09CT("slow_duration")
    public final int slowDuration;

    @C09CT("slow_play_time_predict")
    public final float slowPlayTimePredict;

    public FeedPagingDurationConfig() {
        this(false, 0, -1, -1, -1.0f, -1.0f);
    }

    public FeedPagingDurationConfig(boolean z, int i, int i2, int i3, float f, float f2) {
        this.enable = z;
        this.modelType = i;
        this.fastDuration = i2;
        this.slowDuration = i3;
        this.fastPlayTimePredict = f;
        this.slowPlayTimePredict = f2;
    }
}
