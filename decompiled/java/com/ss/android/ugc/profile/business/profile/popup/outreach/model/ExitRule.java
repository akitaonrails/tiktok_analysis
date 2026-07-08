package com.ss.android.ugc.profile.business.profile.popup.outreach.model;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class ExitRule {

    @C09CT("active_strategy_type")
    public final Integer activeStrategyType;

    @C09CT("count")
    public final Integer count;

    @C09CT("rule_id")
    public final String ruleId;

    @C09CT("time_interval")
    public final Long timeInterval;

    public ExitRule() {
        this(null, null, null, null);
    }

    public ExitRule(String str, Integer num, Long l, Integer num2) {
        this.ruleId = str;
        this.activeStrategyType = num;
        this.timeInterval = l;
        this.count = num2;
    }
}
