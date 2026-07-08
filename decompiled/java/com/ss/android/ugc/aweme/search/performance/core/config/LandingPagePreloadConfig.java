package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes11.dex */
public final class LandingPagePreloadConfig {

    @C09CT("enable_only_search_jump")
    public final boolean enableOnlySearchJump;

    @C09CT("enable_trigger_after_first_screen")
    public final boolean enableTriggerAfterFirstScreen;

    @C09CT("enable_trigger_when_jump")
    public final boolean enableTriggerWhenJump;

    @C09CT("time_max_preload")
    public final int timeMaxPreload;

    @C09CT("time_trigger_after_first_screen")
    public final long timeTriggerAfterFirstScreen;

    public LandingPagePreloadConfig() {
        this(false, false, false, 400, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public LandingPagePreloadConfig(boolean z, boolean z2, boolean z3, int i, long j) {
        this.enableTriggerAfterFirstScreen = z;
        this.enableTriggerWhenJump = z2;
        this.enableOnlySearchJump = z3;
        this.timeMaxPreload = i;
        this.timeTriggerAfterFirstScreen = j;
    }
}
