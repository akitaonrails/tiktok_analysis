package com.ss.android.ugc.aweme.lemon.banner;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedBannerLemon8FreqParams {

    @C09CT("circle_interval")
    public final int circleInterval;

    @C09CT("one_circle_unclick_cnt")
    public final int oneCircleUnclickCnt;

    @C09CT("one_day_max_cnt")
    public final int oneDayMaxCnt;

    public FeedBannerLemon8FreqParams() {
        this(3, 7, 7);
    }

    public FeedBannerLemon8FreqParams(int i, int i2, int i3) {
        this.oneDayMaxCnt = i;
        this.oneCircleUnclickCnt = i2;
        this.circleInterval = i3;
    }
}
