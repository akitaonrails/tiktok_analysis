package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class FeedAdaptionSmartColorConfig {

    @C09CT("c_left")
    public final float cLeft;

    @C09CT("c_right")
    public final float cRight;

    @C09CT("i_left")
    public final float iLeft;

    @C09CT("i_right")
    public final float iRight;

    @C09CT("lightness_addition")
    public final float lightnessAddition;

    @C09CT("merging_tolerance")
    public final float mergingTolerance;

    @C09CT("strategy_threshold")
    public final float strategyThreshold;

    public FeedAdaptionSmartColorConfig() {
        this(10.0f, 0.0f, 0.0f, 0.02f, 0.1f, 0.25f, 0.0f);
    }

    public FeedAdaptionSmartColorConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.mergingTolerance = f;
        this.lightnessAddition = f2;
        this.cLeft = f3;
        this.cRight = f4;
        this.iLeft = f5;
        this.iRight = f6;
        this.strategyThreshold = f7;
    }
}
