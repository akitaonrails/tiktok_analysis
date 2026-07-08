package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class ExposedCommentConfig {

    @C09CT("exit_days")
    public final int exitDays;

    @C09CT("max_appear_times")
    public final int maxAppearTimes;

    @C09CT("max_exit_times")
    public final int maxExitTimes;

    @C09CT("noclick_exit_limit")
    public final int noClickExitLimit;

    @C09CT("trigger_strategy")
    public final int triggerStrategy;

    public ExposedCommentConfig() {
        this(10, 7, 3, 10, 0);
    }

    public ExposedCommentConfig(int i, int i2, int i3, int i4, int i5) {
        this.noClickExitLimit = i;
        this.exitDays = i2;
        this.maxExitTimes = i3;
        this.maxAppearTimes = i4;
        this.triggerStrategy = i5;
    }
}
