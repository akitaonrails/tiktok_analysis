package com.ss.android.ugc.aweme.performance.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeImgFypPriorityConfig {

    @C09CT("cold_boot_priority")
    public final boolean coldBootPriority;

    @C09CT("delay_init_duration")
    public final long delayDuration;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("change_explore_first_screen_priority")
    public final boolean exploreFirstScreenPriority;

    @C09CT("change_fyp_preload_priority")
    public final boolean fypPreloadPriority;

    public PhotoModeImgFypPriorityConfig() {
        this(false, false, false, false, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public PhotoModeImgFypPriorityConfig(boolean z, boolean z2, boolean z3, boolean z4, long j) {
        this.enable = z;
        this.coldBootPriority = z2;
        this.fypPreloadPriority = z3;
        this.exploreFirstScreenPriority = z4;
        this.delayDuration = j;
    }
}
