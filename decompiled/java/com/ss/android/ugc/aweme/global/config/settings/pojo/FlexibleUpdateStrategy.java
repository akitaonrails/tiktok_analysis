package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public class FlexibleUpdateStrategy {

    @C09CT("interval_days")
    public Integer intervalDays = 0;

    @C09CT("allow_show_all_times")
    public Integer allowShowAllTimes = 0;

    public Integer getAllowShowAllTimes() {
        return this.allowShowAllTimes;
    }

    public Integer getIntervalDays() {
        return this.intervalDays;
    }
}
