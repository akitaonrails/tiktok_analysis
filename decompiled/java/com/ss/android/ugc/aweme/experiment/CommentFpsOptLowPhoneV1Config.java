package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentFpsOptLowPhoneV1Config {

    @C09CT("max_fling_velocity_factor")
    public final float maxFlingVelocityFactor;

    @C09CT("total_fling_velocity_factor")
    public final float totalFlingVelocityFactor;

    public CommentFpsOptLowPhoneV1Config() {
        this(1.0f, 1.0f);
    }

    public CommentFpsOptLowPhoneV1Config(float f, float f2) {
        this.totalFlingVelocityFactor = f;
        this.maxFlingVelocityFactor = f2;
    }
}
