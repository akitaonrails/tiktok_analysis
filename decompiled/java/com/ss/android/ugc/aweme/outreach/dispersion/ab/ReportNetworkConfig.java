package com.ss.android.ugc.aweme.outreach.dispersion.ab;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class ReportNetworkConfig implements Serializable {

    @C09CT("retry_times")
    public final int retry;

    @C09CT("timeout")
    public final int timeout;

    public ReportNetworkConfig() {
        this(10, 1);
    }

    public ReportNetworkConfig(int i, int i2) {
        this.timeout = i;
        this.retry = i2;
    }
}
