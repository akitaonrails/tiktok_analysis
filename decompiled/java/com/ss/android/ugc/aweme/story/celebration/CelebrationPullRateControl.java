package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationPullRateControl implements Serializable {
    public static final int $stable = 0;

    @C09CT("caller_scene")
    public final int callerScene;

    @C09CT("delay_pull_seconds")
    public final int delayPullSeconds;

    public CelebrationPullRateControl() {
        this(0, 0);
    }

    public CelebrationPullRateControl(int i, int i2) {
        this.callerScene = i;
        this.delayPullSeconds = i2;
    }
}
