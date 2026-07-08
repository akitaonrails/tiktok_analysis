package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class Exposure {

    @C09CT("max_exposure_daily")
    public final long maxExposureDaily;

    @C09CT("max_continuous_display")
    public final long maxUnClickExposure;

    public Exposure() {
        this(0L, 0L);
    }

    public Exposure(long j, long j2) {
        this.maxExposureDaily = j;
        this.maxUnClickExposure = j2;
    }
}
