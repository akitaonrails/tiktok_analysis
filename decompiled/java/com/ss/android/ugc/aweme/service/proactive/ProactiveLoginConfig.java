package com.ss.android.ugc.aweme.service.proactive;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class ProactiveLoginConfig {

    @C09CT("day_limit_login_panel")
    public final Integer dayLimitLoginPanel;

    @C09CT("decision")
    public final String decision;

    @C09CT("design")
    public final int design;

    @C09CT("min_hours_interval_login_panel")
    public final Integer minHoursIntervalLoginPanel;

    @C09CT("vv")
    public final int vv;

    public ProactiveLoginConfig(String str, int i, int i2, Integer num, Integer num2) {
        this.decision = str;
        this.design = i;
        this.vv = i2;
        this.minHoursIntervalLoginPanel = num;
        this.dayLimitLoginPanel = num2;
    }
}
