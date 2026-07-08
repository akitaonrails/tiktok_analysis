package com.ss.android.ugc.feed.platform.componentmanager.metric.device;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class ScreenConfig {

    @C09CT("small_height_dp")
    public final Integer smallHeightDp;

    @C09CT("small_width_dp")
    public final Integer smallWidthDp;

    public ScreenConfig() {
        this(null, null);
    }

    public ScreenConfig(Integer num, Integer num2) {
        this.smallWidthDp = num;
        this.smallHeightDp = num2;
    }
}
