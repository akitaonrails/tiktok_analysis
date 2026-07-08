package com.ss.android.ugc.aweme.network.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ZeroCopyConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("segment_count")
    public final int segmentCount;

    @C09CT("segment_size")
    public final int segmentSize;

    public ZeroCopyConfig() {
        this(false, 8, 2);
    }

    public ZeroCopyConfig(boolean z, int i, int i2) {
        this.enable = z;
        this.segmentSize = i;
        this.segmentCount = i2;
    }
}
