package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class FypSlidingToLandingPageConfig {

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("slide_gesture_range")
    public final float slideGestureRange;

    public FypSlidingToLandingPageConfig() {
        this(false, 0.0f);
    }

    public FypSlidingToLandingPageConfig(boolean z, float f) {
        this.isEnable = z;
        this.slideGestureRange = f;
    }
}
