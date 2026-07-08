package com.ss.android.ugc.aweme.hybridkit.forest;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ForestSecurityStrategy {

    @C09CT("allow_evict")
    public boolean allowUntrustedZone;

    public ForestSecurityStrategy() {
        this(false);
    }

    public ForestSecurityStrategy(boolean z) {
        this.allowUntrustedZone = z;
    }
}
