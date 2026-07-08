package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class PlayerControllerFpsOptConfig {

    @C09CT("opt_play_helper_config")
    public final boolean optPlayHelperConfig;

    @C09CT("preload_controller_config")
    public final boolean preloadControllerConfig;

    @C09CT("prepare_check_size_opt")
    public final boolean prepareCheckSizeOpt;

    @C09CT("resume_screen_state_opt")
    public final boolean resumeScreenStateOpt;

    public PlayerControllerFpsOptConfig() {
        this(false, false, false, false);
    }

    public PlayerControllerFpsOptConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.optPlayHelperConfig = z;
        this.preloadControllerConfig = z2;
        this.resumeScreenStateOpt = z3;
        this.prepareCheckSizeOpt = z4;
    }
}
