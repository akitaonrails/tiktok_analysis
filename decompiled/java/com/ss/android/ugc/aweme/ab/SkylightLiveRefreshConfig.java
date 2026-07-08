package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightLiveRefreshConfig {

    @C09CT("follow_enable")
    public final boolean followEnable;

    @C09CT("inbox_enable")
    public final boolean inboxEnable;

    @C09CT("refresh_interval")
    public final int refreshInterval;

    public SkylightLiveRefreshConfig() {
        this(false, false, 180);
    }

    public SkylightLiveRefreshConfig(boolean z, boolean z2, int i) {
        this.inboxEnable = z;
        this.followEnable = z2;
        this.refreshInterval = i;
    }
}
