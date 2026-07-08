package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class MDPSquarePreloadABSwitchConfig {

    @C09CT("mdp_square_preload_enable")
    public final boolean enable;

    @C09CT("mdp_square_preload_valid_time")
    public final int validTime;

    public MDPSquarePreloadABSwitchConfig() {
        this(false, 5000);
    }

    public MDPSquarePreloadABSwitchConfig(boolean z, int i) {
        this.enable = z;
        this.validTime = i;
    }
}
