package com.ss.android.ugc.aweme.series.commonfeed.component.preload;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class SeriesVideoPreloadExpModel {

    @C09CT("cache_expired_time")
    public final int cacheExpiredTime;

    @C09CT("delay_fetch_duration")
    public final int delayFetchDuration;

    @C09CT("enable")
    public final int enable;

    public SeriesVideoPreloadExpModel() {
        this(0, 0, 120000);
    }

    public SeriesVideoPreloadExpModel(int i, int i2, int i3) {
        this.enable = i;
        this.delayFetchDuration = i2;
        this.cacheExpiredTime = i3;
    }
}
