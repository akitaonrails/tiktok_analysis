package com.ss.android.ugc.profile.business.photo.text.photoboost;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class PhotoBoostFeedbackFreqCtrlConfig {
    public static final int $stable = 0;

    @C09CT("click_exit_threshold")
    public final int clickExitThreshold;

    @C09CT("exit_days")
    public final long exitDays;

    @C09CT("interval_ms")
    public final long intervalMs;

    @C09CT("no_click_exit_threshold")
    public final int noClickExitThreshold;

    public PhotoBoostFeedbackFreqCtrlConfig() {
        this(3, 2, 7L, 86400000L);
    }

    public PhotoBoostFeedbackFreqCtrlConfig(int i, int i2, long j, long j2) {
        this.noClickExitThreshold = i;
        this.clickExitThreshold = i2;
        this.exitDays = j;
        this.intervalMs = j2;
    }
}
