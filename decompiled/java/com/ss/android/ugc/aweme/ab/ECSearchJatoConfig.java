package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchJatoConfig {

    @C09CT("enable_jato_optimize")
    public final boolean enableJatoOptimize;

    @C09CT("jato_duration")
    public final long jatoDuration;

    public ECSearchJatoConfig() {
        this(false, 2000L);
    }

    public ECSearchJatoConfig(boolean z, long j) {
        this.enableJatoOptimize = z;
        this.jatoDuration = j;
    }
}
