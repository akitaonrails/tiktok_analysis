package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class ReCreateFeedExperimentsConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("include_live")
    public final boolean includeLive;

    @C09CT("recreate_on_background")
    public final boolean recreateOnBackground;

    @C09CT("reuse_count")
    public final int reuseCount;

    @C09CT("seek_position")
    public final boolean seekPosition;

    public ReCreateFeedExperimentsConfig() {
        this(false, false, 4, true, true);
    }

    public ReCreateFeedExperimentsConfig(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        this.enable = z;
        this.seekPosition = z2;
        this.reuseCount = i;
        this.recreateOnBackground = z3;
        this.includeLive = z4;
    }
}
