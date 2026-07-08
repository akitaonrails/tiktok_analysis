package com.ss.android.ugc.aweme.outreach.dispersion.ab;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class FetchNetworkConfig implements Serializable {

    @C09CT("retry_times")
    public final int retry;

    @C09CT("timeout")
    public final int timeout;

    public FetchNetworkConfig() {
        this(3, 1);
    }

    public FetchNetworkConfig(int i, int i2) {
        this.timeout = i;
        this.retry = i2;
    }
}
