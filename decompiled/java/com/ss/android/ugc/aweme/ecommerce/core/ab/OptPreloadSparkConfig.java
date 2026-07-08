package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OptPreloadSparkConfig {

    @C09CT("load_success_timeout")
    public final int loadSuccessTimeout;

    @C09CT("use_last_chunk")
    public final boolean useLastChunk;

    public OptPreloadSparkConfig() {
        this(false, 0);
    }

    public OptPreloadSparkConfig(boolean z, int i) {
        this.useLastChunk = z;
        this.loadSuccessTimeout = i;
    }
}
