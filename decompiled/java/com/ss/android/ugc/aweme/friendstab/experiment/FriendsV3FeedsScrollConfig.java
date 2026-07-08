package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3FeedsScrollConfig {

    @C09CT("enable_strategy")
    public final boolean enableStrategy;

    @C09CT("extra_layout_space_factor")
    public final float extraLayoutSpaceFactor;

    @C09CT("fling_factor")
    public final float flingFactor;

    @C09CT("fling_high_factor")
    public final float flingHighFactor;

    @C09CT("fling_high_threshold")
    public final int flingHighThreshold;

    @C09CT("fling_low_factor")
    public final float flingLowFactor;

    @C09CT("fling_low_threshold")
    public final int flingLowThreshold;

    @C09CT("fling_max_velocity")
    public final int flingMaxVelocity;

    @C09CT("fling_strategy")
    public final int flingStrategy;

    public FriendsV3FeedsScrollConfig() {
        this(false, 0.76f, 0.0f, 0, 2000, 6000, 1.2f, 1.4f, -1);
    }

    public FriendsV3FeedsScrollConfig(boolean z, float f, float f2, int i, int i2, int i3, float f3, float f4, int i4) {
        this.enableStrategy = z;
        this.flingFactor = f;
        this.extraLayoutSpaceFactor = f2;
        this.flingStrategy = i;
        this.flingLowThreshold = i2;
        this.flingHighThreshold = i3;
        this.flingLowFactor = f3;
        this.flingHighFactor = f4;
        this.flingMaxVelocity = i4;
    }
}
