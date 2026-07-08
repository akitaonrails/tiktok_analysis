package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class NUJAutoRefreshConfig {

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("refresh_index")
    public final int refreshIndex;

    public NUJAutoRefreshConfig() {
        this(false, 0);
    }

    public NUJAutoRefreshConfig(boolean z, int i) {
        this.isEnabled = z;
        this.refreshIndex = i;
    }
}
