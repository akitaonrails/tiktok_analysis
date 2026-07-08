package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedAngleSlideConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("left_angle")
    public final int leftAngle;

    @C09CT("right_angle")
    public final int rightAngle;

    @C09CT("vertical_angle")
    public final int verticalAngle;

    public FeedAngleSlideConfig() {
        this(false, -1, -1, 30);
    }

    public FeedAngleSlideConfig(boolean z, int i, int i2, int i3) {
        this.enable = z;
        this.leftAngle = i;
        this.rightAngle = i2;
        this.verticalAngle = i3;
    }
}
