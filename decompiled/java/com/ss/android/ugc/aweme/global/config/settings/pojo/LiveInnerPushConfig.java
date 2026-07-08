package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public class LiveInnerPushConfig {

    @C09CT("live_push_display_intervals")
    public Integer livePushDisplayIntervals;

    @C09CT("live_push_display_unclicked_most_times")
    public Integer livePushDisplayUnclickedMostTimes;

    @C09CT("live_push_most_display_times")
    public Integer livePushMostDisplayTimes;

    public Integer getLivePushDisplayIntervals() {
        return this.livePushDisplayIntervals;
    }

    public Integer getLivePushDisplayUnclickedMostTimes() {
        return this.livePushDisplayUnclickedMostTimes;
    }

    public Integer getLivePushMostDisplayTimes() {
        return this.livePushMostDisplayTimes;
    }

    public LiveInnerPushConfig(Integer num, Integer num2, Integer num3) {
        this.livePushMostDisplayTimes = 3;
        this.livePushDisplayUnclickedMostTimes = 3;
        this.livePushMostDisplayTimes = num;
        this.livePushDisplayUnclickedMostTimes = num2;
        this.livePushDisplayIntervals = num3;
    }
}
