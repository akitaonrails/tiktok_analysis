package com.ss.android.ugc.aweme.poi.detail.container.newarchi.data;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class TouchPreloadConfig {

    @C09CT("delay_time")
    public final Long delayTime;

    @C09CT("enable")
    public final Integer enable;

    public TouchPreloadConfig() {
        this(null, null);
    }

    public TouchPreloadConfig(Integer num, Long l) {
        this.enable = num;
        this.delayTime = l;
    }
}
