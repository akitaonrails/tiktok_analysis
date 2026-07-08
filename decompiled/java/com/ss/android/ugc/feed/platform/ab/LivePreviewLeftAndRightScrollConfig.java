package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class LivePreviewLeftAndRightScrollConfig {

    @C09CT("left_angle")
    public final int leftAngle;

    @C09CT("right_angle")
    public final int rightAngle;

    public LivePreviewLeftAndRightScrollConfig() {
        this(-1, -1);
    }

    public LivePreviewLeftAndRightScrollConfig(int i, int i2) {
        this.leftAngle = i;
        this.rightAngle = i2;
    }
}
