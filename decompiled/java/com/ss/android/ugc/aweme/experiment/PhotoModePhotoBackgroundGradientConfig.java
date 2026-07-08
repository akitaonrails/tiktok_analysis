package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class PhotoModePhotoBackgroundGradientConfig {

    @C09CT("c_left")
    public final float cLeft;

    @C09CT("c_right")
    public final float cRight;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_opt")
    public final boolean enableOpt;

    @C09CT("i_left")
    public final float iLeft;

    @C09CT("i_right")
    public final float iRight;

    @C09CT("lightness_addition")
    public final float lightnessAddition;

    @C09CT("merging_to_lerance")
    public final float mergingTolerance;

    @C09CT("select_color_index")
    public final int selectColorIndex;

    @C09CT("strategy_threshold")
    public final float strategyThreshold;

    @C09CT("valid_height_percentage")
    public final float validHeightPercentage;

    public PhotoModePhotoBackgroundGradientConfig() {
        this(false, true, 0, 1.0f, 10.0f, 0.0f, 0.0f, 0.02f, 0.05f, 0.2f, 0.0f);
    }

    public PhotoModePhotoBackgroundGradientConfig(boolean z, boolean z2, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.enable = z;
        this.enableOpt = z2;
        this.selectColorIndex = i;
        this.validHeightPercentage = f;
        this.mergingTolerance = f2;
        this.lightnessAddition = f3;
        this.cLeft = f4;
        this.cRight = f5;
        this.iLeft = f6;
        this.iRight = f7;
        this.strategyThreshold = f8;
    }
}
