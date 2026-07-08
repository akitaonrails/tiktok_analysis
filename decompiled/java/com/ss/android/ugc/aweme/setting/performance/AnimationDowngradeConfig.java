package com.ss.android.ugc.aweme.setting.performance;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class AnimationDowngradeConfig {

    @C09CT("animation_close_lower_device_score")
    public final float animationCloseLowerDeviceScore;

    @C09CT("animation_close_lowest_device_score")
    public final float animationCloseLowestDeviceScore;

    @C09CT("animation_curve_opt")
    public final int animationCurveOpt;

    @C09CT("resource_animation_lower_device_score")
    public final float resourceAnimationCloseLowestDeviceScore;

    public AnimationDowngradeConfig() {
        this(0, -1.0f, -1.0f, -1.0f);
    }

    public AnimationDowngradeConfig(int i, float f, float f2, float f3) {
        this.animationCurveOpt = i;
        this.animationCloseLowerDeviceScore = f;
        this.animationCloseLowestDeviceScore = f2;
        this.resourceAnimationCloseLowestDeviceScore = f3;
    }
}
