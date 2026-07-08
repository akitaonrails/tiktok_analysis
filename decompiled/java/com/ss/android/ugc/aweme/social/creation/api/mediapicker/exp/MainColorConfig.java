package com.ss.android.ugc.aweme.social.creation.api.mediapicker.exp;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class MainColorConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("c_left")
    public final float cLeft;

    @C09CT("c_right")
    public final float cRight;

    @C09CT("crop_h")
    public final float cropH;

    @C09CT("crop_w")
    public final float cropW;

    @C09CT("crop_x")
    public final float cropX;

    @C09CT("crop_y")
    public final float cropY;

    @C09CT("i_left")
    public final float iLeft;

    @C09CT("i_right")
    public final float iRight;

    @C09CT("lightness_addition")
    public final float lightnessAddition;

    @C09CT("merging_tolerance")
    public final int mergingTolerance;

    @C09CT("strategy_threshold")
    public final float strategyThreshold;

    public MainColorConfig() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public MainColorConfig(float f, float f2, float f3, float f4, int i, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.cropX = f;
        this.cropY = f2;
        this.cropW = f3;
        this.cropH = f4;
        this.mergingTolerance = i;
        this.lightnessAddition = f5;
        this.cLeft = f6;
        this.cRight = f7;
        this.iLeft = f8;
        this.iRight = f9;
        this.strategyThreshold = f10;
    }
}
