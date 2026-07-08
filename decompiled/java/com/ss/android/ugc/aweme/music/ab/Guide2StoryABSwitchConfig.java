package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class Guide2StoryABSwitchConfig {

    @C09CT("disable_threshold")
    public final int disableThreshold;

    @C09CT("duration")
    public final long duration;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("style")
    public final int style;

    public Guide2StoryABSwitchConfig() {
        this(false, 0, 1000L, -1);
    }

    public Guide2StoryABSwitchConfig(boolean z, int i, long j, int i2) {
        this.enable = z;
        this.style = i;
        this.duration = j;
        this.disableThreshold = i2;
    }
}
