package com.ss.android.ugc.aweme.inbox.banner.model;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxBannerFrequencyControlData {

    @C09CT("count")
    public final Integer count;

    @C09CT("rule_id")
    public final String ruleId;

    @C09CT("time_interval")
    public final Integer timeInterval;

    public InboxBannerFrequencyControlData() {
        this(null, null, null);
    }

    public InboxBannerFrequencyControlData(String str, Integer num, Integer num2) {
        this.ruleId = str;
        this.timeInterval = num;
        this.count = num2;
    }
}
