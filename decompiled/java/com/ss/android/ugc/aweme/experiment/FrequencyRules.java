package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class FrequencyRules {

    @C09CT("limit")
    public final Integer limit;

    @C09CT("rule_id")
    public final String ruleId;

    @C09CT("time_window")
    public final TimeWindow timeWindow;

    public FrequencyRules() {
        this("", null, null);
    }

    public FrequencyRules(String str, TimeWindow timeWindow, Integer num) {
        this.ruleId = str;
        this.timeWindow = timeWindow;
        this.limit = num;
    }
}
