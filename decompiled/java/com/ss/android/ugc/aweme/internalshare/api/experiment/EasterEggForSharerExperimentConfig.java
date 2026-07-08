package com.ss.android.ugc.aweme.internalshare.api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class EasterEggForSharerExperimentConfig {

    @C09CT("enable")
    public final int enable;

    @C09CT("exp_version")
    public final int expVersion;

    @C09CT("is_fully_launch")
    public final int isFullyLaunch;

    @C09CT("same_post_enable")
    public final int samePostEnable;

    @C09CT("video_overflow_enable")
    public final int videoOverflowEnable;

    public EasterEggForSharerExperimentConfig() {
        this(0, 0, 0, 0, 0);
    }

    public EasterEggForSharerExperimentConfig(int i, int i2, int i3, int i4, int i5) {
        this.enable = i;
        this.isFullyLaunch = i2;
        this.expVersion = i3;
        this.samePostEnable = i4;
        this.videoOverflowEnable = i5;
    }
}
