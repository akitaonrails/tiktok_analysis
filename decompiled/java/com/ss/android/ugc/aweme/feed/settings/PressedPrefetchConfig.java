package com.ss.android.ugc.aweme.feed.settings;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class PressedPrefetchConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("first_wait_time")
    public final int firstWaitTime;

    @C09CT("second_wait_time")
    public final int secondWaitTime;

    @C09CT("touch_slop_ratio")
    public final int touchSlopRatio;

    public PressedPrefetchConfig() {
        this(0, 0, 1);
    }

    public PressedPrefetchConfig(int i, int i2, int i3) {
        this.firstWaitTime = i;
        this.secondWaitTime = i2;
        this.touchSlopRatio = i3;
    }
}
