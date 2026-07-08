package com.ss.android.ugc.aweme.inbox.banner.model;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxBannerExitStrategyData {

    @C09CT("active_strategy_type")
    public final Integer activeStrategyType;

    @C09CT("count")
    public final Integer count;

    @C09CT("rule_id")
    public final String ruleId;

    @C09CT("time_interval")
    public final Integer timeInterval;

    public InboxBannerExitStrategyData() {
        this(null, null, null, null);
    }

    public InboxBannerExitStrategyData(String str, Integer num, Integer num2, Integer num3) {
        this.ruleId = str;
        this.activeStrategyType = num;
        this.timeInterval = num2;
        this.count = num3;
    }
}
