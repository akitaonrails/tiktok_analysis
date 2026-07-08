package com.ss.android.ugc.profile.business.profile.popup.outreach.model;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class FrequencyRule {

    @C09CT("count")
    public final Integer count;

    @C09CT("rule_id")
    public final String ruleId;

    @C09CT("time_interval")
    public final Long timeInterval;

    public FrequencyRule() {
        this(null, null, null);
    }

    public FrequencyRule(String str, Long l, Integer num) {
        this.ruleId = str;
        this.timeInterval = l;
        this.count = num;
    }
}
