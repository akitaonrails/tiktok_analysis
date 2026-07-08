package com.ss.android.ugc.aweme.affinity.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class AffinityConfig {

    @C09CT("enable_affinity_service")
    public final boolean enable;

    @C09CT("request_time_interval")
    public final long expireTime;

    public AffinityConfig() {
        this(true, 86400L);
    }

    public AffinityConfig(boolean z, long j) {
        this.enable = z;
        this.expireTime = j;
    }
}
