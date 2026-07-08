package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class HighlightPrePullStreamConfig {

    @C09CT("high_performance_pre_play_time")
    public final float deviceHighPrePlayTime;

    @C09CT("low_performance_pre_play_time")
    public final float deviceLowPrePlayTime;

    @C09CT("medium_performance_pre_play_time")
    public final float deviceMidPrePlayTime;

    public HighlightPrePullStreamConfig() {
        this(1.0f, 2.0f, 4.0f);
    }

    public HighlightPrePullStreamConfig(float f, float f2, float f3) {
        this.deviceLowPrePlayTime = f;
        this.deviceMidPrePlayTime = f2;
        this.deviceHighPrePlayTime = f3;
    }
}
