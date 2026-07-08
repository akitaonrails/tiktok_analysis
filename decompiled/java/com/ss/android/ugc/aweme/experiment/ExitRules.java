package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class ExitRules {

    @C09CT("block_time_window")
    public final TimeWindow blockTimeWindow;

    @C09CT("rule_id")
    public final String ruleId;

    @C09CT("show_times")
    public final Integer showTimes;

    @C09CT("time_window")
    public final TimeWindow timeWindow;

    public ExitRules() {
        this("", null, null, null);
    }

    public ExitRules(String str, TimeWindow timeWindow, Integer num, TimeWindow timeWindow2) {
        this.ruleId = str;
        this.timeWindow = timeWindow;
        this.showTimes = num;
        this.blockTimeWindow = timeWindow2;
    }
}
