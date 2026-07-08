package com.ss.android.ugc.profile.business.profile.popup.outreach.model;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class EnterExitRuleInfo {

    @C09CT("enter_exit_time")
    public final Long enterExitTime;

    @C09CT("exit_rule")
    public final ExitRule exitRule;

    public EnterExitRuleInfo() {
        this(null, null);
    }

    public EnterExitRuleInfo(ExitRule exitRule, Long l) {
        this.exitRule = exitRule;
        this.enterExitTime = l;
    }
}
