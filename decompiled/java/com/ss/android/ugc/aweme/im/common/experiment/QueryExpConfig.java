package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class QueryExpConfig {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("force_clear_enabled")
    public final boolean forceClearEnabled;

    @C09CT("refresh_interval")
    public final int refreshInterval;

    public QueryExpConfig() {
        this(false, 86400, false);
    }

    public QueryExpConfig(boolean z, int i, boolean z2) {
        this.enabled = z;
        this.refreshInterval = i;
        this.forceClearEnabled = z2;
    }
}
